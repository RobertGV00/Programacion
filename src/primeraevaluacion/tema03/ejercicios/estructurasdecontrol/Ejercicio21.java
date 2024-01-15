package primeraevaluacion.tema03.ejercicios.estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio21 {
    //Hacer el ejercicio anterior, pero sin asumir que el primer número es menor que el segundo. Es decir, pedir dos números enteros por teclado e imprimir la suma de todos los números enteros desde el menor hasta el mayor, ambos inclusive.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos numeros: ");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int suma = 0;

       int mayor , menor;
       if (a < b){
           mayor = b;
           menor = a;
           System.out.println("El numero a es menor que el b");
       }
       else {
           mayor = a;
           menor = b;
           System.out.println("El numero b es menor que el a");
       }
        for (int i = menor; i <= mayor; i ++) {
suma = suma + i;
            System.out.println("Sumas = " + i + ": " + suma);
        }
        System.out.println("Suma total = " + suma);
        }
    }

