package PrimeraEvaluacion.Tema03.ejercicios.estructurasDeControl;

import java.util.Scanner;

public class Ejercicio38 {
    //Hacer un programa que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso contrario, el programa termina cuando se introduce un espacio.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca algunos caracteres");
        char c1 = teclado.nextLine().charAt(0);
    while (c1 != ' ') { // si no es un ' ' entramos en el bucle
        if (c1 == 'a' || c1 == 'e' ||  c1 == 'i' || c1 == 'o' || c1 == 'u' || c1 == 'A' || c1 == 'E' ||  c1 == 'I' || c1 == 'O' || c1 == 'U'){
            System.out.println("El caracter introducido es una vocal");
        } else {
            System.out.println("No es una vocal");
        }
        c1 = teclado.nextLine().charAt(0);
    }
    }
}
