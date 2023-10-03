package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosSobreOperadores;

import java.util.Scanner;

public class Ejercicio03 {
    //Escribe un programa que lea un valor entero n de la entrada estándar y muestre el resultado de la siguiente expresión aritmética:
    //((n + 1) * n + 2) * n + 3
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int resultado = (((n + 1) * n + 2) * n + 3);
        System.out.println(resultado);
       // Segunda forma
        System.out.println(((n + 1) * n + 2) * n + 3);

    }
}
