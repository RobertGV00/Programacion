package teoria.claseobjeto;

public class EjemploObject {
    // esta clase y todas las demas, heredan de Object
    String nombre;
    int id;

    public EjemploObject(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }
// to string
    @Override
    public String toString() {
        return "EjemploObject{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                '}';
    }


}
