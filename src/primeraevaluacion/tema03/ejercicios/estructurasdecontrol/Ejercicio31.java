package primeraevaluacion.tema03.ejercicios.estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio31 {
    // [FOR ANIDADO] Hacer un programa que dibuje un triángulo rectángulo de n elementos de lado, siendo n un número introducido por teclado, utilizando asteriscos (*). Por ejemplo, para n = 5:
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) { // imprio desde 0 hasta
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
