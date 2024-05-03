package ejercicios.ejerciciosrepaso.JuanDaniel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class VerFichero {
    public static void viewFile(String fileName) {
        File file = new File("terceraevaluacion/src/main/java/ejercicios/ejerciciosrepaso/JuanDaniel/" + fileName);
        if (file.exists() && !file.isDirectory()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
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
    }
}
