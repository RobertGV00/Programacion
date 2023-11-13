package PrimeraEvaluacion.Tema03.ejercicios.estructurasDeControl;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un año para comprobar si es bisiesto: ");
        int año = teclado.nextInt();
        if ((año % 4 == 0 && año % 100 !=0) || (año % 400 == 0)){
            System.out.println(año + " Es un año bisiesto");
        }else {
            System.out.println(año + " No es un año bisiesto");
        }
    }
}
