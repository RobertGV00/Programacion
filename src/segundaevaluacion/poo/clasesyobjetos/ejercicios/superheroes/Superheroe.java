package segundaevaluacion.poo.clasesyobjetos.ejercicios.superheroes;

public class Superheroe {

    // Propiedades
    //Sus propiedades serán:
    // Nombre (nombre del superhéroe)
    // Descripción (cadena para describir brevemente su aspecto)
    // Capa (booleano que indica si el superhéroe lleva o no capa)

    private String nombre;
    private String descripcion;

    private boolean capa;

    // constructor

    public Superheroe(String nombre) {
        this.nombre = nombre;
        this.descripcion = "";
        this.capa = false;
    }

    // getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCapa() {
        return capa;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    // toString

    @Override
    public String toString() {
        String infoCapa = "";
        if (this.capa) {
            infoCapa = "Con capa";
        } else {
            infoCapa = "Sin capa";
        }
        return "Superheroe{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                infoCapa +
                '}';
    }

}
