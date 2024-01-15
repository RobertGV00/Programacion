package primeraevaluacion.Tema04.ejercicios.bidimensionales;

import java.util.Random;

public class Ejercicio19 {
    public static void main(String[] args) {
        // crea un array bidimensional de 5x5 enteros y rellenalo con valores numericos
        int[][] nummeros = new int[5][5];
        Random generador = new Random();

        for (int i = 0; i < nummeros.length ; i++) {
            for (int j = 0; j <nummeros[i].length ; j++) {
                nummeros[i][j] = generador.nextInt(1, 11); // lo rellenamos con numeros entre 1 y 10.
            }
        }
        for (int i = 0; i < nummeros.length ; i++) {
            for (int j = 0; j <nummeros[i].length ; j++) {
                System.out.print(nummeros[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
