package primeraevaluacion.tema03.ejercicios.estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio28 {
    //Hacer un programa que imprima todos los números múltiplos de 5 entre 1 y n, siendo n un número introducido por el usuario.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int multiplo = 5;
        int n = teclado.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % multiplo == 0) {
    System.out.println(i + " ");
}
        }
    }

}
