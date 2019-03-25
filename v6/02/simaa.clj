(def file "sima.csv") 
 
(def aineet [:aines :yksikko :maara])

(defn str->int
  [str]
  (Integer. str))

(def konversiot {:aines identity
                 :yksikko identity
                 :maara str->int})

(defn konvertoi 
  [avain arvo]
  ((get konversiot avain) arvo))



(defn parse 
  "parse tuottaa merkkijonovektoreita:['Vesi' 'litraa' '10'] jne."
  [string]
  (map #(clojure.string/split % #",")
       (clojure.string/split string #"\n")))

     
(defn tee-mappeja 
  "tuottaa merkkijonovektoreista mappeja seq-peräkkäisrakenteeksi"
  [merkkijonovektoreista]
  (map (fn [merkkijonovektori]  ; anonyymifunktio on mapin 1. arg
            (reduce (fn [uusi-map [avain arvo]]  ; uusi-map on alussa tyhjä map
               (assoc uusi-map avain (konvertoi avain arvo)) ; (assoc map key val) 
            )
            {}  ; reducen 2. arg alussa tyhjä map
            (map vector aineet merkkijonovektori)) ; reducen 3. arg tuottaa seq:n avain-arvo -vektoreita
        )
        merkkijonovektoreista) ; funktion arg = map-funktion 2. arg (luettu tiedostosta)
)
  

(tee-mappeja (parse (slurp file)))

(def omasima (tee-mappeja (parse (slurp file))))
;(println omasima)
           
(def pullosima (apply vector omasima)) 
(vector? pullosima) ;=> true

