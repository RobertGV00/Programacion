package primeraevaluacion.tema02.ejercicios.ejerciciosSobreOperadores;

import java.util.Scanner;
//Realiza un programa que calcule la longitud de una circunferencia si nos dan el radio por teclado.
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el radio de la circunferencía: ");
double radio = teclado.nextDouble();
//Formula = 2 * pi * radio
double longitud = 2 * Math.PI * radio;
        System.out.printf("La longitud de la circunferencía es: %.2f " , longitud);
    }
}
