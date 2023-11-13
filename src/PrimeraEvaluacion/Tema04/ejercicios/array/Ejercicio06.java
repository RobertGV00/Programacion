package PrimeraEvaluacion.Tema04.ejercicios.array;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio06 {
   // Realizar un programa en el se se inicialice un array de longitud 20 con números aleatorios comprendidos entre -10 y 10. A continuación, mostrar la media de los números positivos,la media de los negativos y contar el número de ceros.
    public static void main(String[] args) {
         int[] numeros = new int[20];
        Random generador = new Random();
        for (int i = 0; i <numeros.length; i++) {
            numeros[i] = generador.nextInt(-10, 10);
            Arrays.sort(numeros);

        }
        System.out.println(Arrays.toString(numeros));
    }
}
