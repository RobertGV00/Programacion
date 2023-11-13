package PrimeraEvaluacion.Tema04.ejercicios.string;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio01 {
    //Escribir por pantalla cada carácter de una cadena introducida por teclad
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto");
        String cadena = teclado.nextLine();

        // para verla caracter a caracter -> charAt
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }
    }
}
