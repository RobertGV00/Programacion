package PrimeraEvaluacion.Tema03.ejemplos;

import java.util.Scanner;

public class EjemplosDoWhile {
    public static void main(String[] args) {
        // el bucle while empieza evaluando una condicion
        // si el resultado es true, entra en el bloque {} y ejecuta el codigo que contenga
        // al finalizar, vuelve arriba a comprobar de nuevo la condicion
        //asi sucesivamente hasta que el resultado sea falso.

        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 11);
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        i = 1;
        do {
            if ( i % 5 == 0) {
                System.out.println(i + " ");
            }
            i++;
        }while (i <= n);

    }
}
