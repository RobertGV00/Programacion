package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosSobreOperadores;

import java.util.Scanner;

public class Ejercicio04 {
    //Unas ardillas encuentran unas nueces y deciden dividirlas equitativamente. Escribe un programa que pregunte por el número de ardillas y nueces, y, a continuación, calcule (y muestre) cuántas nueces corresponden a cada ardilla y cuántas sobrarán tras el reparto.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuantas ardillas hay?");
        int ardillas = teclado.nextInt();
        System.out.println("¿Cuantas nueces hay?");
        int nueces = teclado.nextInt();

        //calcular
        int cantidadNueces = nueces / ardillas;
        System.out.println("A cada ardilla le corresponden = " + cantidadNueces + " nueces ");
        int resto = nueces % ardillas;
        System.out.println("Sobran un total de " + resto + " nueces ");


    }
}
