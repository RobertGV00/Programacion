package PrimeraEvaluacion.Tema04.ejercicios.array;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

    //Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los muestre en el mismo orden introducido.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] numeros = new double[5]; // creo un array de numeros decimales de tamaño 5

        for (int i = 0; i < numeros.length; i++) {
            double n = teclado.nextDouble();
            numeros[i] = n;
        }
        System.out.println(Arrays.toString(numeros));
    }
}
