package PrimeraEvaluacion.Tema02.ejemplos.ejemplosVariables;

import java.util.Scanner;

public class Ejemplo06 {
    public static void main(String[] args) {
        // VARIABLE BOOLEAN
        /*
        Son variables que solo pueden tomar dos valores: true y false.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.print("Intoduce edad: ");
        int edad = teclado.nextInt(); teclado.nextLine();
        boolean mayorDeEdad= edad >= 18; // si edad es >=18, guardara true; si no, false
        System.out.print("Eres mayor de edad: " + mayorDeEdad);

    }
}
