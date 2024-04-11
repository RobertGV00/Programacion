package teoria.predicate;

import java.util.function.Predicate;

public class MainPredicate {
    public static void main(String[] args) {
        // utilizamos predicados cuando pasamos un valor por parametro y queremos que devuelva un boolean (true/false)
        // Ejemplo: es millenial si ha nacido entre 1981 y 1996 ambos incuusive
        //boolean predicado1 = esMillenial(1981);
        // ahora lo hacemos con la sintaxis de predicate

        Predicate<Integer> predicado1 = año -> año >= 1981 && año <= 1996;

        System.out.println( predicado1.test(1996));

    }
    public static boolean esMillenial(int año) {
     return  año >= 1981 && año <= 1996;

     }
    }

