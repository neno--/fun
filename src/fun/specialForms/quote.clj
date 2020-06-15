(ns fun.specialForms.quote)

; suppressing evaluation with quote -
; symbols evalute to themselves

(println (quote x))

; data structures can also be quoted, which suppresses recursive evaluation of its elements

(println (quote (xyz11 12 13 14)))
(println (quote (xyz11 12 (foo_bar) 14)))

; lets go meta

(println (quote 'x))

; this can be used to see the ingredients of particular sugar

(println (quote `(a)))