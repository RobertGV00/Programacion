package PrimeraEvaluacion.Tema03.ejercicios.estructurasDeControl;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String user = "John";
        String pass = "John2";
        System.out.println("Escribe un nombre de usuario");
        String nombre = teclado.nextLine();
        System.out.println("Introduzca una contraseña:");
        String contraseña = teclado.nextLine();

        // New ***** OJO ***** CUANDO SE TRATA DE UN STRING, LA COMPARACION NO SE HACE CON ==
        // SE HACE CON EQUALS : cadena1.equals(cadena2)
        // Por ejemplo, en este caso pondriamos:
        if (nombre.equals(user)) {
            System.out.println();
        }
        else {
            System.out.println("El nombre de usuario es incorrecto");
        }
        if (contraseña.equals(pass)) {
            System.out.println();
        }
        else {
            System.out.println("La contraseña introducida es incorrecta");
        }
    }
}
