(ns fun.specialForms.def)

; defines or redefines a var with an optional value

(println (def p "foo"))

; returns #'fun.specialForms.def/p

; Many other forms implicitly create or redefine vars, and therefore use def internally. It
; is customary for such forms to be prefixed with “def,” such as defn, defn-, defproto
; col, defonce, defmacro, and so on.

; Unfortunately not all forms that start with “def” create or redefine
; vars. Examples of the latter include deftype, defrecord, and defmethod.