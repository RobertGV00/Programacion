package segundaevaluacion.poo.clasesyobjetos.ejercicios.ejercito;

public class Unidad {
    //  i. 	Atributos: nombre, unidades (int, estático).

    // ii. 	Constructor: recibe un nombre para la unidad que se crea e incrementa cada vez el número de unidades.

    // Atributos
    private String nombre;
    static int unidades;

// constructor

    public Unidad(String nombre) {
        this.nombre = nombre;
        unidades++;
    }

    @Override
    public String toString() {
        return "Unidad{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
