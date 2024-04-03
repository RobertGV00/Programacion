package segundaevaluacion.poo.clasesyobjetos.ejercicios.ejercito;

public class Caballero {
    //   i. 	Atributos: nombre, caballeros (int, estático)
    //   ii. 	Constructor: recibe un nombre para el objeto creado e incrementa cada vez el número de caballeros.

    // atriubutos
    private String nombre;
    static int caballeros;

    // constructor

    public Caballero(String nombre) {
        this.nombre = nombre;
        caballeros++;
    }

    @Override
    public String toString() {
        return "Caballero{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
