package primeraevaluacion.Tema04.ejercicios.array;

import java.util.Scanner;

public class Ejercicio02 {
    //Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los muestre en el orden inverso al introducido.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] numeroArray = new double[5];
        double numero;
        for (int i = 0; i < numeroArray.length; i++) {
             numero = teclado.nextDouble();
            numeroArray[i] = numero;
        }
        for (int i = numeroArray.length - 1 ; i >= 0; i--) {
            System.out.println(numeroArray[i] + " ");
        }
    }
}
