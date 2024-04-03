package segundaevaluacion.ejerciciosrobert.clasesabstractas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner
        Scanner teclado = new Scanner(System.in);
        // Punto
        // coordenadas
        ArrayList<Punto> puntos  = new ArrayList<>();
        for (int i = 0; i < 4 ; i++) {
            System.out.println("Introduce la cordenada x");
            double x = teclado.nextDouble();
            i++;
            System.out.println("Introduce Cordenada y");
            double y = teclado.nextDouble();
            puntos.add(new Punto(x,y));
        }
        for (int e = 0; e < puntos.size(); e++) {
            System.out.println("Puntos: " + puntos.get(e));

        }



    }
    // menu
    public static void menu() {

    }
}
