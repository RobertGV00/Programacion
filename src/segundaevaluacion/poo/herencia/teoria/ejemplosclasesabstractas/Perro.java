package segundaevaluacion.poo.herencia.teoria.ejemplosclasesabstractas;

public class Perro extends Mascota{

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void dice() {
        System.out.println("Guau Guau MotherFucker, Guau Guau Nigga");
    }
}
