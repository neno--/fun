(ns fun.dataStructures.abstractions.associative)

; data structures that link keys and values in some way

(println (associative? [1 2 3]))

; strange stuff
(println (assoc [1 2 3] 3 4 ))

; maps are a more natural fit
(println (assoc {:key 123} :another 334))

; dissoc
(println (dissoc {:key 123} :another :key))

; also GET
; because vector is a function that defines a mapping between index and the value
(println (get [1 2 3] 0))