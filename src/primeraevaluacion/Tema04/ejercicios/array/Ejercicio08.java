package primeraevaluacion.Tema04.ejercicios.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio08 {
    //Realizar un programa que pida un tamaño de array por teclado y a continuación cree un array formado por elementos aleatorios pares entre 1 y 50
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random generador = new Random();
        int[] array = new int[teclado.nextInt()];
        int[] arraygenerador = new int[array.length];
        int acumulador = 0;
        System.out.println(" Acumulador");
        for (int i = 0; i < array.length; i++) {
            acumulador = generador.nextInt(1, 51);

            System.out.print(acumulador + " ");
            if (acumulador % 2 == 0) {
                arraygenerador[i] = acumulador;
            }else {
                i--;
            }

            }
        System.out.println("\nNumeros del array");
        System.out.println(Arrays.toString(arraygenerador));
    }
}
