package segundaevaluacion.colecciones.ejemplos;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploIterador {
    public static void main(String[] args) {
        // un iterador lo tienen todas las colecciones (arraylist, hashset ...)
        // sirve para recorrerlas elemento a elemento, lo mismo que haciamos con un for o un foreach, pero como tienen unas caracterisiticas especiales, a veces son la mejor opcion para recorrer una coleccion.
        ArrayList<String> alumnos = new ArrayList<>();
        alumnos.add("Iván");
        alumnos.add("Alejandro");
        alumnos.add("Carlos André");
        alumnos.add("Carlos ");
        alumnos.add("Javier");
        alumnos.add("Ainara");
        alumnos.add("George");
        alumnos.add("Sergio");
        alumnos.add("Kamilly");
        alumnos.add("Johane");

        //quiero recorrer el arraylist, tengo 3 formas:
        System.out.println("Con For normal: ");
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.print(alumnos.get(i) + " ");
        }
        System.out.println("\nCon foreach: "); // la limitacion que tiene es que no puedes seleccionar elementos por su indice, se recorre entero.
        for (String elemento: alumnos) {
            System.out.print(elemento + " ");
        }
        // Tercera forma: utilizando un iterador (Es un objeto de tipo iterador que se crea así:)
        System.out.println("\nCon iterador");
        Iterator<String> iterator = alumnos.iterator();
        // lo normal es poner a continuacion un while, así:

        while (iterator.hasNext()) { // = mientras haya un elemento siguiente sigue recorriendo.
            String elemento = iterator.next();
            System.out.print(elemento + " ");
        }
    }
}
