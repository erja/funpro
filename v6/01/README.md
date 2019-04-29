# viikko 6 01

Viikon 6 torstain materiaalia.

# Clojuren ydinfunktioita


1. Oletetaan, että Helsingin kuukausittaiset keskilämpötilat vuodelta 2016 ja 2015 ovat taulukoissa. Tuota uusi taulukko, jossa on kahden vuoden kuukausittaiset keskiarvot. Siivilöi taulukosta positiiviset kuukausikeskiarvot ja laske niistä keskilämpötila.

2. Määritellään nestepäiväkirjaa eri päiville seuraavasti:
```
 (def food-journal
  [{:kk 3 :paiva 1 :neste 5.3 :vesi 2.0}
   {:kk 3 :paiva 2 :neste 5.1 :vesi 3.0}
   {:kk 3 :paiva 13 :neste 4.9 :vesi 2.0}
   {:kk 4 :paiva 5 :neste 5.0 :vesi 2.0}
   {:kk 4 :paiva 10 :neste 4.2 :vesi 2.5}
   {:kk 4 :paiva 15 :neste 4.0 :vesi 2.8}
   {:kk 4 :paiva 29 :neste 3.7 :vesi 2.0}
   {:kk 4 :paiva 30 :neste 3.7 :vesi 1.0}])
```
Laske huhtikuun osalta muun nesteen kuin veden kulutus, siis tuloksena on yksi luku.

3. Säilytä edellisessä tehtävässä map-rakenne niin, että
```
 (def food-journal
  [{:kk 4 :paiva 5 :muuneste 3.0}
   {:kk 4 :paiva 10 :muuneste 1.7}
   {:kk 4 :paiva 15 :muuneste 1.2}
   {:kk 4 :paiva 29 :muuneste 1.7}
   {:kk 4 :paiva 30 :muuneste 2.7}])
```



   
   
   


