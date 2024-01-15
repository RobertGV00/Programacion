package primeraevaluacion.tema02.ejercicios.ejerciciosSobreOperadores;

import java.util.Scanner;
/*
Realiza un programa que calcule el área de una circunferencia introduciendo el radio por teclado.
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el radio de la circunferencía: ");
double radio = teclado.nextDouble();
double area = Math.pow(radio, 2) * Math.PI;
        System.out.printf("El area resultante es: %.2f" , area);
    }
}
