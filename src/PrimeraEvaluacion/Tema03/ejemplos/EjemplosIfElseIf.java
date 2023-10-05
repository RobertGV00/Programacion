package PrimeraEvaluacion.Tema03.ejemplos;

import java.util.Scanner;

public class EjemplosIfElseIf {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        if (numero < 16) {
            System.out.println("No trabajar");
        }
        else if (numero >= 16 && numero < 65) {
            System.out.println("Puedes trabajar");
        }
        else {
            System.out.println("A descarsar");
        }
    }
}
