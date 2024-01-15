package primeraevaluacion.tema03.ejercicios.estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio12If {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Mostramos un menu para elegir la casa
        System.out.println("Elige una casa: ");
        System.out.println("1. gryffindor");
        System.out.println("2. hufflepuff");
        System.out.println("3. slytherin");
        System.out.println("4. ravenclaw");
        int numero = teclado.nextInt();
        if (numero == 1 ) {
            System.out.println("Valentia");
        } else if (numero == 2) {
            System.out.println("Lealtad");
        } else if (numero == 3) {
            System.out.println("Astucia");
        } else if (numero == 4) {
            System.out.println("Intelecto");
        }
        else {
            System.out.println("No es una casa valida");
        }
    }
}
