import java.util.function.Consumer;
import java.util.List;
import java.util.ArrayList;

/* Tämä näkyviin ihan vaan helpottamaan koodin ymmärtämistä:

    @functionalInterface
    public interface Consumer<T>
        void accept(T t);
    }
*/

class Kuluttaja{
    
    public static <T> void teeKaikille(List<T> lista, Consumer<? super T> con){
        for(T t: lista){
            con.accept(t);
        }
    }

    public static void main(String[] args){
        
        List<String> nimet = new ArrayList<String>(){{add("Martti"); add("Sauli"); add("Mauno"); add("Pirkko");}};

        teeKaikille(nimet, (Object s) -> System.out.println(s));
        teeKaikille(nimet, (String s) -> System.out.println(s.toUpperCase()));
        teeKaikille(nimet, (String s) -> System.out.println(s + ":" + Math.random())); // Näinkin voi tehdä :)
    }
}
        