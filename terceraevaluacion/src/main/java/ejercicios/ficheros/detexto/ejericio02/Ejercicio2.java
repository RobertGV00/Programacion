package ejercicios.ficheros.detexto.ejericio02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {


    // 1/ Leer el fichero Restaurante.csv
    String ruta = "terceraevaluacion/src/main/java/ejercicios/ficheros/detexto/ejericio02/Restaurantes.csv";
    File fichero = new File(ruta);
    // veamos si existe el fichero (por si las moscas...)
    if (fichero.exists()) {
        System.out.println("Ok. P'alante");
    } else {
        System.out.println("Tengo mal la ruta");
    }

    // 2) Ahora creo un lector con Scanner
        Scanner lector = null;
    try {
        lector = new Scanner(fichero);
        // recorrer el ficher
        while (lector.hasNext()) {
            String linea = lector.nextLine();
            // para ver si funciona imprimo linea a linea
            //System.out.println(linea);

            // muestre los datos de todos aquellos restaurantes cuyo codigo postal empieze por 6
            String[] campos = linea.split(",");
            //ahora tengo qye sacar el codigo postal que en el array campos tiene el indice4
            String zipcode = campos[4];
           // System.out.println(zipcode);

            // pero solo quiero imprimir los que comiencen por 6
            if (zipcode.startsWith("6")) {
                System.out.println(campos[0] + "\t\t\t\t\t\t\t" + campos[1] + "\t\t\t\t\t\t\t" + campos[2] + "\t\t\t" + campos[3] + "\t" + campos[4]);
            }
        }


    } catch (FileNotFoundException e) {
        System.out.println("No se puede crear el objeto lector (por lo que sea). ");;
    } finally {
        lector.close();
        System.out.println("FIN");
    }
    }
}
