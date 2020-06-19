(ns fun.dataStructures.vectors)

; vectors are ordered

(println [1 2 3 4])
(println (vector 1 2 3 4))

(println (get [1 2 3 4] 0))

; can be counted

(println "count:" (count [1 2 3]))

; adding elements

(println (conj [1 2 3 4] 5 6 7))