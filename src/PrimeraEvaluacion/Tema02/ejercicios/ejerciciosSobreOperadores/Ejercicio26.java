package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosSobreOperadores;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        boolean menor = numero < 10 ? true : false;
        System.out.println("¿El numero introducido es menor que 10? " + menor);

    }
}
