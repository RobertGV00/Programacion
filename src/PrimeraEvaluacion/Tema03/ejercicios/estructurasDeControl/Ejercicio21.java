package PrimeraEvaluacion.Tema03.ejercicios.estructurasDeControl;

import java.util.Scanner;

public class Ejercicio21 {
    //Hacer el ejercicio anterior, pero sin asumir que el primer número es menor que el segundo. Es decir, pedir dos números enteros por teclado e imprimir la suma de todos los números enteros desde el menor hasta el mayor, ambos inclusive.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos numeros: ");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int suma = 0;
        for (int i = a; i < b; i ++) {
            for (int j = b; j < a; j++) {

            if (a == b) {
                suma = suma + i;
                System.out.println("El numero a es mayor que el b");
            }
            else {
                suma = suma + j;
                System.out.println("El numero b es mayor que el a, por lo tanto");

            }
        }
        }
    }
}
