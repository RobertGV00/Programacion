package segundaevaluacion.colecciones.ejemplos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EjemplosHashMap {
    public static void main(String[] args) {
        // mapas
        // sirven para almacenar pares de variables de la forma clave - valor
        // se declaran poniendo entre <> primero el tipo de la clave y luego el tipo del valor.

       // HashMap<String, String> mapa = new HashMap<>();
       //
       // // para añadir datos: tiene que ir en pares:
       // mapa.put("11111111A", "A. Arribas");
       // mapa.put("22222222B", "B. Blazquez");
       // mapa.put("33333333C", "C. Calvo");
       // mapa.put("44444444D", "D. Diaz");
       // System.out.println(mapa);
       //
       // // para recuperar valores, basta con darle la clave.
        Scanner teclado = new Scanner(System.in);
       // System.out.println("DNI");
       // String dni = teclado.nextLine();
       // System.out.println(mapa.get(dni));

        // vamos a hacer un mapa que me guarde los numeros en ingles

        HashMap<Integer, String> map = new HashMap<>();

        // añadir valores
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(9, "Nine");
        map.put(10, "Ten");
        //Comporbar mapa
        System.out.println(map);

        int numero = 0;
        do {
            System.out.println("¿Como se dice en ingles? 1. 10");
            numero = teclado.nextInt(); teclado.nextLine();
            if (map.containsKey(numero)) {
                System.out.println(map.get(numero));
            } else {
                if (numero != 0) {
                    System.out.println("Ese no me lo sé. ¿Quieres enseñarmelo?\nDime la traducción: ");
                    String traduccion = teclado.nextLine();
                    map.put(numero, traduccion);
                }
                }
        } while (numero != 0);

        // recorrer un mapa no es tan sencillo como un simple for, tiene su truco.
        // hay varias formas vamos a ver aqui la que tiliza Map.Entry.
        // cada uno de los pares clave-valor es una entrada (Entry)
        // Para referirnos a un entrada utilizamos Map.Entry (entrada del mapa)
        // vamos a recorrer todas la entradas con un foreach
        for (Map.Entry<Integer, String> entrada: map.entrySet()) {
            int clave = entrada.getKey();
            String valor = entrada.getValue();
            System.out.println(clave + " en inglés es " + valor);
        }
    }
}
