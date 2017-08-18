(ns exercise3)

(defn fibonacci
  [x]
  (cond
    (= x 0) 0
    (< x 3) 1
    :else (+ (fibonacci (- x 1)) (fibonacci (- x 2)))
    ))