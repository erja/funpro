import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;

/* Tämä näkyviin ihan vaan helpottamaan koodin ymmärtämistä:

    @functionalInterface
    public interface Predicate<T>
        boolean test(T t);
    }
*/

class Predikaatti{
    
    public static <T> List<T> filtteri(List<T> lista, Predicate<T> pred){
        List<T> tulokset = new ArrayList<T>();
        for(T t: lista){
            if(pred.test(t)){
                tulokset.add(t);
            }
        } 
        return tulokset;
    }


    public static void main(String[] args){
        
        List<String> nimet = new ArrayList<String>(){{add("Martti"); add("Sauli"); add("Mauno"); add("Pirkko");}};
    
        List<String> pirkko = filtteri(nimet, new Predicate<String>(){
                public boolean test(String s){
                    return "Pirkko".equals(s);
                }
        });
        
        pirkko.forEach(s -> System.out.println(s));
        System.out.println("----------");
        
        List<String> kaikki = filtteri(nimet, (String s) -> true);
        kaikki.forEach(s -> System.out.println(s));
        System.out.println("----------");    
        
        List<String> mAlkuiset = filtteri(nimet, (String s) -> s.startsWith("M"));
        mAlkuiset.forEach(s -> System.out.println(s));
        System.out.println("----------");    
        
        
        // Yhdistetyt predikaatit (and, or, negate. Tässä and + negate:)
        
        Predicate<String> yli5merkkia = (String s) -> s.length() > 5;
        List<String> alle6jaMalkuiset = filtteri(nimet, yli5merkkia.negate().and((String s) -> s.startsWith("M")));
        alle6jaMalkuiset.forEach((s) -> System.out.println(s));
        
    }

}