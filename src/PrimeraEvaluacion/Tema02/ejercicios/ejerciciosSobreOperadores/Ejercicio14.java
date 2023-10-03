package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosSobreOperadores;

import java.util.Scanner;

public class Ejercicio14 {
    /*
    Realiza un programa que calcule el área de un triángulo. Pedimos la base y la altura por teclado.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la base: ");
        double base = teclado.nextDouble();
        System.out.println("Introduzca la altura: ");
        double altura = teclado.nextDouble();
        double area = base * altura / 2;
        System.out.printf("El area resultante es: %.2f" , area);
    }
}
