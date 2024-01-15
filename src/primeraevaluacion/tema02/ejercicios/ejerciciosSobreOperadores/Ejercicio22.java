package primeraevaluacion.tema02.ejercicios.ejerciciosSobreOperadores;

import java.util.Scanner;

public class Ejercicio22 {
    /*
    Haz el ejercicio anterior aplicando, además, un descuento del 15% sobre el total de la compra.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el precio del producto ");
        double precio = teclado.nextDouble();
        System.out.println("Introduzca la cantidad de productos");
        double productos = teclado.nextDouble();
        System.out.println("Introduzca la cantidad de IVA ");
        double iva = teclado.nextDouble();
        double sumaProductos = productos * precio;
        double procentaje = sumaProductos * (iva / 100);
        double precioFinal = sumaProductos + procentaje;
        System.out.printf("El precio final sin descuento es de %.2f", precioFinal);
        double descuento = precioFinal * 0.15;
        double precioConDescuento = precioFinal - descuento;
        System.out.printf("\nEl precio final con el descuento es de %.2f" , precioConDescuento );
    }
}
