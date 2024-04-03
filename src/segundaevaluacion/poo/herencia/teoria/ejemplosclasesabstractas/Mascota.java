package segundaevaluacion.poo.herencia.teoria.ejemplosclasesabstractas;

public abstract class Mascota { // con la palabra abstract hacemos que esta clase sea abstracta.
    protected String nombre;
    protected int edad;
// constructor
    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    // metodo abstracto: no lo desarrollamos aquí, solo lo dejamos declarado, pero todas las subclases deberán obilgatoriamente desarrollarlo
    public abstract void dice();

    }

