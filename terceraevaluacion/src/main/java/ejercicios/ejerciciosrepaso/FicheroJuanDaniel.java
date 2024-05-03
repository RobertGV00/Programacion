package ejercicios.ejerciciosrepaso;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;
public class FicheroJuanDaniel {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Crear fichero");
            System.out.println("2. Borrar fichero");
            System.out.println("3. Escribir en el fichero");
            System.out.println("4. Ver el fichero");
            System.out.println("5. Salir");

            int option = teclado.nextInt(); teclado.nextLine();
            if (option == 1) {
                System.out.print("Introduzca el nombre del fichero: ");
                String nombre = teclado.nextLine();
                File file = new File("terceraevaluacion/src/main/java/ejercicios/ejerciciosrepaso/ " + nombre);
                try {
                    file.createNewFile();
                    System.out.println("Fichero creado.");
                } catch (IOException e) {
                    System.out.println("Error al crear el fichero.");
                }
            } else if (option == 2) {
                System.out.print("Introduzca el nombre del fichero: ");
                String nombre = teclado.nextLine();
                File file = new File("terceraevaluacion/src/main/java/ejercicios/ejerciciosrepaso/ " + nombre);
                if (file.exists()) {
                    file.delete();
                    System.out.println("Fichero borrado.");
                } else {
                    System.out.println("El fichero no existe.");
                }
            } else if (option == 3) {
                System.out.print("Introduzca el nombre del fichero: ");
                String nombre = teclado.nextLine();
                System.out.print("Introduzca el texto que desea escribir: ");
                String text = teclado.nextLine();
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombre))) {
                    writer.write(text);
                    System.out.println("Texto escrito en el fichero.");
                } catch (IOException e) {
                    System.out.println("Error al escribir en el fichero.");
                }
            } else if (option == 4) {
                System.out.print("Introduzca el nombre del fichero: ");
                String nombre = teclado.nextLine();
                File file = new File("terceraevaluacion/src/main/java/ejercicios/ejerciciosrepaso/ " + nombre);
                if (file.exists()) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(nombre))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }
                    } catch (IOException e) {
                        System.out.println("Error al leer el fichero.");
                    }
                } else {
                    System.out.println("El fichero no existe.");
                }
            } else if (option == 5) {
                break;
            } else {
                System.out.println("Opción inválida.");
            }

        }
    }
}
