(ns fun.dataStructures.vectors)

; vectors are ordered

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

; find max element with loop
(defn find-max-loop [_elements]
  ((fn [[first & rest] max]
     (if (empty? rest) (if (> first max) first max) (if (> first max) (recur rest first) (recur rest max))))
   (rest _elements) (first _elements)))

(println (find-max-loop [1 3 6 3 4 10 2]))