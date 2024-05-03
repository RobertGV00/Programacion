package ejercicios.ejerciciosrepaso.JuanDaniel;

import java.io.File;
import java.io.IOException;

public class CrearFichero {
    public static void createFile(String fileName) throws IOException {
        File file = new File("terceraevaluacion/src/main/java/ejercicios/ejerciciosrepaso/JuanDaniel/" + fileName);
        if (file.createNewFile()) {
            System.out.println("Fichero creado.");
        } else {
            System.out.println("Error al crear el fichero.");
        }
    }
}
