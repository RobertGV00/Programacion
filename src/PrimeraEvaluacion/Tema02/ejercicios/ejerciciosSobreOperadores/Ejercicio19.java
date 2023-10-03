package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosSobreOperadores;

import java.util.Scanner;

public class Ejercicio19 {
    /*
    Realiza un programa que pida las notas finales de todos los módulos de 1º y muestre la nota final del curso. La nota final es la media de las notas de todos los módulos, redondeada a un número entero (por ejemplo, si la media es 7,5, la nota final es 8; si es 7,4, la nota final es 7).
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Intorduzca las notas de los modulos de DAM");
        System.out.println("Programación: ");
        double programacion = teclado.nextDouble();
        System.out.println("Lenguaje de marcas: ");
        double lenguaje = teclado.nextDouble();
        System.out.println("Entornos de desarrollo: ");
        double entornos = teclado.nextDouble();
        System.out.println("Bases de datos: ");
        double bases = teclado.nextDouble();
        System.out.println("FOL: ");
        double fol = teclado.nextDouble();
        System.out.println("Sistemas Informaticos: ");
        double sistemas = teclado.nextDouble();
        double media = (programacion + lenguaje + entornos + bases + fol + sistemas) /6;
        System.out.printf("La nota media es de: %.1f" , media);
        System.out.printf("\nPor lo que redondeado la nota se queda en un %.0f" , media);

    }
}
