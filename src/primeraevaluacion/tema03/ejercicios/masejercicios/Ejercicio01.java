package primeraevaluacion.tema03.ejercicios.masejercicios;

import java.util.Scanner;

public class Ejercicio01 {
    // Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();

        boolean esPrimo = true;
        if (numero == 0 || numero == 1) {
            System.out.println("No es un numero primo");
        }else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) { // si al dividir numero por cualquier otro menor da de resto 0, no es un numero primo.
                    System.out.println("El numero " + numero +" no es primo," + " porque no es divisible entre " + i );
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println("Es primo");
            }
        }
    }
}
