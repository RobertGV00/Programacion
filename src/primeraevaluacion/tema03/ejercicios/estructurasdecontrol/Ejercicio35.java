package primeraevaluacion.tema03.ejercicios.estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio35 {
    //Dada una secuencia de números enteros (que finaliza con el número 0), encuentra el elemento más grande de la secuencia. El número 0 no está incluido en la secuencia, sólo se utiliza para finalizar el programa.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int n = teclado.nextInt();
        System.out.println("El numero introducido es " + n);
        int numero = n;

        while (n !=0) {
            if (n < numero && n !=0)
            {
                numero = n;
            }
            System.out.println("Introduzca un numero");
            n = teclado.nextInt();
            System.out.println("Los has introducido el numero " + numero);
        }
        System.out.println("El mayor numero introducido es el " + numero);
    }

}
