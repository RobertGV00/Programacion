package segundaevaluacion.poo.herencia.ejercicios.empresa;

public class Persona {
    /*
    Clase Persona, con los atributos nombre y edad (con los modificadores de acceso adecuados teniendo en cuenta que va a ser la clase padre de una jerarquía de clases), y un método mostrar() que muestre sus valores al ser invocado. Su constructor recibe todos los atributos como parámetros.
     */

    protected String nombre;
    protected int edad;

    // constructor

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //getter y setter.

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // metodo mostrar
}
