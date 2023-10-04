package PrimeraEvaluacion.Tema03.ejemplos;

import java.util.Scanner;

public class Ejemplosif {
    public static void main(String[] args) {
        // pido una edad y, si es mayor de edad, puede ver la pelicula, en caso contrario no decimos nada.
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Edad?");
        int edad = teclado.nextInt();
        if (edad >= 18) {
            System.out.println("Pasa puede ver la peli");
        }
        else {
            System.out.println("Lo siento, no puedes pasar");
        }
    }
}
