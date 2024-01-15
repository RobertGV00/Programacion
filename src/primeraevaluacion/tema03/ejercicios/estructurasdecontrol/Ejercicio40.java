package primeraevaluacion.tema03.ejercicios.estructurasdecontrol;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio40 {
    // Escribe un programa que pida números al usuario entre 1 al 100 hasta que éste adivine un número que el programa ha elegido al azar. El programa debe ir dando pistas sobre si el número que tiene que adivinar es mayor o es menor que el introducido. El juego termina cuando te rindes (pulsando 0) o adivinas el número. Si se introduce un número fuera del intervalo debe dar un mensaje de error.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random generador = new Random();
        int numero = teclado.nextInt();
        int numeroAlmacenado = generador.nextInt(1,101);

        while (numero != numeroAlmacenado && numero != 0) {

            if (numero < 1 || numero > 100) {
                System.out.println("Mal");
            }
            else if (numero > numeroAlmacenado) {
                System.out.println("El numero introducio es mayor que el numero almacenado");
            }else if (numero < numeroAlmacenado){
                System.out.println("El numero introducido es menor que el numero almacenado");
            }else {
                System.out.println("Numero correcto");
            }
            numero = teclado.nextInt();
        }
        System.out.println("Te has rendido, el numero almacenado era el: " + numeroAlmacenado);
    }
}
