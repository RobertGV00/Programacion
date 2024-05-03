package excepciones.videos.v1excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Field;

public class Video1 {
    public static void main(String[] args) {

        // excepciones no verificadas
        try {
            int dividendo = 10;
            int divisor = 0;
            int cociente = dividendo / divisor; // esto es una .AritmeticException: / by zero
        } catch (ArithmeticException exceptionA) {
            System.out.println("Ha Petado");
            System.out.println(exceptionA.getMessage());
        }


        System.out.println("Hemos pasado la excepcion aritmetica");

        try {
            int[] array = new int[3]; // array de tamaño 4: indice va de 0 a 3.
            int numero = array[3]; // ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

        } catch (ArrayIndexOutOfBoundsException exceptionB) {
            System.out.println("Ha petado");
            System.out.println(exceptionB.getMessage());
            System.out.println(exceptionB.getStackTrace());
        }
        System.out.println("Hemos pasado la excepcion del array");

        try {
            String cadena = null;
            System.out.println(cadena.toLowerCase()); // NullPointerException: Cannot invoke "String.toLowerCase()" because "cadena" is null

        } catch (NullPointerException exceptionC) {
            System.out.println("Ha petado");
            System.out.println(exceptionC.getMessage());
        }

        System.out.println("Hemos pasado la excepcion del string");

        try {

            int numero = Integer.parseInt("Cochinillo"); // NumberFormatException: For input string: "Cochinillo"
        } catch (NumberFormatException exceptionD) {
            System.out.println("Ha petado");
            System.out.println(exceptionD.getMessage());
        }
        System.out.println("Hemos pasado el parseInt exception");

        // EXCEPCIONES VERIFICADAS
        try {
            FileReader fr = new FileReader("archivo.txt");
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el fichero");
        }
        System.out.println("Y la vida sigue");
    }
}
