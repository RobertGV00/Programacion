package primeraevaluacion.Tema04.ejercicios.string;

import java.util.Scanner;

public class Ejercicio15String {
    // Pide una cadena y un carácter por teclado y muestra cuantas veces aparece el carácter en la cadena.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba una cadena de texto");
        String cadena = teclado.nextLine();
        char caracter = teclado.nextLine().charAt(0);

        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter){
                contador++;
            }
        }
        System.out.println(contador);
    }
}
