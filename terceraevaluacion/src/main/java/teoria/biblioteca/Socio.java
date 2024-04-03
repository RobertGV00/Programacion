package teoria.biblioteca;

import java.time.LocalDate;

public class Socio implements Comparable{
    // atributos:
    private String nombre;
    private String apellidos;
    private LocalDate fechaNac;

    // constructor

    public Socio(String nombre, String apellidos, LocalDate fechaNac) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
    }
    // getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }
    // to String

    @Override
    public String toString() {
        return "Socio{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNac=" + fechaNac +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        // el objeto que entrara por parametro sera de tipo Socio, por lo que tenemos que hacer la conversion.
        Socio s = (Socio) o; // de esta forma, hacemos la conversion con un casting. haciendo que el objeto sea de tipo Socio
        // vamos a comparar los socios según su fecha de nacimiento
        if (this.fechaNac.isBefore(s.fechaNac)){
            return 1; // es decir, si este objeto (this) es mayor (su fecha de nacimiento va antes) que el socio pasado por parametro al metetodo compareTo, el meteodo devuelve 1 (valdria cualquier numero positivo)
        } else if (this.fechaNac.isAfter(s.fechaNac)) { // si la fecha de nacimiento del objeto es posterior a la del socio pasado por parametro, devolvemoos numero negativo
            return -1;
        }else {

            return 0;
        }

    }
}
