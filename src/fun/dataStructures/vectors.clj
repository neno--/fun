(ns fun.dataStructures.vectors)

; vectors are ordered
; implemented as trees - leaf nodes are data nodes. up to 32 children.
; vector is a function that maps to its index.
; therefore, assoc and dissoc

(println [1 2 3 4])
(println (vector 1 2 3 4))

(println (get [1 2 3 4] 0))

; can be counted
(println "count:" (count [1 2 3]))

; adding elements
(println (conj [1 2 3 4] 5 6 7))

; vector vs list vs CONJ
(println (conj [1 2 3] 4))
(println (conj '(1 2 3) 4))

; vector as a single argument
(println (vector (range 3)))
(println (vec (range 3)))

; first and rest works
(println (first [1 2 3]))
(println (rest [1 2 3]))

; find max element in vector with reduce
(defn find-max [elements]
  (reduce (fn [first second]
            (if (> first second) first second)) elements))

(println (find-max [1 3 6 3 4 10 2]))

; find max element with tail recursion
(defn find-max-tail [_elements]
  ((fn [[first & rest] max]
     (if (empty? rest) (if (> first max) first max) (if (> first max) (recur rest first) (recur rest max))))
   (rest _elements) (first _elements)))

(println (find-max-tail [1 3 6 3 4 10 2]))

; factorial with reduce
(defn fact [x]
  (cond
    (= x 0) 1
    :else (reduce (fn [prev next] (* prev next)) (range 1 (+ x 1)))))

(println (fact 0))
(println (fact 1))
(println (fact 5))

; factorial with (head?) recursion

(defn fact-recur [x]
  (cond
    (= x 0) 1
    :else (* x (fact-recur (dec x)))))

(println (fact-recur 0))
(println (fact-recur 1))
(println (fact-recur 5))

(defn fact-loop [n]
  (loop [x n result 1]
    (cond
      (= x 0) result
      (= x 1) result
      :else (recur (dec x) (* result x)))))

(println (fact-loop 0))
(println (fact-loop 1))
(println (fact-loop 5))