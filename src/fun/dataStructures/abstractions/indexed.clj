(ns fun.dataStructures.abstractions.indexed)

(println (indexed? [1 2 3]))

; nth works only for numeric index. works also for lists and seqs
(println (nth '(1 2 3) 0))