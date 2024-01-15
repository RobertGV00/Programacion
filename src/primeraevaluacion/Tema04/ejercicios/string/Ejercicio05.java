package primeraevaluacion.Tema04.ejercicios.string;

import java.util.Scanner;

public class Ejercicio05 {
    //Escribe un programa que compruebe si una cadena dada comienza por “J”, sin que tenga en cuenta si está en mayúsculas o minúsculas. El programa debe imprimir true o false.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una cadena");
        String cadena = teclado.nextLine();
        String cadena2= cadena.toUpperCase();
boolean empiezaPorJ = cadena.startsWith("J");
if (empiezaPorJ) {
    System.out.println("Si, el texto \"" + cadena + "\" empieza por J");
}else {
    System.out.println("No, no empieza por J");
}
    }
}
