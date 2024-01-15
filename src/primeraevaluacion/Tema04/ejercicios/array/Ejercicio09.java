package primeraevaluacion.Tema04.ejercicios.array;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio09 {
    // Realizar un programa que declare un array y lo vaya llenando de números intoducidos por teclado hasta que introduzcamos un número negativo. Entonces debe imprimir los elementos que contiene (el número negativo sólo sirve para finalizar el programa, no entra en el array).
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamaño = teclado.nextInt();
        int[] array = new int[tamaño];
        int numero = teclado.nextInt();

        int indice = 0;
        System.out.println("Introduce numeros al array");
        while (numero > 0 && indice < tamaño) {
            // si el numero positivo y el indice esta dentro del array
            array[indice] = numero;
            // antes de salir tengo que incrementar el indice
            indice++;
            if (indice < tamaño) {
                numero = teclado.nextInt();
            }
            }
        System.out.println(Arrays.toString(array));
    }

}
