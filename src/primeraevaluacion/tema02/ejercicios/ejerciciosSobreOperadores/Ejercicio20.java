package primeraevaluacion.tema02.ejercicios.ejerciciosSobreOperadores;

import java.util.Scanner;

public class Ejercicio20 {
    /*
    Realiza un programa que pida un número y un porcentaje, y
Calcule y muestre ese número incrementado en ese porcentaje.
Calcule y muestre ese número decrementado en ese porcentaje.
	Por ejemplo: si se introduce 10 y 20, el resultado es 12 y 8.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        double numero = teclado.nextDouble();
        System.out.println("Introduzca un procentaje");
        double procentaje = teclado.nextDouble();

        double sacarProcentaje = numero * (procentaje / 100);
        double suma = numero + sacarProcentaje;
        System.out.printf("Su numero incrementado es %.2f\n",suma );
        double resta = numero - sacarProcentaje;
        System.out.printf("Su numero decrementado es %.2f",resta );
    }
}
