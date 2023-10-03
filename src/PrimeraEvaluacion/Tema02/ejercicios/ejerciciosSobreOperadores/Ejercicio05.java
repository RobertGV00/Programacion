package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosSobreOperadores;

import java.util.Scanner;

public class Ejercicio05 {
    // Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a cuantas horas y minutos corresponde. Por ejemplo: 1000 minutos son 16 horas y 40 minutos.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce los minutos: ");
        int minutos = teclado.nextInt();

        int horas = minutos / 60;
        int resto = minutos % 60;
        System.out.println(minutos + " minutos son = " + horas + " horas y " + resto + " minutos");
    }
}
