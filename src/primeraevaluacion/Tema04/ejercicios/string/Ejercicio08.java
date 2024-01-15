package primeraevaluacion.Tema04.ejercicios.string;

import java.util.Scanner;

public class Ejercicio08 {
    //Escribe un programa que lea una cadena de texto que consista en un nombre y sus apellidos y a continuación muestre las iniciales en mayúsculas
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre = teclado.nextLine();

        // tengo que extraer las iniciales
        // la primera va siempre
        String iniciales = nombre.substring(0, 1).toUpperCase();
        // a esta inicial le vamos añadiendo las demas.
        // vamos a ir recorriendo caracter a caracter el nombre completo; y cuando encontres un " " sabemos que lo siguiente es una inicial.
        for (int i = 0; i < nombre.length() - 1; i++) {
            if (nombre.substring(i, (i + 1)).equals(" ")) { // si el caracter que estoy mirando es = a " "
                // tengo que añadir el siguiete caracter a iniciales.
             iniciales = iniciales + nombre.substring(i + 1, i + 2).toUpperCase();
            }

        }
        System.out.println(iniciales);
    }
}
