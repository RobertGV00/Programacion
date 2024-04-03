package segundaevaluacion.poo.clasesyobjetos.ejercicios.ejercicioPractica;

import java.util.ArrayList;
import java.util.List;

public class Colegio {
// Este es el constructor de la clase Colegio, que se utiliza para crear objetos.
    public Colegio(String nombre, String direccion, String telefono, String director, int capacidad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.director = director;
        this.capacidad = capacidad;
    }

// Este metodo permite matricular a un estudiante, en la lista de estudiantes del colegio siempre que haya espacio en el colegio.
    public void matricularEstudiante(Estudiante estudiante){


       if (estudiantes.size()<capacidad){
           estudiantes.add(estudiante);
       }
    }

// Este metodo permite expulsar a un estudiante del colegio, y lo quita de la lista.
    public void expulsarEstudiante(Estudiante estudiante){

        estudiantes.remove(estudiante);
    }

// Este metodo sirve para agregar un nuevo profesor una vez que se le haya contratado.
    public void contratarProfesor(String profesor){

        profesores.add(profesor);

    }

// Este metodo se usa una vez que se le despida a un profesor, haciendo que al despedirlo se pueda remover al profesor.
    public void despedirProfesor(String profesor){

        profesores.remove(profesor);
    }

// Con este metodo se puede agragar un nuevo curso a la lista de cursos del colegio. Es decir que cuando se añada un nuevo curso al colegio, llamamos a este metodo para agregarlo.
    public void agregarCurso(String curso){

        cursos.add(curso);

    }

// Con este metodo se pueden eliminar cursos de la lista del curcos del colegio. Es decir que si hay un curso que ya no damos, lo podemos borrar llamando a este metodo.
    public void eliminarCurso(String curso){

        cursos.remove(curso);

    }
// Con este metodo obtenemos los datos del colegio, este es un Getter.
    public String getDatosColegio(){
        return "Nombre: " + nombre + "Direcion: " + direccion + "Teléfono: " + telefono + "Capacidad: " + capacidad + "Director: " + director;
    }

// Este metodo es un Setter, se utiliza para modificar alguno de los datos del colegio.
    public void setDatosColegio(String nombre, String direccion, String telefono, int capacidad,String director){


        this.nombre=nombre;
        this.direccion=direccion;
        this.telefono=telefono;
        this.capacidad=capacidad;
        this.director=director;

    }

// Este metodo sirve para matricular a un estudiante a un curso, siempre y cuando haya espacio disponible y el curso se imparta en el colegio.

    public void matricularEstudiante(Estudiante estudiante, String curso){

        if(estudiantes.size()<capacidad){
            if (cursos.contains(curso)){
                estudiante.inscribirCurso(curso);

                estudiantes.add(estudiante);
            }else {
                System.out.println("El curso no se imparte en el colegio.");
            }
        } else {
            System.out.println("Capacidad máxima alcanzada");
        }

    }

// Este metodo lo que hace es que al ser llamado nos devuelve una lista de cursos del colegio.
    public List<String> obtenerCursos(){

        return cursos;
    }

// Aqui estan creados los atributos.
    private String nombre, direccion, telefono, director;
    private int capacidad;

// Esto declara una lista llamada estudiantes, y almacena objetos de la clase estudiante.
    private List<Estudiante> estudiantes = new ArrayList<>();

    // Esto declara una lista llamada profesores y almacena una cadena.
    private List<String> profesores = new ArrayList<>();

    // Esto declara una lista llamada cursos y almacena una cadena.
    private List<String> cursos = new ArrayList<>();
}
