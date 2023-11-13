package PrimeraEvaluacion.Tema04.ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class RellenarArrayTeclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // tenemos que declara el array y asignarle un tamaño
        // vamos a meter el tamaño por teclado
        System.out.println("Introduzca un numero");
        int n = teclado.nextInt();
        teclado.nextLine();
        // suponemos que queremos rellenar el array con cadenas de texto;
        String [] array = new String[n];

        // ahora con un for vamos rellenando

        for (int i = 0; i < array.length ; i++) {
            // en el elemento con indice i de cadenas guardamps lo que entre por teclado
            // no hace falta crera otra variable.
            System.out.println("Introduzca una cadena de texto");
            array[i] = teclado.nextLine();
        }
        System.out.println(Arrays.toString(array));
    }
}
