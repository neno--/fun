(ns fun.specialForms.let)

; let defines locals aka local bindings or "particular values are said to be let bound".

(defn someFn [a b] (let [c (+ a b)] (println c)))
(someFn 1 2)

; https://clojuredocs.org/clojure.core/let

; basic use for let

 (println (let [x 1] x))

; perhaps there are several expressions
; if last expression here is not 44 but println, return would be nill

(println (let [x 100] (println x) (println (inc x)) 44))

; rebinding and purposefully ignoring a value

(let [ location 12 _ (println location) location (inc location) _ (println location)])

; todo perhaps revisit destructuring sometime later



