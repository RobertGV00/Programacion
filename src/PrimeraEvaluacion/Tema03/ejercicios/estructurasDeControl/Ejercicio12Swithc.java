package PrimeraEvaluacion.Tema03.ejercicios.estructurasDeControl;

import java.util.Scanner;

public class Ejercicio12Swithc {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Mostramos un menu para elegir la casa
        System.out.println("Elige una casa: ");
        System.out.println("1. gryffindor");
        System.out.println("2. hufflepuff");
        System.out.println("3. slytherin");
        System.out.println("4. ravenclaw");
        int numero = teclado.nextInt();
        switch (numero) {
            case 1:
                System.out.println("Valentia");
                break;
            case 2:
                System.out.println("Lealtad");
                break;
            case 3:
                System.out.println("Astucia");
                break;
            case 4:
                System.out.println("Inteligencia");
            default:
                System.out.println("Casa no disponible");
        }
    }
}
