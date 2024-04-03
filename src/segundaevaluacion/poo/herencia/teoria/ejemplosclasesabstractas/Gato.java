package segundaevaluacion.poo.herencia.teoria.ejemplosclasesabstractas;

public class Gato extends Mascota {

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void dice() { // dice() es obligatoria sobrescribirlo porque es un metodo abstracto.
        System.out.println("Miauuuu");
    }
}
