package primeraevaluacion.tema02.ejemplos.ejemplosVariables;

import java.util.Scanner;

public class Ejemplo04 {
    public static void main(String[] args) {
        // Vamos a ver como se introducen los datos por teclado
        Scanner teclado = new Scanner(System.in); // esta línea la ponemos en todas las clases en que
        // queramos introducir datos por teclado
        System.out.println("Introduce tu nombre: ");
        // escribimos el nombre por teclado y lo guardamos en una variable
        String nombre = teclado.nextLine();
        System.out.println("Hola, " + nombre);
    }
}
