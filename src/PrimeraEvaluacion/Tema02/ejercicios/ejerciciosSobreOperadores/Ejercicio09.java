package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosSobreOperadores;

import java.util.Scanner;

public class Ejercicio09 {
    // Escribe un programa que lea un número de tres cifras y muestre el número invertido. Por ejemplo: si introducimos el número 320, el programa debe mostrar 23; si introducimos 976, el programa debe mostrar 679.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero de tres cifras:");
            int numero = teclado.nextInt();
            if (numero >= 999){
        System.out.println("Tiene mas de tres cifras");
            }
            else {
                //Numeros
                int centenas = numero / 100;
                int resto = numero % 100;
                int decenas = resto / 10;
                int unidades = resto % 10;
                System.out.println("El numero introducido es: " + numero + " El numero que queda invertido sería: " + unidades + "" + decenas + "" + centenas);
            }
    }
}


