package segundaevaluacion.colecciones.ejemplos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EjemplosArrayList {
    public static void main(String[] args) {
        // son como los array, pero pueden cambiar de tamaño
        // una diferencia importante: no pueden guardar tipos primitivos: int, boolean, double.
        // en su lugar hay que utlizar lo que se llaman clases envoltorio (wrapper):
        // en vez de int usamos Integer, en vez de double usamos Double, en vez de boolean usamos Boolean, en vez de char usamos Character.
        ArrayList<Integer> enteros = new ArrayList<>();

        // metodos a utlilzar:
        // size
        System.out.println(enteros.size());// tamaño: es el equivalente en los array a lenght.
        // para añadir elementos: add
        enteros.add(53);
        System.out.println(enteros.size());// tamaño: es el equivalente en los array a lenght.
        for (int i = 30; i <= 40; i++) {
            enteros.add(i);
        }
        System.out.println(enteros.size());// tamaño: es el equivalente en los array a lenght.
// y si quiero ver que elementos tiene: get
        for (int i = 0; i < enteros.size(); i++) {
            System.out.print(enteros.get(i) + " ");
        }
        // ahora cogemos los ajemplos de los apuntes.
        System.out.println("\n\n========================================");
        ArrayList<String> nombres = new ArrayList<>();
        // añadimos dos elementos
        nombres.add("Justino");
        nombres.add("Helena");
        System.out.println(nombres); // imprimir el array
        // ahora añadimos dos nombres mas pero al principio: es decir, en los indices 0 y 1
        nombres.add(1, "Joshua");
        System.out.println("Meto a Joshua en el indice 1 " + nombres);
        nombres.add(0, "Laura");
        System.out.println("Meto a Laura en el indice 0 " + nombres);

        // set sirve para reemplazar un elemento por otro diciendo el indice
        // queremos meter a Mario en el lugar de Helena
        nombres.set(3, "Mario");
        System.out.println("He sustituido a Helena por Mario " + nombres);

        // queremos eliminar a Justino de la lista

        nombres.remove(1);
        System.out.println("He eliminado a Justino " + nombres);


        // ordenar arraylist
        Collections.sort(nombres);
        System.out.println("Arraylist ordenado: " + nombres);
    }
}
