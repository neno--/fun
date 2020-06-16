(ns fun.specialForms.fn)

; fn creates an unnamed function, ready to be evaluated inline. it uses let's binding vector and can destructure.
; it also uses do's semantics in the fn's body

(fn [bindings] (println "just like do" bindings))

; so this needs to be evaluated to do something

((fn [bindings] (println "just like do" bindings)) "HELLO")

; it is possible to have multiple arity versions

; also we can store it in a symbol

(def PRINTLN (fn [x] (println (clojure.string/upper-case x))))
(PRINTLN "hello")

; fixme: this fails
;(PRINTLN "hello" "how" "are")

; that needs variadic (rest arguments or varargs) handling:

(def variadicTest (fn [arg & rest] (println arg rest)))
(def variadicTest1 (fn [arg & rest] (apply println arg rest)))

(variadicTest "hello" "how" "are")
(variadicTest1 "hello" "how" "are")

; keyword arguments, provide default values

; function literals

(#(println %) "test")

(println (quote #(println %)))
