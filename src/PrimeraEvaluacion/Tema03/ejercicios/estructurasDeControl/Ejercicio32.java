package PrimeraEvaluacion.Tema03.ejercicios.estructurasDeControl;

import java.util.Scanner;

public class Ejercicio32 {
    //Escribe un programa que solicite al usuario un número entre 1 y 100, ambos inclusive. Si se introduce un número fuera del intervalo debe indicarlo mediante un error y seguir pidiendo el número hasta que se introduzca el número en el rango indicado. Al terminar debe imprimir por pantalla el número introducido
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero entre 1 y 100");
        int n1 = teclado.nextInt();
if (n1 < 1 || n1 > 100) {
    System.out.println("El numero introducido esta fuera de rango. \nPorfavor ponga un numero dentro del rango");
    while (n1 < 1 || n1 > 100 ) {
        System.out.println("Introduzca un numero");
        n1 = teclado.nextInt();
        }
}
        System.out.println("El numero introducido es el " + n1);
    }
}
