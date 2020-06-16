(ns fun.specialForms.if)

; Truth is anything other than false or nil

(println (if true "true" "false"))
(println (if nil "true" "false"))
(println (if "hello" "true" "false"))
(println (if [] "true" "false"))
(println (if false "true" "false"))
(println (if (fn [] (println "hi")) "true" "false"))        ; this is true
(println (if ((fn [] (println "hi"))) "true" "false"))      ; this is false

; when returns nil when false

(when true
  (println "just like")
  (println "do is doing")
  42)

; cond is like a smart switch

(println (let [x 4]
           (cond
             4 "it is 4"
             (> x 5) "larger than five"
             :else 42)))

; unrelated to conditionals - these evaluate only boolean values

(println (true? nil))
(println (false? nil))