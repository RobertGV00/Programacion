package primeraevaluacion.tema03.ejercicios.estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio04 {
    /*
    Escribe un programa que pida un nombre de usuario y una contraseña. Esos datos se comparan con dos valores guardados previamente en el programa. Si coinciden, se indica “Has entrado al sistema”, en caso contrario se indica que usuario y/o contraseña son incorrectos.
     */
    public static void main(String[] args) {
        String user = "John";
        String pass = "John2";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un nombre de usuario");
        String nombre = teclado.nextLine();
        System.out.println("Introduzca una contraseña:");
        String contraseña = teclado.nextLine();

        // New ***** OJO ***** CUANDO SE TRATA DE UN STRING, LA COMPARACION NO SE HACE CON ==
        // SE HACE CON EQUALS : cadena1.equals(cadena2)
        // Por ejemplo, en este caso pondriamos:
        if (nombre.equals(user) && contraseña.equals(pass)) {
            System.out.println("Has podido acceder");
        }
        else {
            System.out.println("No puedes acceder");
        }

    }
}
