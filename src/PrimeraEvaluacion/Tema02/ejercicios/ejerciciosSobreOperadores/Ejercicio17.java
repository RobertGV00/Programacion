package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosSobreOperadores;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num1 = teclado.nextDouble();
        double num2 = teclado.nextDouble();
        double num3 = teclado.nextDouble();
        double num4 = teclado.nextDouble();
        double suma = num1 + num2 + num3 + num4;
        System.out.println("Suma = " + suma);
        // ahora calculamos la media: suma dividida por el numero de valores que hemos sumado.
        // las medias suelen tener decimales para que tengan sentidom entocnes siempre declaramos esa variable como double.
        double media = suma / 4.0; // si ponemos simplemente 4, hara la division entre dos numeros enteros; para que tenga en cuenta los decimales, al menos uno de los dos valores debe ser double o decimal (Al poner 4.0, Java ya consiera que es una division entre numeros decimales). Otra opcion podria haber sido declarar la suma como double
        System.out.println("Media = " + media);
    }
}
