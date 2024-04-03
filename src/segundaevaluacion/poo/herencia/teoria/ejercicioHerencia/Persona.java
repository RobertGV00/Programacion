package segundaevaluacion.poo.herencia.teoria.ejercicioHerencia;

public class Persona {
    protected String nombre;
    protected int añoDeNacimiento;
    protected String direccion;


    // constructor de la superclase

    public Persona(String nombre, int añoDeNacimiento, String direccion) {
        this.nombre = nombre;
        this.añoDeNacimiento = añoDeNacimiento;
        this.direccion = direccion;
    }

    // getter y setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoDeNacimiento() {
        return añoDeNacimiento;
    }

    public void setAñoDeNacimiento(int añoDeNacimiento) {
        this.añoDeNacimiento = añoDeNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", añoDeNacimiento=" + añoDeNacimiento +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
