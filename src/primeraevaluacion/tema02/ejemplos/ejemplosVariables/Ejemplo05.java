package primeraevaluacion.tema02.ejemplos.ejemplosVariables;

import java.util.Scanner;

public class Ejemplo05 {
    public static void main(String[] args) {
        //VARIABLE TIPO CHAR
        // la variable char sirve para guardar un único caracter
        // y se indica con comillas SIMPLES (comillas dobles son para String)
        char letra = 'a';
        System.out.println(letra);
        char número = '7';
        System.out.println(número);
        // para introducir valores char por teclado
        Scanner teclado = new Scanner(System.in);
        char caracter = teclado.nextLine().charAt(0); // cuando necesitamos introducir un char por teclado, añadir siempre el metodo .charAt(0);
    }
}
