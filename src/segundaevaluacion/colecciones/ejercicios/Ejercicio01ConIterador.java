package segundaevaluacion.colecciones.ejercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio01ConIterador {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>(); // hashset porque me dice que no puede tener numeros repetidos.
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        teclado.nextLine();
        while (numero != -1) {
            // solo meto los números enteros no negativos.
            if (numero >= 0) {
                numeros.add(numero);
                System.out.println("Añada otro numero S");
            } else {
                System.out.println("El numero no puede ser negativo ");
            }
            numero = teclado.nextInt();
            teclado.nextLine();
        }
        System.out.println(numeros);
        // no podemos utilizar un for normal, porque HashSet no tiene el metodo get() para acceder por posición
        System.out.println("\n\nvalores pares:");
        for (int elemento : numeros) {
            if (elemento % 2 == 0) {
                System.out.print(elemento + " ");

            }
        }
        System.out.println();

        // se elinminaran todos los multiplos de 3.

        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 3 == 0) {
                iterator.remove();
            }
        }
        System.out.println("\n\nTras eliminar los multiplos de 3");
        System.out.println(numeros);
    }
}