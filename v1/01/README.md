# viikko 1 01 


# Funktionaalinen ohjelmointi

Funktionaalisessa ohjelmointityylissä hyödynnetään vahvasti rekursiota. Tämän viikon tehtävien yhteydessä seuraa ohjelmien suoritusta käyttämässäsi IDE-ympäristössä niin, että näet funktioiden kutsut ja kutsupinon muuttumisen.


## 1 Rekursio

Tietorakenteet ja rajapinnat -kurssilla on abstraktien tietotyyppien ja algoritmien vaativuusluokkien yhteydessä puhuttu rekursiosta. Funktionaalisessa ohjelmoinnissa rekursio ja rekursiivisten funktioiden kirjoittaminen on yksi keskeisimmistä asioista.

Seuraavassa on pieniä lämmittelytehtäviä rekursiosta. Ohjelmoi nämä Javascriptillä. Voit käyttää ohjelmointiympäristönä mieleistäsi ympäristöä esimerkiksi C9, Coding ground IDE:t tms.
Vie koodisi myös omaan git-repoosi, jonne annat opettajille oikeudet.


1. Seuraavassa on pseudokielinen rekursiivinen funktio, joka tutkii, onko merkkijono palindromi. Esimerkkiksi 'sokos' ja 'imaami' ovat palindromeja.

```
onPalindromi(merkkijono) {
  Jos merkkijonon pituus on 0 tai 1, palauta true.
  Muuten jos merkkijonon ensimmäinen ja viimeinen merkki ovat erilaiset, palauta false.
  Muissa tapauksissa ota jonon keskiosa, josta puuttuvat ensimmäinen ja viimeinen merkki,
    selvitä rekursiivisella metodikutsulla, onko keskiosa palindromi, ja
    palauta sama totuusarvo, jonka rekursiivinen kutsukin palautti.
}
```
2. Kahden luvun suurin yhteinen tekijä on suurin luku, jolla molemmat luvut ovat jaollisia.  Esimerkiksi lukujen 102 ja  68 suurin tekijä on 34.

```
syt(p, q) {
  Jos q on 0, palauta p.
  Muuten 
    selvitä rekursiivisella metodikutsulla, mikä on suurin yhteinen tekijä q:lle ja p%q:lle,
	ja
    palauta sama luku, jonka rekursiivinen kutsukin palautti.
}
```

3. Keskenään jaottomiksi tai suhteellisiksi alkuluvuiksi tai alkuluvuiksi toistensa suhteen sanotaan kahta lukua p ja q, jos p:n ja q:n suurin yhteinen tekijä on 1. Sovella edellisen tehtävän algoritmia ja tee rekursiivinen funktio kjl(p, q), joka tutkii ovatko kaksi lukua keskenään jaottomia. Esimerkiksi 35 ja 18 ovat keskenään jaottomia lukuja.

4. Kirjoita potenssiin korotus rekursiivisena funktiona. 

5. Käännä lista rekursiivisesti. Syvärakennetta ei tarvitse kääntää. Esimerkiksi lista [0,1,2,3,4,5,6,7,8,9] on käännettynä [ 9, 8, 7, 6, 5, 4, 3, 2, 1, 0]. Valmiita metodeja kääntämiseen ei saa käyttää.


