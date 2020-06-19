(ns fun.dataStructures.list)

; singly linked, only efficient when modified at their head
; lists are ordered

(println '(1 2 3))
(println (list 1 2 3))

; valid because function element is missing
(def my_empty ())                                           ; this is not method invocation

; this would fail
;(def not_empty (1))

; can be counted

(println "count:" (count (list 1 2 3)))

(def my_list `(1 2 3 4 5 6 7))
(println my_list)

; adding to the list is only efficient when adding from the head - from the left
; conjoining happens at the beginning
; conj works differently for different concrete type
(def list1 (conj my_list 8))
(println "list1" list1)

(pop '(1 2 3))
(pop (list 1 2 3))

; we can't do this because of cons
(println "pop list1" (pop (list list1)))

(println (type '(1 2 3)))
(println (type (list 1 2 3)))
(println (type my_list))
(println (type list1))

; Lists are not indexed so they must be walked using first and rest.

(println (first '(1 2 3)))
(println (rest '(1 2 3)))

; peek and pop

(println (peek '(1 2 3 4 5)))
(println (pop '(1 2 3 4 5)))
