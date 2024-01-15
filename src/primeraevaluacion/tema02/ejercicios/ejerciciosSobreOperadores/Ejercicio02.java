package primeraevaluacion.tema02.ejercicios.ejerciciosSobreOperadores;

import java.util.Scanner;

public class Ejercicio02 {
    //Escribir un programa en el cual se piden cuatro números y se calcule e imprima la suma de los dos primeros y el producto del tercero y el cuarto.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int uno = teclado.nextInt();
        int dos = teclado.nextInt();
        int tres = teclado.nextInt();
        int cuatro = teclado.nextInt();
        //Suma
        int suma = uno + dos;
        //Producto
        int producto = tres * cuatro;

        //Mensajes
        System.out.println("La suma de los primeros dos numeros es = " + suma);
        System.out.println("El producto de los ultimos dos numeros es = " + producto);
    }
}
