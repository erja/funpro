'use strict';

const Henkilo  = (function(){
    
    const suojatut = new WeakMap();  // yhteinen ilmentymille
    
    class HenkiloX{
        constructor(p_nimi, p_ika){
            suojatut.set(this, {nimi: p_nimi, ika: p_ika});
        }  // suojatut instanssimuuttujat nimi ja ika
        
     
        getNimi() {return suojatut.get(this).nimi;}
        
        getMap() {return suojatut;}  // testausta varten
        
    }
    
    return HenkiloX;
})();


const henkilo1 = new Henkilo("Eero", 22 );
const map1 = henkilo1.getMap();
const henkilo2 = new Henkilo("Jussi", 21 );
const map2 = henkilo2.getMap();
console.log(henkilo1.getNimi());
console.log(henkilo2.getNimi());

console.log( map1 === map2);  // true

console.log( henkilo1.getMap === henkilo2.getMap);  // true


