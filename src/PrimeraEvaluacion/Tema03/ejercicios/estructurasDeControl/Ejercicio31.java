package PrimeraEvaluacion.Tema03.ejercicios.estructurasDeControl;

import java.util.Scanner;

public class Ejercicio31 {
    // [FOR ANIDADO] Hacer un programa que dibuje un triángulo rectángulo de n elementos de lado, siendo n un número introducido por teclado, utilizando asteriscos (*). Por ejemplo, para n = 5:
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        String caracter = "*";
int suma = 1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}
