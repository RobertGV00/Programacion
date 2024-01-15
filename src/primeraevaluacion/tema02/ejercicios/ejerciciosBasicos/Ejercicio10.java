package primeraevaluacion.tema02.ejercicios.ejerciciosBasicos;

import java.util.Scanner;

public class Ejercicio10
{
    public static void main(String[] args) {
        Scanner nueva = new Scanner(System.in);
        System.out.println("Introduzca su edad: ");
        int edad = nueva.nextInt();
        System.out.println("Introduzca el año actual");
        int fecha = nueva.nextInt();

        edad = fecha - edad;

        System.out.println("Su año de nacimiento es: " + edad);


    }
}
