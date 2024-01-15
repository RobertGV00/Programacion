package primeraevaluacion.tema03.ejercicios.masejercicios;

import java.util.Scanner;

public class Ejercicio05 {
    // Realiza un programa que pida dos número enteros A y B, siendo B mayor que A. Luego visualiza los números desde A hasta B e indicar cuantos hay que sean pares. Ejemplo:
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int n1 = teclado.nextInt();
        System.out.print("Dime un numero mayor que el anterior: ");
        int n2 = teclado.nextInt();
        int contadorPar = 0;

        for (int i = n1; i <= n2; i++) {
            System.out.print(i + "\t");
            if (i % 2 == 0) {
                contadorPar++;
            }
        }
        System.out.print("\nLa cantidad de numeros pares es: " + contadorPar);
    }
}
