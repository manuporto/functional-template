(ns exercise2)

(defn only-greater-than-five
  "Filters list, keeping only the elements with values greater than five."
  [x]
  (filter
    (fn [y]
      (if (> y 5)
            y))
    x))