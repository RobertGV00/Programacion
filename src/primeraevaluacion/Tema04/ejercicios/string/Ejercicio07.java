package primeraevaluacion.Tema04.ejercicios.string;

import java.util.Scanner;

public class Ejercicio07 {
    //Escribe un programa que lea una cadena y dos números enteros para indicar los límites inferior y superior respectivamente de un rango dentro de las posiciones de los caracteres de la cadena. Imprime la subcadena indicada por el rango:
    //a) suponiendo que ambos números siempres son mayores o iguales a 0 y menores que la longitud de la cadena;
    //b) Validando que sucede a).
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una cadena: ");
        String cadena = teclado.nextLine();
        // tenemos que comprobar que los numeros introducidos estan entre 0 y la cadena.lenght() - 1
        int li = -1;

        while (li < 0 || li > cadena.length() - 1) {
            System.out.println("Limite inferior");
             li = teclado.nextInt();
           if (li < 0 || li > cadena.length() - 1){ // compruebo si a introducido un numero que no vale y indico error.
               System.out.println("El numero introducido no puede ser menor que 0 ni mayor que " + (cadena.length() - 1));
           }
        }

        int ls = -1;

        while (ls < li || ls > cadena.length()) {
            System.out.println("Limite superior");
            ls = teclado.nextInt();
            if (ls < li || ls > cadena.length()){ // compruebo si a introducido un numero que no vale y indico error.
                System.out.println("El numero introducido no puede ser menor que 0 ni mayor que " + (cadena.length() - 1));
            }
        }

        //Tenemos que imprimir los caracteres de cadenas que esten entre limite inferior y limite superior substring(lis, ls)
        System.out.println(cadena.substring(li, ls));
    }
}
