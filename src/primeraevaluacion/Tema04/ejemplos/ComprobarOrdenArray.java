package primeraevaluacion.Tema04.ejemplos;

import java.util.Arrays;

public class ComprobarOrdenArray {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            if (i % 2 == 0) {
                array1[i] = i + 2 * i;
            } else {
                array1[i] = i - 2 * i;
            }
        }

        System.out.println(Arrays.toString(array1));

        int[] array2 = {5, 10, 15, 20, 25};
        int[] array3 = {25, 20, 15, 10, 5};
        // imaginemos que no sabemos que contiene el array, queremos  averiguar si esta ordenado.
        boolean ordenadoAscendente = true;

        for (int i = 0; i < 4; i++) {

            if (array3[i] > array3[i + 1]) {
                ordenadoAscendente = false;
                break;

            }
        }

        if (ordenadoAscendente) {
            System.out.println("El array esta en orden ascendente");
        } else {
            boolean ordenDescendente = true;
            for (int i = 0; i < array1.length - 1; i++) {
                if (array3[i] < array3[i + 1]) {
                    ordenDescendente = false;
                    break;
                }
            }
            if (ordenDescendente) {
                System.out.println("El array esta en orden descendente");
            }else {
                System.out.println("El array esta desordenado");
            }
        }
    }
}


