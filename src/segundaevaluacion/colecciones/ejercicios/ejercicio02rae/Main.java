package segundaevaluacion.colecciones.ejercicios.ejercicio02rae;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // crear cinco academicos y meterlos en
        Academico academico1 = crearAcademico("A. Perez.Reverte", 2003);
        Academico academico2 = crearAcademico("Alvaro Pombo", 2004);
        Academico academico3 = crearAcademico("José Manuel Blecua", 2006);
        Academico academico4 = crearAcademico("Pedro R. García Barreno", 2006);
        Academico academico5 = crearAcademico("José Mª Merino", 2009);

        HashMap<Character, Academico> academia = new HashMap<>();
        // me piden que inserte los academicos con un metodo
        // creo una variable de tipo boolean para ver si se ha podido insertar o no.
         nuevoAcademico(academia, academico1, 'T');
         nuevoAcademico(academia, academico2, 't');
         nuevoAcademico(academia, academico3, 'A');
         nuevoAcademico(academia, academico4, 'E');
         nuevoAcademico(academia, academico5, 'i');

        imprimirTodaAcademia(academia);
    }
    // vamos a hacer un metodo que me imprima los academicos con con sus datos, letra, nombre y año.
    public static void imprimirAcademico(Academico a) {
        System.out.println("Año\t\tNombre");
        System.out.println(a.getAñoIngreso() + "\t" + a.getNombre());
    }
    // imprimir toda la academia con este formato: letra - año - nombre:
    public static void imprimirTodaAcademia(HashMap<Character, Academico> mapa) {
        System.out.println("Letra\tAño\t\t\tNombre");
        System.out.println("===========================================");
        //Recorremos el mapa
        for (Map.Entry<Character, Academico> entrada : mapa.entrySet()) {
            System.out.println(entrada.getKey() + "\t\t" + entrada.getValue().getAñoIngreso() + "\t\t" + entrada.getValue().getNombre());
        }
    }

    public static boolean nuevoAcademico(Map<Character, Academico> academia, Academico nuevo, Character letra) {
     // tenemos que insertar el academico en el mapa comprobando si la letra lo es
        if (Character.isLetter(letra)) {
            //Insertar academico y devolver true
            academia.put(letra,nuevo);
            return true;
        } else {
            return false;
        }
    }
    // vamos a crear los academicos con un metodo.
    public static Academico crearAcademico(String nombre, int año) {
        Academico academico = new Academico(nombre, año);
        return academico;
    }
}


