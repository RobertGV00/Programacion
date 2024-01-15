package primeraevaluacion.tema03.ejemplos;

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
      // en vez de una expresion, puedo poner una variable boolean directamente
        // Entonces, el ejemplo anterior podria quedar asi:
        boolean mayorDeEdad = edad >= 18;
        if (mayorDeEdad) {
            System.out.println("Solo poneiendo la variable mayor de edad, si es true se va a imprimir esto");
        }
        if (!mayorDeEdad) {
            System.out.println("No eres mayor de edad");
        }
    }
}
