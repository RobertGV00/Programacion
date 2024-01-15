package primeraevaluacion.Tema04.ejercicios.string;

import java.util.Scanner;

public class Ejercicio04 {
    //Escribe un programa que lea el nombre de una ciudad y compruebe si el nombre termina con “burgo”. El programa debe imprimir true o false.
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el noombre de una ciudad: ");
        String ciudad = teclado.nextLine();
        System.out.println(ciudad);
        System.out.println(ciudad.endsWith("burgo"));
    }

}
