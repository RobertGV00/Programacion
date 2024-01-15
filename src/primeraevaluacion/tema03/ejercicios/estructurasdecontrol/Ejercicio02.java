package primeraevaluacion.tema03.ejercicios.estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio02 {
    /*
    Escribe un programa que pida dos números e indique si el primero es mayor que el segundo o no.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca dos numeros ");
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();
        if (numero1 > numero2) {
            System.out.println("El numero uno es mayor que el segundo");
        }
        else {
            System.out.println("El numero dos es mayor que el numero uno");
        }
    }
}
