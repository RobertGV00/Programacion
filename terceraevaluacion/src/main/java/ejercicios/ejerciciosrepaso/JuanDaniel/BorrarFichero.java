package ejercicios.ejerciciosrepaso.JuanDaniel;

import java.io.File;

public class BorrarFichero {
    public static void deleteFile(String fileName) {
        File file = new File("terceraevaluacion/src/main/java/ejercicios/ejerciciosrepaso/JuanDaniel/" + fileName);
        if (file.exists() && !file.isDirectory()) {
            if (file.delete()) {
                System.out.println("Fichero borrado.");
            } else {
                System.out.println("Error al borrar el fichero.");
            }
        } else {
            System.out.println("El fichero no existe.");
        }
    }
}