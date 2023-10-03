package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosSobreOperadores;

import java.util.Scanner;

public class Ejercicio13 {
    /*
    Realiza un programa que pida el lado de un cuadrado, y muestre por pantalla su perímetro.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el lado del cuadrado: ");
        double lado = teclado.nextDouble();
        double perimetro = lado + lado + lado + lado;
        System.out.printf("El perimetro resultante del cuadrado es %.2f " , perimetro);
    }
}
