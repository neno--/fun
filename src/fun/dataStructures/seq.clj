(ns fun.dataStructures.seq)

; SEQ is something that implements ISeq interface
; lists and vectors are NOT seqs themselves

(println (= (seq '(1 2 3)) [1 2 3]))

(println (type '(1 2 3)))                                   ; persistent list
(println (type (seq '(1 2 3))))                             ; persistent list

(println (type [1 2 3]))                                    ; persistent vector
(println (type (seq [1 2 3])))                              ; chunked sequence

(println (= (seq '(1 2 3)) (seq [1 2 3])))                  ; true? but they are of different types...

; first and rest functions call seq on their arguments, for performance reasons
(println (type (rest '(1 2 3))))
(println (type (rest [1 2 3])))