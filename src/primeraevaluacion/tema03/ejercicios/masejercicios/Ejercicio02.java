package primeraevaluacion.tema03.ejercicios.masejercicios;

import java.util.Scanner;

public class Ejercicio02 {
    // Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el último dado. La introducción de números finaliza con la introducción de un 0. Al final se mostrará: El total de números introducidos, excluido el 0. El total de números fallados.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contadorFallos = 0;
        int contador = 0;
        System.out.print("Dime un numero inicial: ");
        int n = teclado.nextInt();
        int numero = 0;
        do {
            if (n > numero) {
                numero = n;
            } else {
                System.out.println("Fallo es menor");
                contadorFallos++;
                numero = n;
            }
            contador++;
            System.out.print("\nDime un numero: ");
            n = teclado.nextInt();
        } while (n != 0);
        System.out.println("Total de numeros introducidos: " + contador);
        System.out.println("Total de numeros fallados: " + contadorFallos);
    }
}

