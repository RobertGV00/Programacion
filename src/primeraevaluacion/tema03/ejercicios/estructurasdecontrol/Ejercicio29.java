package primeraevaluacion.tema03.ejercicios.estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double base = teclado.nextInt();
        int exponente = teclado.nextInt();
        double resultado = 1;
        for (int i = exponente; i != 0; i--) {
            resultado = resultado * base;
        }
            System.out.printf("Resultado = %.2f" , resultado);
    }
}
