package primeraevaluacion.Tema04.ejercicios.array;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio15 {
    // Crear un programa que rellene aleatoriamente un array de 10 números enteros. Guardar en otro array los elementos pares del primero, y, a continuación, los elementos impares.
    public static void main(String[] args) {
        Random generador = new Random();
        int[] array = new int[10];
        int[] arraypar = new int[10];
        int[] arrayimpar = new int[10];
        int contadorpar = 0;
        int contadorimpar = 0;
        System.out.println("Los numeros del array son;");
        for (int i = 0; i < array.length; i++) {
            array[i] = generador.nextInt(1, 21);

        if (array[i] % 2 == 0) {
            arraypar[i] = array[i];

        }else {
            arrayimpar[i] = array[i];
        }

        }
        System.out.print("Array: " + Arrays.toString(array));
        System.out.println();
        System.out.print("Array Par: " + Arrays.toString(arraypar));
        System.out.print("\nArray impar: " + Arrays.toString(arrayimpar));
    }
}
