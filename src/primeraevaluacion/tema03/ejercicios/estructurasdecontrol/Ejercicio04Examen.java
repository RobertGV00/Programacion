package primeraevaluacion.tema03.ejercicios.estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio04Examen {
    // Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre por pantalla los números desde 1 hasta N, uno en cada línea, repitiendo cada número tantas veces como su valor. Ejemplo:
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero entre 0 y 20");
        int n = teclado.nextInt();

        for (int i = 1; i <= n ; i++) { // Este bucle for se encarga de llegar hasta el numero que hayamos introducido por teclado.
            System.out.println();
            for (int j = 0; j < i; j++) { // Este bucle se encarga de repetir el numero las veces necesarias.
                System.out.print(i);
            }
        }

    }
}
