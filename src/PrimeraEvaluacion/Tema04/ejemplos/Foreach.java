package PrimeraEvaluacion.Tema04.ejemplos;

import java.util.Arrays;
import java.util.Random;

public class Foreach {
    public static void main(String[] args) {
        // for-each es una manera de recorrer arrays alternativa al for "normal"
        /*
        for (tipoArray valor : nombreArray)
        // intrucciones sobre el array
         */

        // ejemplo: vamor a crear un array y a rellenarlo aleatoriamente con for-each

       /* int[] nombreArray = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

        Random generador = new Random();
 valor designa a cada elemento del array, podriamos poner cualquier otro nombre en su lugar, elemento, e , etc
        for (int valor: nombreArray) {
           // System.out.println(valor * 2); // imprimimos cada elemento multiplicado por 2
            // seria equivalente a escribir, en vez de valor, nombreArray[i] en un for normal.
        }*/

        // hacemos otro ejemplo; contar el numero de 'a' que hay en un array de caracteres.
    String cadena = "valor designo a cada elemento del array, podriamos poner cualquier otro nombre en su lugar, elemento, e , etc";
        // truco; si quiero meter en un array todas las letras de una cadena de texto, me sirve el metodo toCharArray
        char[] letras = cadena.toCharArray();
        System.out.println(Arrays.toString(letras));

        // quiero hacer un array que guarde el numero de 'a', 'e', 'i', etc.
        //  creo un array con 5 elementos.
        int[] contadores = new int[5];

        for (char letra: letras) {
          if (letra == 'a') {
              contadores[0]++;
          } else if (letra == 'e') {
              contadores[1]++;
          } else if (letra == 'i') {
              contadores[2]++;
          } else if (letra == 'o') {
              contadores[3]++;
          } else if (letra == 'u') {
              contadores[4]++;
          }
        }
        System.out.println("Numero de \'a\': " + contadores[0]);
        System.out.println("Numero de \'e\': " + contadores[1]);
        System.out.println("Numero de \'i\': " + contadores[2]);
        System.out.println("Numero de \'o\': " + contadores[3]);
        System.out.println("Numero de \'u\': " + contadores[4]);
    }

}

