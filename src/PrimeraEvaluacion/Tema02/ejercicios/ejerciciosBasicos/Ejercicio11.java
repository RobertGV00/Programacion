package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosBasicos;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca su altura en metros: ");
        double altura = teclado.nextDouble();
        System.out.println("Introduzca su peso en KG: ");
        double peso = teclado.nextDouble();
        double imc = peso/ (altura*altura);
        System.out.println("Su indice de masa corporal es : " + imc );
    }
}
