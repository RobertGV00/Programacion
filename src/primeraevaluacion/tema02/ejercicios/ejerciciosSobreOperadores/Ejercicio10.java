package primeraevaluacion.tema02.ejercicios.ejerciciosSobreOperadores;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una cantidad:");
        int cantidad = teclado.nextInt();

        int billete500 = cantidad / 500;
        int resto500 = cantidad % 500;
        int billete200 = resto500 / 200;
        int resto200 = resto500 % 200;
        int billete100 = resto200 / 100;
        int resto100 = resto200 % 100;
        int billete50 = resto100 / 50;
        int resto50 = resto100 % 50;
        int billete20 = resto50 / 20;
        int resto20 = resto50 % 20;
        int billete10 = resto20 / 10;
        int resto10 = resto20 % 10;
        int billete5 = resto10 / 5;
        int resto5 = resto10 % 5;
        int moneda2 = resto5 / 2;
        int resto2 = resto5 % 2;
        int moneda1 = resto2 / 1;
        
        System.out.println(billete500 + " Billete de 500€ \n"  + billete200 + " Billete de 200€ \n" + billete100+ " Billete de 100€ \n" +billete50 + " Billete de 50€ \n" +billete20+ " Billete de 20€ \n" +billete10+ " Billete de 10€ \n" +billete5+ " Billete de 5€ \n" +moneda2+ " Moneda de 2€ \n" +moneda1+ " Moneda de 1€" );

    }
}
