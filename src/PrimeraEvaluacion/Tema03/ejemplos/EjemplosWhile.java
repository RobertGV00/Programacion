package PrimeraEvaluacion.Tema03.ejemplos;

import java.util.Scanner;

public class EjemplosWhile {
    public static void main(String[] args) {
        // el bucle while empieza evaluando una condicion
        // si el resultado es true, entra en el bloque {} y ejecuta el codigo que contenga
        // al finalizar, vuelve arriba a comprobar de nuevo la condicion
        //asi sucesivamente hasta que el resultado sea falso.

        int i = 1;
        while (i < 11) {
            System.out.println(i);
            i++;

            // otro ejemplo
            // imprimir todos los multiplos de 5 hasta un numero por teclado
            Scanner teclado = new Scanner(System.in);
            int n = teclado.nextInt();
            while (i <= n) {
if ( i % 5 == 0){
    System.out.println(i + " ");
}
i++;
            }
        }
    }
}
