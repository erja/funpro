(vec (range 10)) 
;=> [0 1 2 3 4 5 6 7 8 9]

(let [my_vector[:a :b]]
  (into my_vector (range 10)))
; => [:a :b 0 1 2 3 4 5 6 7 8 9]

(let [my-vector [:a :b :c]] my-vector)
;=> [:a :b :c]

(map identity [:vesi :sitruuna :sokeri]) ;=> (:vesi :sitruuna :sokeri)

(into [] (map identity [:vesi :sitruuna :sokeri])) ;=> [:vesi :sitruuna :sokeri]

(let [simapohja [:vesi :sitruuna :sokeri]] 
  (into simapohja [:hiiva])) ;=> [:vesi :sitruuna :sokeri :hiiva]


(def sima (let [simapohja [:vesi :sitruuna :sokeri]] 
  (into simapohja [:hiiva]))) ; => #'user/sima
sima ; => [:vesi :sitruuna :sokeri :hiiva]


(def simapohja [:vesi :sitruuna :sokeri]) 
simapohja
;=> [:vesi :sitruuna :sokeri]
(def sima (into simapohja [:hiiva]))
sima
;=> [:vesi :sitruuna :sokeri :hiiva]

(into (vector-of :int) [1.5 2 Math/PI 3.9 4.01])
;=> [1 2 3 3 4]


(def sima-ainekset(into #{} sima)) ;=> #'user/sima-ainekset
sima-ainekset ;=> #{:vesi :sokeri :hiiva :sitruuna}

(contains? sima-ainekset :hiiva) ;=> true

(def sima-ainekset-ordered (apply sorted-set sima)) ;=> #'user/sima-ainekset-ordered
sima-ainekset-ordered ;=> #{:hiiva :sitruuna :sokeri :vesi}


(def maki (fn[k lisa x] (+ (* (+ x (* -1 k)) lisa ) 60))) 
(maki 90 1.8 100)
;=> 78.0

(def lahti90 (partial maki 90 1.8))
(lahti90 100)
;=> 78.0

(defn teini? 
  [ika]
  (and (< ika 20 )
       (>= ika 13 )))
     
(def not-teini? (complement teini?))

(teini? 20) ; => false
     
(+ 10 3) ;=> 13

(def add10 (partial + 10))
(add10 3) ; => 13

(defn adder
  [x]
  (fn[y] (+ y x)))

 (def adder10 (adder 10))
 
 (adder10 2) ; => 12


(defn adderi
  [x]
  #(+ x %))

(def adderi10 (adderi 10))
 
(adderi10 2) ; => 12
 
 



(def my-set #{:1 :2})
(get my-set :1)


(def my-vec [1 2])
(my-vec 0)
