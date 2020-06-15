(ns fun.specialForms.do)

; evaluates all expressions is order and returns the last expressions value as its value

(println (do
           (println "hi")
           (+ 1 2 3)))

; Note that many other forms (including fn, let, loop, and try—and any derivative of
; these, such as defn) wrap their bodies in an implicit do expression, so that multiple
; inner expressions can be evaluated.