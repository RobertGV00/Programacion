package ejercicios.compararpersona;

public class Persona {
    private String nombre;
    private int  edad;
    private double altura;

    // constructor


    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    // getter y setter

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    // to string

    @Override
    public String toString() {
        return nombre + " " + edad + " " + altura;
    }
}
