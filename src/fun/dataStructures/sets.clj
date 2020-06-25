(ns fun.dataStructures.sets)

; say hello to mr set
(println #{1 2 3})
(println (set (repeat 10 1)))                               ; just one element? interesing...
(println (list (repeat 10 1)))                              ; of course it is just one element, it is the set...

; sets are sequable
(println (nth (seq #{1 2 3}) 1))                            ; return 3 :) - implementation specific