package ejercicios.ejerciciosrepaso.JuanDaniel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirEnFichero {
    public static void writeToFile(String fileName, String text) {
        File file = new File("terceraevaluacion/src/main/java/ejercicios/ejerciciosrepaso/JuanDaniel/" + fileName);
        if (file.exists() && !file.isDirectory()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(text);
                System.out.println("Texto escrito en el fichero.");
            } catch (IOException e) {
                System.out.println("Error al escribir en el fichero.");
            }
        } else {
            System.out.println("El fichero no existe.");
        }
    }
}
