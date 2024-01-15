package segundaevaluacion.colecciones.ejercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio01ConFor {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>(); // hashset porque me dice que no puede tener numeros repetidos.
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt(); teclado.nextLine();
        while (numero != -1) {
            // solo meto los números enteros no negativos.
            if (numero >= 0 ) {
                numeros.add(numero);
                System.out.println("Añada otro numero S");
            }else {
                System.out.println("El numero no puede ser negativo ");
            }
            numero = teclado.nextInt(); teclado.nextLine();
        }
        System.out.println(numeros);
        // no podemos utilizar un for normal, porque HashSet no tiene el metodo get() para acceder por posición
        System.out.println("\n\nvalores pares:");
        for (int elemento: numeros) {
            if (elemento % 2 == 0) {
                System.out.print(elemento + " ");

            }
        }
        System.out.println();

        // se elinminaran todos los multiplos de 3.

        HashSet<Integer> coleccion2 = new HashSet<>();
        for (Integer elemento: numeros) {
            if (elemento % 3 != 0) {
                coleccion2.add(elemento);
            }
        }
        // una solucion es machacar la coleccion que teniamos con esta coleccion sin multiplos de 3:  numeros = coleccion2;

        // otra solucion es meter la coleccion en un array list y ahi ya puedo eliminar
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(numeros);
        for (int i = 0; i < numeros.size(); i++) {
            if (arrayList.get(i) % 3 == 0) {
                arrayList.remove(i);
                i--;
            }
        }
    }
}
