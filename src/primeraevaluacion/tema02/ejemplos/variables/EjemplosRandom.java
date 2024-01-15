package primeraevaluacion.tema02.ejemplos.variables;

import java.util.Random;

public class EjemplosRandom {
    public static void main(String[] args) {
        Random generador = new Random();
        int numeroAleatorio = generador.nextInt(1, 10);
        //Vamos a generar y mostrar 100 numeros aleatorios.
        for (int i = 0; i < 100 ; i++) {
            System.out.print(numeroAleatorio + " ");
            numeroAleatorio = generador.nextInt(-10, 11); // Genera numeros entre 0 y 9
        }
    }
}
