package segundaevaluacion.poo.clasesyobjetos.ejercicios.ejercito;

public class General {

    //   i. 	Atributos: nombre, generales (int, estático).
    //   ii. 	Constructor: recibe un nombre para el objeto creado e incrementa cada vez el número de generales.

    // atriubutos
    private String nombre;
    static int generales;

    // constructor


    public General(String nombre) {
        this.nombre = nombre;
        generales++;
    }

    @Override
    public String toString() {
        return "General{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
