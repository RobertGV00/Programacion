package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosSobreOperadores;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    int valor = teclado.nextInt();
    // verificamos si es menor que 10 y mayor que 10.
    boolean resultado = valor < 10 && valor > 0;
        System.out.println("Es menor que 10 y mayor que 0: " + resultado);
    }

}
