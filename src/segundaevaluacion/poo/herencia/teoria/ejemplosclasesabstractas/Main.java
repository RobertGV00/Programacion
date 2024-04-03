package segundaevaluacion.poo.herencia.teoria.ejemplosclasesabstractas;

public class Main {
    public static void main(String[] args) {
// no podemos inistanciar Mascota porque es abstracta
        Gato gato = new Gato("Garfield", 5);
        gato.dice();

        Perro perro = new Perro("John", 3);
        perro.dice();
    }
}
