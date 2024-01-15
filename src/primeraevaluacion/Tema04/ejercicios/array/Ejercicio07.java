package primeraevaluacion.Tema04.ejercicios.array;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] notas = new double[5];
// introduzco las notas por teclado y las voy guardando en el array
        for (int i = 0; i < notas.length ; i++) {
            //
            notas[i] = teclado.nextDouble();
        }
// ordeno el array
        Arrays.sort(notas);

        // cojo la primera y la utima nota.

        double notaMasBaja = notas[0];
        double notaMasAlta = notas[4];

        // calculo la media
        double suma = 0;

        for (int i = 0; i <notas.length ; i++) {
            suma += notas[i];
        }
        double media = suma / notas.length;

        // muestro los datos
    }
}
