(ns fun.hof)

; built-in higher order functions

; map - applies a function to every pair of vector elements
(println (map * [1 2 3] [2 2 2]))

(map println ["test"])                                      ; why I don't see output of this? - oh it's lazy... meaning I need to use it...

(def result (map println ["test"]))

(println (quote result) "what about this")                  ;todo: still don't know how to invoke it properly

; reduces - produces a values from a collection

(println (reduce max [0 -3 10 48]))

; provide initial value to seed the reduction

(println (reduce + 50 [1 2 3 4]))

; function application

(apply (fn [x] (println (inc x))) `(77))

; is the same as

((fn [x] (println (inc x))) 77)

;todo: partial application and composition