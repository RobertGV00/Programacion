package primeraevaluacion.tema03.ejercicios.masejercicios;

import java.util.Scanner;

public class Ejercicio03 {
    // Realiza un programa que lea un número y a continuación escriba el carácter “*” tantas veces igual al valor numérico leído. En aquellos casos en que el valor leído no sea positivo se deberá escribir un único asterisco.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        char caracter = teclado.next().charAt(0);

        if (numero < 0) {
            System.out.println(caracter);
        }
        for (int i = 0; i < numero; i++) {
            System.out.print(caracter + " ");
        }
    }
}
