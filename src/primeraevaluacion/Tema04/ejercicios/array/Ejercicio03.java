package primeraevaluacion.Tema04.ejercicios.array;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio03 {
    //Haz un programa que declare tres arrays (‘a1’, ‘a2’ y ‘a3’) de cinco enteros cada uno, pida valores para ‘a1’ y ‘a2’ y calcule los elementos de a3 así: a3=a1+a2.
    public static void main(String[] args) {
        int[] a1 = new int[5];
        int[] a2 = new int[5];
        int[] a3 = new int[5];

        Random generador = new Random();
        for (int i = 0; i < a1.length; i++) {

            a1[i] = generador.nextInt(1,11);
            a2[i] = generador.nextInt(1, 11);
        }
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        for (int i = 0; i < a3.length; i++) {
            a3[i] = a1[i] + a2[i] ;

        }
        System.out.println(Arrays.toString(a3));
    }
}
