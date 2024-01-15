package primeraevaluacion.tema03.ejercicios.estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio03 {
    /*
    Escribe un programa que pide 5 números por teclado y al concluir escribe el mayor y menor de ellos (sin utilizar for).
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca cinco numeros:");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();
        int num4 = teclado.nextInt();
        int num5 = teclado.nextInt();

        int numeroMayor = num1;
        if (numeroMayor < num2) {
            numeroMayor = num2;
        }
        if (numeroMayor < num3) {
            numeroMayor = num3;
        }
        if (numeroMayor < num4) {
            numeroMayor = num4;
        }
        if (numeroMayor < num5) {
            numeroMayor = num5;
        }

        int numeroMenor = num1;
        if (numeroMenor > num2) {
            numeroMenor = num2;
        }
        if (numeroMenor > num3) {
            numeroMenor = num3;
        }
        if (numeroMenor > num4) {
            numeroMenor = num4;
        }
        if (numeroMenor > num5) {
            numeroMenor = num5;
        }
        System.out.println("Numero mayor " + numeroMayor + " Numero menor " + numeroMenor);
    }
}
