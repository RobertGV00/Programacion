package PrimeraEvaluacion.Tema03.ejercicios.estructurasDeControl;

import java.util.Scanner;

public class Ejercicio13Switch {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        System.out.println("Indique un numero de direccion: ");
        System.out.println("0. No mover");
        System.out.println("1. Arriba");
        System.out.println("2. Abajo");
        System.out.println("3. Izquierda");
        System.out.println("4. Derecha");
        int numero = teclado.nextInt();
        switch (numero) {
            case 0:
                System.out.println("No mover");
                break;
            case 1:
                System.out.println("Arriba");
                break;
            case 2:
                System.out.println("Abajo");
                break;
            case 3:
                System.out.println("Izquierda");
                break;
            case 4:
                System.out.println("Derecha");
                break;
            default:
                System.out.println("¡ERROR!");
        }
    }
}
