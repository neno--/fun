(ns fun.specialForms.others)

; referring to vars

(def x 1)

(println x)                                                 ; outputs 1
(println (var x))                                           ; outputs #'fun.specialForms.others/x

; TODO: java interop . and new

; TODO: exception handling try and throw

; TODO: mutation with set!

; TODO: primitive locking