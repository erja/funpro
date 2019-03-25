(ns condp-testi.core
  (:gen-class))

(defn -main
  []
  (print "Enter a number: ")
  (flush) ; stays in a buffer otherwise
  (let [line (read-line)
        value (try
                (Integer/parseInt line)
              (catch NumberFormatException e line))] ; paluuarvona line
    (println
      (condp = value
        1 "one"
        2 "two"
        3 "three"
        (+ 3 1) "neljä"
        (str "unexpected value, \"" value \")))
    (println
      (condp instance? value
      Number (* value 2)
      String (* (count value) 2))
    )
  )
)
