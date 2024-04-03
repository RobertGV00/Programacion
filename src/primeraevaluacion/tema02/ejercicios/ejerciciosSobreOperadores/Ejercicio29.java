package primeraevaluacion.tema02.ejercicios.ejerciciosSobreOperadores;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       int guardarDatos = 0;
        int bucle = 1;
        while (bucle != 0) {
            int num1 = teclado.nextInt();
            int num2 = teclado.nextInt();
            int num3 = teclado.nextInt();
            int suma = num1 + num2 + num3;
            System.out.println(suma);
            System.out.println("Quieres acabar el programa? Si es si introduce a continuacion un 0");
            bucle= teclado.nextInt();
            guardarDatos = suma;
        }
        System.out.println(guardarDatos);

    }
}
