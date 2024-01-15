package primeraevaluacion.tema02.ejercicios.ejerciciosSobreOperadores;

import java.util.Scanner;

public class Ejercicio18 {
    /*
    Realiza un programa que pida las notas de las tres evaluaciones del módulo Programación y muestre la nota final (la nota final es la media de las tres evaluaciones) con un decimal.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la nota de programación de las tres evaluaciónes.");
        System.out.println("Primera evaluación");
        double primeraE = teclado.nextDouble();
        System.out.println("Segunda evaluación");
        double segundaE = teclado.nextDouble();
        System.out.println("Tercera evaluación");
        double terceraE = teclado.nextDouble();

        double resultado = (primeraE + segundaE + terceraE) / 3;
        System.out.printf("Tienes una media de %.1f" , resultado);


    }
}
