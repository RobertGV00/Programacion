package ejercicios.compararpersona;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan",22,180));
        personas.add(new Persona("Pepe",28,183));
        personas.add(new Persona("Jose",26,170));
        personas.add(new Persona("Robert",24,180));


        System.out.println("Orden segun entran en el array");
        imprimirPersona(personas);
        System.out.println("\nOrden por altura");
        personas.sort(new CompararAltura());
        imprimirPersona(personas);

        // por edad
        System.out.println("\nOrden por edad");
        personas.sort(new ComprarEdad());
        imprimirPersona(personas);
    }
    // imprimir array
    public static void imprimirPersona(ArrayList<Persona> personas) {
        for (Persona persona: personas) {
            System.out.println(persona);
        }
    }
}
