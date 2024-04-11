package ejercicios.ejercicio01;

public class Persona {
    private String nombre;
    private int edad;

    // constructor

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // getter y setter

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

    // to string

    @Override
    public String toString() {
        return nombre + " | " + edad;
    }
}
