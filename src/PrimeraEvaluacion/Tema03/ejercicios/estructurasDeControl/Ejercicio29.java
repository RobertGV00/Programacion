package PrimeraEvaluacion.Tema03.ejercicios.estructurasDeControl;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        int suma = 1;
        for (int i = n2; i != 0; i--) {
            suma = suma * n1;
        }
            System.out.println("Resultado = " + suma);
    }
}
