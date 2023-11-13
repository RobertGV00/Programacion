package PrimeraEvaluacion.Tema03.ejercicios.estructurasDeControl;

import java.util.Scanner;

public class Ejercicio10 {
    // La asociación de vinicultores quiere fijar el precio del kilo de uva, la cual se clasifica en dos tipos: A y B. Además, cada tipo de uva se clasifica en dos tamaños: 1 y 2. Se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque, considerando lo siguiente:
    //
    //
    //Preguntamos por el precio inicial del kilo de uva y el número de kilos que se van a cargar.
    //Si la uva es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1; y 30 céntimos si es de tamaño 2.
    //Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.La asociación de vinicultores quiere fijar el precio del kilo de uva, la cual se clasifica en dos tipos: A y B. Además, cada tipo de uva se clasifica en dos tamaños: 1 y 2. Se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque, considerando lo siguiente:
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cual es el precio inicial por kilo?");
        double precioInicial = teclado.nextDouble();

        System.out.println("¿Cuantos kilos se van a cargar? ");
        double kilosACargar = teclado.nextDouble();

        System.out.println("¿Que tipo de uva se metera?");
        String tipoUva = teclado.next();
        char a = 'a';
        char b = 'b';
        boolean comprobarA = tipoUva.equals(a);
        System.out.println("¿Que nivel de uva se metera?");
        int nivel = teclado.nextInt();
        double precioFinal =kilosACargar * precioInicial;
    if (comprobarA == true && nivel == 1) {
        precioFinal = precioFinal * 0.20;
        System.out.println(precioFinal);
    }
    }
}
