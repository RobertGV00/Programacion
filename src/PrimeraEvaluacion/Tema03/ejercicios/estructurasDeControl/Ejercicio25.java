package PrimeraEvaluacion.Tema03.ejercicios.estructurasDeControl;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        // [FOR ANIDADO]Hacer un programa que introduzca un número entero, positivo, y calcule su tabla de multiplicar, hasta llegar a él. (Nota: para  que los números queden alineados en columnas puedes usar el tabulador \t). Ejemplo:
        Scanner teclado = new Scanner(System.in);
         int n = teclado.nextInt();
int mult = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print("\nTabla del " + i + ":");
            for (int j = 1; j <= 10; j++) {
                mult = i * j;
                System.out.print("\t" + mult);

            }

        }
    }
}
