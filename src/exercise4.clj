(ns exercise4)

(defn summary
  "Returns the summary of a vector of numbers"
  [x]
  (reduce + x))