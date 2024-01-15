package primeraevaluacion.tema03.ejercicios.estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio01 {
    /*
    Escribe un programa que pida un número e indique si es par o impar (un número es par si al dividirlo entre 2 el resto es 0).
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero:");
        int numero = teclado.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Es un numero par ");
        }
        else {
            System.out.println("Numero impar");
        }

    }
}
