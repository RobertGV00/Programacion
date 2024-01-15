package primeraevaluacion.tema03.ejercicios.estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio13If {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique un numero de direccion: ");
        System.out.println("0. No mover");
        System.out.println("1. Arriba");
        System.out.println("2. Abajo");
        System.out.println("3. Izquierda");
        System.out.println("4. Derecha");
    int numero = teclado.nextInt();
        if (numero == 0){
            System.out.println("No mover");
        } else if (numero == 1 ) {
            System.out.println("Arriba");
        } else if (numero == 2) {
            System.out.println("Abajo");
        } else if (numero == 3) {
            System.out.println("Izquierda");
        } else if (numero == 4) {
            System.out.println("Derecha");
        } else {
            System.out.println("¡error!");
        }
    }
}
