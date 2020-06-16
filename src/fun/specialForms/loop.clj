(ns fun.specialForms.loop)

; all loops loop around loop and recur

(loop [x 5]
  (if (= x 0)
    (println "done")
    (do
      (println "getting there " x)
      (recur (dec x)))))

; prefer higher level looping constructs where applicable.

; recursive implementation of factorial
; can't use recur because function is not called from tail position

(def fac (fn [x]
           (cond
             (= x 0) 1
             (= x 1) 1
             :else (* x (fac (dec x)))
             )
           )
  )

(println (fac 5))