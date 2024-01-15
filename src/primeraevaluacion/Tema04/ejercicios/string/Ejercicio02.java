package primeraevaluacion.Tema04.ejercicios.string;

import java.util.Scanner;

public class Ejercicio02 {
    //Realizar un programa que compruebe si una cadena leída por teclado comienza por una subcadena introducida también por teclado.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto"); // Hoy es jueves, y ayer fue fiesta.
        String cadena = teclado.nextLine();
        System.out.println("Ahora introduce el texto que quieres comprobar si está:");// jueves -> true Jueves -> false
        String texto = teclado.nextLine();
        // el metodo que me sirve para comprobar si una cadena contiene otra es contains()
        if (cadena.contains(texto)) {
            System.out.println("Si, el texto \"" + texto +  "\" esta dentro de \"" + cadena + "\"");
        }else {
            System.out.println("No, no esta");
        }

    }
}
