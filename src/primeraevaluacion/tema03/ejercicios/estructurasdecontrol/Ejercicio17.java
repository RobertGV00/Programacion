package primeraevaluacion.tema03.ejercicios.estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio17 {
    // Escribe un programa que responda a un usuario que quiere comprar un helado en una conocida marca de comida rápida cuanto le costará en función del topping que elija.
    //El helado sin topping cuesta 1.90€.
    //El topping de oreo cuesta 1€.
    //El topping de KitKat cuesta 1.50€.
    //El topping de brownie cuesta 0.75€.
    //El topping de lacasitos cuesta 0.95€.
    //En caso de no disponer del topping solicitado por el usuario el programa escribirá por pantalla «no tenemos este topping, lo sentimos. » y a continuación informará del precio del helado sin ningún topping.
    //Finalmente, el programa escribe por pantalla el precio del helado resultante.
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        System.out.println("Selecciones un topping");
        System.out.println("0 - Oreo");
        System.out.println("1 - KitKat");
        System.out.println("2 - Brownie");
        System.out.println("3 - Lacasitos");
    int topping = teclado.nextInt();
    switch (topping) {
        case 1:
            System.out.println("El topping de Oreo cuesta : 1.00€" );
            break;
        case 2:
            System.out.println("El topping de KitKat cuesta : 1.50€" );
            break;
        case 3:
            System.out.println("El topping de Brownie cuesta : 0.75€" );
            break;
        case 4:
            System.out.println("El topping de Lacasitos cuesta : 0.95€" );
           break;
        default:
            System.out.println("No dispones de ese topping, lo siento. ");
            System.out.println("El helado sin topping cuesta 1.90€");
    }
    }
}
