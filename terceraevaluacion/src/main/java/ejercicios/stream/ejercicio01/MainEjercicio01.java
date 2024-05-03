package ejercicios.stream.ejercicio01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class MainEjercicio01 {
    public static void main(String[] args) {
    // Crea una lista de enteros con 20 elementos aleatorios entre 1 y 15.
        List<Integer> numeros = new ArrayList<>();
        Random generador = new Random();
        for (int i = 0; i < 20; i++) {
            numeros.add(generador.nextInt(1,16));
        }


    // Utilizando streams, haz lo siguiente:

        System.out.println("Imprime todos los elementos de la lista, sin ordenar.\n");
        numeros.forEach(n -> System.out.print(n + " "));

        System.out.println("\n\nImprime todos los elementos de la lista, ordenados.\n");
        numeros.stream()
                .sorted().forEach(n -> System.out.print(n + " "));

        System.out.println("\n\nImprime todos los elementos de la lista, sin repetir, ordenados.\n");
        numeros.stream()
                .sorted()
                .distinct()
                .forEach(n -> System.out.print(n + " "));

        System.out.println("\n\nImprime sólo los mayores o iguales a 5 distintos entre sí.\n");
        numeros.stream()
                .filter(n -> n >= 5)
                .distinct()
                .forEach(n -> System.out.print(n + " "));

        System.out.println("\n\nImprime sólo los mayores o iguales a 5 distintos entre sí,  ordenados.\n");
        numeros.stream()
                .filter(n -> n >= 5)
                .sorted()
                .distinct()
                .forEach(n -> System.out.print(n + " "));

        System.out.println("\n\nImprime sólo los mayores o iguales a 5 distintos entre sí,  ordenados inversamente.\n");
        numeros.stream()
                .filter(n -> n >= 5)
                .sorted((n1, n2) -> n2.compareTo(n1))
                .distinct()
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n otra forma");
        numeros.stream()
                .filter(n -> n >= 5)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.print(n + " "));

        System.out.println("\n\nSuma todos los elementos de la lista e imprime el resultado.\n");
         int suma = numeros.stream().mapToInt(n -> n).sum();
        System.out.println(suma);

        System.out.println("\n\nSuma todos los elementos mayores o iguales a 5 (también los que se repitan) e imprime el resultado.\n");
         suma = numeros.stream().filter(n -> n >= 5)
                 .mapToInt(n -> n)
                 .sum();
        System.out.println(suma);

        System.out.println("\n\nCalcula el promedio de todos los elementos de la lista (sin eliminar los repetidos) e imprime el resultado. \n");
        double promedio =  numeros.stream()
                .mapToDouble(n -> n)
                .average()
                .orElse(0);
        System.out.println(promedio);

    }
}
