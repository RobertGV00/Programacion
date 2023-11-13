package PrimeraEvaluacion.Tema04.ejercicios.string;

import java.util.Scanner;

public class Ejercicio03 {
    //Escribe un programa que lea una cadena de texto y reemplace todas las ocurrencias de la letra ‘a’ con la letra ‘b’. A continuación debe imprimir la cadena resultante.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una cadena de texto");
        String cadena = teclado.nextLine();
        System.out.println(cadena);
        // reemplace todas las ocurrencias de la letra a con la letra b -> metodo replace (old , new)
        cadena = cadena.replace('a','b');
        System.out.println(cadena);
    }
}
