package ejercicios.stream.ejercicio02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

Personaje personaje1 = new Personaje("Gandalf", Integer.MAX_VALUE,Arma.Bastón,false);
Personaje personaje2 = new Personaje("Aragorn", 88,Arma.Espada,true);
Personaje personaje3 = new Personaje("Gimli", 140,Arma.Hacha,false);
Personaje personaje4 = new Personaje("Legolas", 2931,Arma.Arco,false);
Personaje personaje5 = new Personaje("Boromir", 41,Arma.Espada,true);
Personaje personaje6 = new Personaje("Frodo", 51,Arma.Anillo,false);
Personaje personaje7 = new Personaje("Sam", 33,Arma.Espada,false);

// lista
List<Personaje> personajes = new ArrayList<>();
        personajes.add(personaje1);
        personajes.add(personaje2);
        personajes.add(personaje3);
        personajes.add(personaje4);
        personajes.add(personaje5);
        personajes.add(personaje6);
        personajes.add(personaje7);

        //1.  Filtrar los personajes que sean jóvenes (menos de 90 años) y lleven espada.
        List<Personaje> jovenConEspada = personajes.stream()
                .filter(personaje -> personaje.getEdad() < 90 && personaje.getArma() == Arma.Espada )
                .collect(Collectors.toList());
        System.out.println("1. Filtrar los personajes que sean jóvenes (menos de 90 años) y lleven espada " + jovenConEspada);
        //2. Filtrar los personajes que no usan espada.
        List<Personaje> noEspadachines = personajes.stream()
                .filter(personaje -> personaje.getArma() != Arma.Espada)
                .collect(Collectors.toList());
        System.out.println( "2. Filtrar los personajes que no usan espada. " + noEspadachines);
        //3. Muestra los personajes ordenados por orden alfabético.
        List<Personaje> ordenAlfabetico = personajes.stream()
                .sorted(Comparator.comparing(Personaje -> Personaje.getNombre()))
                .collect(Collectors.toList());
        System.out.println("3. Muestra los personajes ordenados por orden alfabético. " + ordenAlfabetico);
        //4. Muestra los personajes humanos.
        List<Personaje> humanos = personajes.stream()
                .filter(Personaje -> Personaje.isEsHumano())
                .collect(Collectors.toList());
        System.out.println("4. Muestra los personajes humanos. " + humanos);
        //5. Muestra el personaje más viejo.
        Personaje masViejo = personajes.stream()
                .max(Comparator.comparingInt(Personaje::getEdad))
                .orElse(null);
        System.out.println("5. Muestra el personaje más viejo. " + masViejo );

    }
}
