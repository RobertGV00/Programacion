package PrimeraEvaluacion.Tema04.ejercicios.string;

import java.util.Scanner;

public class Ejercicio06 {
    // Escribe un programa que lea dos cadenas y las compare sin tener en cuenta los espacios en blanco. El programa debería imprimir true si son iguales, false en caso contrario.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una cadena");
        String cadena1 = teclado.nextLine();
        System.out.println("Introduzca otra cadena");
        String cadena2 = teclado.nextLine();

        //idea: la frase normal     y lafra seno rmal -> serían iguales, porque si quitamos los espacios, ambas son iguales.
        // truco: quitar los espacios en ambas con replace y despues comparalos.
        String cadena3 = cadena1.replace(" ", "");
        String cadena4 = cadena2.replace(" ", "");
        boolean comparar = cadena3.equals(cadena4);
if (comparar == true){
    System.out.println("La cadena \"" + cadena1 + "\" y la cadena \"" + cadena2 + "\" son iguales" );
}else {
    System.out.println("La cadena \"" + cadena1 + "\" y la cadena \"" + cadena2 + "\" son diferentes" );
}

    }
}
