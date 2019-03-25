(ns v7-02-esimerkit.core
  (:gen-class))


(def nimi "Milla")
nimi
; => "Milla"

(let [nimi "Petri"]
  nimi)
; => "Petri"

nimi
; => "Milla"


(defn sum
  ([vals] (sum vals 0)) 
  ([vals accumulating-total]
   (if (empty? vals)  
     accumulating-total
     (sum (rest vals) (+ (first vals) accumulating-total)))))

(sum [39 5 1]) ; single-arity body calls two-arity body
(sum [39 5 1] 0)
(sum [5 1] 39)
(sum [1] 44)
(sum [] 45) ; base case is reached, so return accumulating-total
; => 45

(defn sum
  ([vals]
   (sum vals 0))
  ([vals accumulating-total]
   (if (empty? vals)
     accumulating-total
     (recur (rest vals) (+ (first vals) accumulating-total)))))


(def finc* (comp inc *)) 

(def pelihahmo
  {:nimi "Hugo"
   :attribuutit {:alykkyys 10
                :voima 4
                }})
(def hahmon-aly (comp :alykkyys :attribuutit))
(def hahmon-voima (comp :voima :attribuutit))


(:nimi pelihahmo)
; => "Hugo"
(:attribuutit pelihahmo) 
; => {:alykkyys 10 :voima 4}
(hahmon-aly pelihahmo)
; => 10
(hahmon-voima pelihahmo)
; => 4


(defn unelias-identity
  "Returns the given value after 1 second"
  [x]
  (Thread/sleep 1000)
  x)

(unelias-identity "Herra Huu")
; => "Herra Huu" 1 sekunnin viiveellä

(unelias-identity "Herra Huu")
; =>  "Herra Huu" 1 sekunnin viiveellä

(def memo-unelias-identity (memoize unelias-identity))
(memo-unelias-identity "Herra Huu")
; => "Herra Huu" 1 sekunnin viiveellä

(memo-unelias-identity "Herra Huu")
; => "Herra Hu" heti


(def maki (fn[k-piste lisapisteet pituus]
    (+ (* (- pituus k-piste) lisapisteet ) 60)))
(apply (comp str min) 
    (filter #(> % 100)
    (map(partial maki 90 1.8) [100 120 150])
))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))


