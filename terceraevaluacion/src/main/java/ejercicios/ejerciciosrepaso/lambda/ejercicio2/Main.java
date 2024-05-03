package ejercicios.ejerciciosrepaso.lambda.ejercicio2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Paciente> paciente = new ArrayList<>();

        paciente.add(new Paciente("Felipe", 54, new String[]{"Náuseas,mareos"}));
        paciente.add(new Paciente("Irene ", 32, new String[]{"Tos,cansancio,mareos"}));
        paciente.add(new Paciente("Carmen ", 15, new String[]{"Ansiedad"}));
        paciente.add(new Paciente("Santiago ", 8, new String[]{"Fractura de cadera"}));
        paciente.add(new Paciente("Isabel A.", 60, new String[]{"Tos", "amnesia", "fiebre", "dolor"}));
/*
        // Partiendo de la clase Paciente, haz una lista de cinco pacientes con los datos de la tabla y muéstralos ordenados por nombre, por edad y por número de síntomas, de forma ascendente y descendente.

        // ordenador por nombre ascendente
        System.out.println("\n Nombre Ascendente");
        paciente.stream()
                .sorted(Comparator.comparing(p -> p.getNombre()))
                .forEach(paciente1 -> System.out.println("Por nombre ascendente " + paciente1));
        // ordenador por nombre descendente
        System.out.println("\n Nombre Descendente");
        paciente.sort((p1, p2) -> p2.getNombre().compareTo(p1.getNombre()));
        paciente.forEach(paciente1 -> System.out.println("Descendete " + paciente1));
        // ordenado por edad ascendente
        System.out.println("Por edad ascendente");
        paciente.stream()
                .sorted(Comparator.comparingInt(edad -> edad.getEdad()))
                .forEach(paciente1 -> System.out.println(paciente1));
        // ordenado por edad descendente
        System.out.println("Por edad descendente");
        paciente.sort((p1, p2) -> p2.getEdad() - p1.getEdad());
        paciente.forEach(paciente1 -> System.out.println(paciente1));
        // ordenado por numero de sintomas ascendente
        System.out.println("Por número de síntomas ascendente");
        paciente.sort((p1, p2) -> p1.getSíntomas().length - p2.getSíntomas().length);
        System.out.println(paciente);
        // ordenado por numero de sintomas descendente
        System.out.println("Por numero de sintmas descendente");
        paciente.sort((p1, p2) -> p2.getSíntomas().length - p1.getSíntomas().length);
        System.out.println(paciente);
*/
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Ordenar por nombre (ascendente)");
            System.out.println("2. Ordenar por nombre (descendente)");
            System.out.println("3. Ordenar por edad (ascendente)");
            System.out.println("4. Ordenar por edad (descendente)");
            System.out.println("5. Ordenar por número de síntomas (ascendente)");
            System.out.println("6. Ordenar por número de síntomas (descendente)");
            System.out.println("7. Salir");

            int option = scanner.nextInt();
            if (option == 1) {
                System.out.println("\nOrdenado por nombre (ascendente):");
                paciente.stream()
                        .sorted(Comparator.comparing(p -> p.getNombre()))
                        .forEach(paciente1 -> System.out.println(paciente1));
            } else if (option == 2) {
                System.out.println("\nOrdenado por nombre (descendente):");
                paciente.sort((p1, p2) -> p2.getNombre().compareTo(p1.getNombre()));
                paciente.forEach(paciente1 -> System.out.println(paciente1));
            } else if (option == 3) {
                System.out.println("\nOrdenado por edad (ascendente):");
                paciente.stream()
                        .sorted(Comparator.comparingInt(edad -> edad.getEdad()))
                        .forEach(paciente1 -> System.out.println(paciente1));
            } else if (option == 4) {
                System.out.println("\nOrdenado por edad (descendente):");
                paciente.sort((p1, p2) -> p2.getEdad() - p1.getEdad());
                paciente.forEach(paciente1 -> System.out.println(paciente1));
            } else if (option == 5) {
                System.out.println("\nOrdenado por número de síntomas (ascendente):");
                System.out.println("Por número de síntomas ascendente");
                paciente.sort((p1, p2) -> p1.getSíntomas().length - p2.getSíntomas().length);
                System.out.println(paciente);
            } else if (option == 6) {
                System.out.println("\nOrdenado por número de síntomas (descendente):");
                paciente.sort((p1, p2) -> p2.getSíntomas().length - p1.getSíntomas().length);
                System.out.println(paciente);
            } else if (option == 7) {
                break;
            }


        }
    }
}
