package primeraevaluacion.Tema04.ejercicios.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {
    //Haz un programa en el que se cree un array que lea por teclado la longitud que debe tener y a continuación lo inicialice con números aleatorios comprendidos entre 1 y 10. Mostrar la suma de todos los números que se guardan en el array.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int tamaño = teclado.nextInt();
        int[] array = new int[tamaño];
int suma = 0;
        Random generador = new Random();
        for (int i = 0; i < array.length ; i++) {
            array[i] = generador.nextInt(1,11);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
            System.out.print(suma + " ");
        }
        System.out.println(suma);
    }
}
