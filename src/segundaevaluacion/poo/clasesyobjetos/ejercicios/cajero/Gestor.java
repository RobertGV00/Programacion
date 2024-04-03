package segundaevaluacion.poo.clasesyobjetos.ejercicios.cajero;

public class Gestor {

    // Diseñar la clase Gestor de la que interesa guardar su nombre, teléfono y el importe máximo autorizado con el que pueden operar.
    private String nombre;
    private int telefono;
    private int importeMaximo;
    // Con respecto a los gestores, existen las siguientes restricciones:
    //Un gestor tendrá siempre un nombre y un teléfono.
    // constructor

    public Gestor(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = 10000;
    }

    // getter y setter

    public int getTelefono() {
        return telefono;
    }


    // Un gestor, una vez asignado, no podrá cambiar su número de teléfono. Y todo el mundo podrá consultarlo.

    // Modificar la clase CuentaCorriente para que pueda disponer de un objeto Gestor. Escribir los métodos necesarios.
}
