package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosSobreOperadores;

import java.util.Scanner;

public class Ejercicio23 {
    /*
    Un vendedor recibe un sueldo base mas un 10% de comisión por comisión sobre el total de las ventas que realice. El vendedor realiza tres ventas este mes y quiere saber cuánto dinero obtendrá por concepto de comisiones y el total que cobrará. Todos los datos que se desconocen se piden por teclado.

     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el sueldo base");
        double sueldoBase = teclado.nextDouble();
        double comision = 10;
        System.out.println("Precio del primer articulo vendido");
        double venta1 = teclado.nextDouble();
        System.out.println("Precio del segundo articulo vendido");
        double venta2 = teclado.nextDouble();
        System.out.println("Precio del tercer articulo vendido");
        double venta3 = teclado.nextDouble();
        double totalVentas = venta1 + venta2 + venta3;
        System.out.println("Total obtenido por ventas: " + totalVentas);
        double comisionObtenida = totalVentas * 0.10;
        System.out.println("Comisión obtenida por las ventas: " + comisionObtenida);
        double total = sueldoBase + comisionObtenida;
        System.out.printf("El sueldo total que obtendrá sera de %.2f", total );


    }

}
