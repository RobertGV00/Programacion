package primeraevaluacion.tema02.ejercicios.ejerciciosSobreOperadores;

import java.util.Scanner;

public class Ejercicio21 {
    /*
    Realiza un programa que pida el precio de venta de un producto, la cantidad de productos comprados y el porcentaje de IVA aplicado. El programa mostrará el importe total a abonar.
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
        System.out.printf("El precio final es de %.2f" , precioFinal);

    }
}
