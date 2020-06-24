(ns fun.excersises.fizzbuzz)

; Write a program that prints the numbers from 1 to 100.
; But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz".
; For numbers which are multiples of both three and five print "FizzBuzz".

(loop [n 1 fizz 1 buzz 1]
  (def output "")
  (if (= fizz 3)
    (do (def output "Fizz")
        (def next-fizz 1))
    (def next-fizz (inc fizz)))
  (if (= buzz 5)
    (do (def output (str output "Buzz"))
        (def next-buzz 1))
    (def next-buzz (inc buzz)))
  (if (= output "")
    (println n)
    (println output))
  (if (< n 100)
    (recur (inc n) next-fizz next-buzz))
  )