(ns fun.dataStructures.abstractions.seqs.seq)

; SEQ is something that implements ISeq interface
; lists and vectors are NOT seqs themselves

; here seqs are created from existing data structures

(println (= (seq '(1 2 3)) [1 2 3]))

(println (type '(1 2 3)))                                   ; persistent list
(println (type (seq '(1 2 3))))                             ; persistent list

(println (type [1 2 3]))                                    ; persistent vector
(println (type (seq [1 2 3])))                              ; chunked sequence

(println (= (seq '(1 2 3)) (seq [1 2 3])))                  ; true? but they are of different types...

; first and rest functions call seq on their arguments, for performance reasons
(println (type (rest '(1 2 3))))
(println (type (rest [1 2 3])))

; CONS - a list like data structure
; holds a value and references another sequence ISeq

; next, like rest, but at the end returns NIL an not an empty sequence
(println (rest []))
(println (next []))

; nth like get, but throws out of bounds exception or you can supply a default value
(println (get [1 2 3] 3))
(println (nth [1 2 3] 3 "java.lang.IndexOutOfBoundsException"))

; apply
(apply println "hello" "world" ["from" "clojure"])

; map - maps until shortest is exhausted - returns LAZY sequence
(println (map + [1 2 3] [10 10]))

; reduce & reductions (intermediate results)
(println (reduce + [1 2 3]))
(println (reductions + [1 2 3]))

; filter and remove
(println (filter (fn [dont_care] true) [1 2 3]))
(println (remove (fn [dont_care] false) [1 2 3]))
