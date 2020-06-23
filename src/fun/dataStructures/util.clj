(ns fun.dataStructures.util)

; COUNT
(println (count '(1 2 3)))

; RANGE
(println (range 5))

; CONTAINS
(println (contains? [1, 2, 23, [1, [23]]] [23]))

; ASSOC
(println (assoc [1 2 3] 3 "HAHA"))

; DISSOC - does not work on vectors
; (println (dissoc [1 2 3] 0))

; Merge
(println (merge [1 2 3] \A \B \C))

;get
(println (get [1 2 3] 0))
(println (get '(1 2 3) 0))                                  ; returns NIL on lists

; pop and peek - returns different things for lists and arrays
; throws exception for maps
(println (pop [1 2 3]))