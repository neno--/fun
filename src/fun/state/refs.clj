(ns fun.state.refs)

; ref cannot change itself, it can be changed implicitly via alter or commute or ref-set
; used for coordinated synchronous changes

(defn n-times [n f]
  (loop [i n]
    (when (> i 0)
      (println "iteration " (- n i))
      (f)
      (recur (dec i)))
    ))

(defn verbose-mutate [a b]
  (dosync (when (pos? @b)
            (alter a inc)
            (alter b dec)
            (println "altering" @a @b)))
  )

(def a (ref 1))
(def b (ref 5))

;(n-times 10 #(swap! a verbose-inc))
(future (n-times 10 #(verbose-mutate a b)))
(future (n-times 10 #(verbose-mutate a b)))
(future (n-times 10 #(verbose-mutate a b)))
