(ns fun.dataStructures.lazy)

; lazy sequence is generated only when needed

; range
(println (range 10))
(println (type (range 10)))

; repeat
(println (repeat 10 1))
(println (type (repeat 10 1)))

; repeatedly
(defn for-repeatedly []
  (println "doing work")
  1)
(println (repeatedly 10 for-repeatedly))

; iterate AD INFINITUM
(defn for-iterate [x]
  (println "doing work for" x)
  (inc x))

;(println (iterate for-iterate 10))
(def iterate-lazy (iterate for-iterate 10))

(println (get iterate-lazy 10))                             ; unsupported
(println (first (rest iterate-lazy)))

; cycle
(println (type (cycle '(1 2 3))))

; programmatically creating a lazy sequence

(defn this-is-lazy [] (cons 1 '(2 3 4)))
(println (first (this-is-lazy)))
(println (first (rest (this-is-lazy))))

(defn this-is-lazy-2 [] (cons 1 (this-is-lazy-2)))
;(println (first (this-is-lazy-2)))
;(println (first (rest (this-is-lazy-2))))
; this will actually produce a stack overflow

; this is why you need a macro to create infinite seq generator
; A MACROOOOO

(defn this-is-lazy-3 [] (cons 1 (lazy-seq (this-is-lazy-3))))
(println (first (this-is-lazy-3)))
(println (first (rest (this-is-lazy-3))))

(defn this-is-lazy-4 [x] (cons x (lazy-seq (this-is-lazy-4 (inc x)))))
(println (first (this-is-lazy-4 5)))
(println (first (rest (this-is-lazy-4 5))))