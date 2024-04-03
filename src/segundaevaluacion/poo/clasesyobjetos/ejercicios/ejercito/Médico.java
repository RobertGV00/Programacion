package segundaevaluacion.poo.clasesyobjetos.ejercicios.ejercito;

public class Médico {

    //   i. 	Atributos: nombre, médicos (int, estático).
    //  ii. 	Constructor: recibe un nombre para el objeto creado e incrementa cada vez el número de médicos.

    // atributo
    private String nombre;
    static int medico;

    // constructor

    public Médico(String nombre) {
        this.nombre = nombre;
        medico++;
    }
}
