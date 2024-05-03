package ejercicios.ejerciciosrepaso.JuanDaniel;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Crear fichero");
            System.out.println("2. Borrar fichero");
            System.out.println("3. Escribir en el fichero");
            System.out.println("4. Ver el fichero");
            System.out.println("5. Salir");

            try {
                String option = teclado.nextLine();
                int optionInt = Integer.parseInt(option);
                if (optionInt == 1) {
                    System.out.print("Introduzca el nombre del fichero: ");
                    String fileName = teclado.nextLine();
                    CrearFichero.createFile(fileName);
                } else if (optionInt == 2) {
                    System.out.print("Introduzca el nombre del fichero: ");
                    String fileName = teclado.nextLine();
                    BorrarFichero.deleteFile(fileName);
                } else if (optionInt == 3) {
                    System.out.print("Introduzca el nombre del fichero: ");
                    String fileName = teclado.nextLine();
                    System.out.print("Introduzca el texto a escribir: ");
                    String text = teclado.nextLine();
                    EscribirEnFichero.writeToFile(fileName, text);
                } else if (optionInt == 4) {
                    System.out.print("Introduzca el nombre del fichero: ");
                    String fileName = teclado.nextLine();
                    VerFichero.viewFile(fileName);
                } else if (optionInt == 5) {
                    break;
                } else {
                    System.out.println("Opción inválida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, introduzca un número.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
