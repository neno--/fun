(ns fun.state.atoms)

; atom cannot change itself, it can be changed implicitly via reset or swap
; instead of refs consider using atom with a map
; used for independent synchronous changes

(defn n-times [n f]
  (loop [i n]
    (when (> i 0)
      ;(println "iteration " (- n i))
      (f)
      (recur (dec i)))
    ))

(defn verbose-inc [a]
  (println "before INC" a)
  (inc a))

(def a (atom 1))

;(n-times 10 #(swap! a verbose-inc))
(future (n-times 10 #(swap! a verbose-inc)))
(future (n-times 10 #(swap! a verbose-inc)))
(future (n-times 10 #(swap! a verbose-inc)))