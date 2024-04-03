package segundaevaluacion.poo.herencia.teoria.ejemplospolimorfismo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // superclase = new subclase
        AnimalMitologico quimera = new Quimera();
        AnimalMitologico dragon = new Dragon();
        AnimalMitologico animal = new AnimalMitologico();

        ArrayList<AnimalMitologico> animalMitologicos = new ArrayList<>();

        animalMitologicos.add(animal);
        animalMitologicos.add(quimera);
        animalMitologicos.add(dragon);

    }
}
