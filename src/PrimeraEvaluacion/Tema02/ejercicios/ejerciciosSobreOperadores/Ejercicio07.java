package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosSobreOperadores;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero de dos digitos");
        int numero = teclado.nextInt();
        // sacamos las decenas dividiendo entre 10
        int decenas = numero / 10;
        System.out.println(decenas);
    }
}
