package primeraevaluacion.tema03.ejercicios.masejercicios;

import java.util.Scanner;

public class Ejercicio04 {
    // Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre por pantalla los números desde 1 hasta N, uno en cada línea, repitiendo cada número tantas veces como su valor. Ejemplo:
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero entre 0 y 20: ");
        int n = teclado.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
        }
    }
}
