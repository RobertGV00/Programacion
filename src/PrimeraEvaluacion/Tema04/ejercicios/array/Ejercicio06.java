package PrimeraEvaluacion.Tema04.ejercicios.array;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio06 {
   // Realizar un programa en el se se inicialice un array de longitud 20 con números aleatorios comprendidos entre -10 y 10. A continuación, mostrar la media de los números positivos,la media de los negativos y contar el número de ceros.
    public static void main(String[] args) {

         int[] numeros = new int[20];
        Random generador = new Random();

        for (int i = 0; i <numeros.length; i++) {
            numeros[i] = generador.nextInt(-10, 10 + 1);
            Arrays.sort(numeros);

        }


        double mediaPositivos = 0;
        double mediaNegativos = 0;
        int ceros = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > 0) {
                mediaPositivos = mediaPositivos + numeros[i];
                contadorPositivos++;
            } else if (numeros[i] < 0) {
                contadorNegativos++;
                mediaNegativos = mediaNegativos + numeros[i];
            } else if (numeros[i] == 0 ) {
                ceros++;
            }
        }

        mediaPositivos = mediaPositivos / contadorPositivos;
        mediaNegativos = mediaNegativos / contadorNegativos;

        System.out.println("Los numeros del array son los siguientes : " + Arrays.toString(numeros));
        System.out.println("\nLos cantidad de numeros positivos es : " + contadorPositivos);
        System.out.printf("La media de los numeros positivos es %.2f" , mediaPositivos);
        System.out.println("\nLos cantidad de numeros negativos es : " + contadorNegativos);
        System.out.printf("La media de los numeros negativos es %.2f" , mediaNegativos);
        System.out.println("\nEl numero de ceros es de : " + ceros);
    }
}
