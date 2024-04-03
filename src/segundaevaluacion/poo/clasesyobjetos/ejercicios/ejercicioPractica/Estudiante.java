package segundaevaluacion.poo.clasesyobjetos.ejercicios.ejercicioPractica;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {

    // Este es el constructor de la clase Estudiante, que se utiliza para crear objetos.
    public Estudiante(String nombre, String apellido, String fechaNacimiento, String direccion, String telefono, String email, Colegio colegio) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.colegio=colegio;
    }
// Este metodo le permite al estudiante inscibirse a un curso, siempre y cuando el curso se imparta en el colegio.
    public void inscribirCurso(String curso){

        if(colegio.obtenerCursos().contains(curso)){
            cursosInscritos.add(curso);
        } else {
            System.out.println("El curso no se imparte en el colegio");
        }

    }
// Este metodo permitiría a un alumno abandonar un curso. Esta incompleto y en el video no vi que lo rellenara, yo pondría esto: cursosInscritos.remove(curso); haciendo asi que funcione y le deje abandonar el curso.
    public void abandonarCurso(){


    }
// al llamar a este metodo se obtendra la edad del estudiante.
    public int obtenerEdad(){

        return 0;
    }

// Al llamar a este metodo se obtendrá una lista que contiene los nombres de los cursosInscritos de los estudiantes.
    public List<String> obtenerCursosInscritos (){


        return cursosInscritos;
    }


// Este es un metodo Setter y se utiliza para modificar algunos de los datos de los estudiantes.
    public void setDatosContacto(String direccion,String telefono, String email){


        this.direccion=direccion;
        this.telefono=telefono;
        this.email=email;

    }

    // Con este metodo obtenemos los datos de los estudiantes, este es un Getter.
    public String getDatosEstudiante(){

        return "ID: " + id + "Nombre: " + nombre + apellido + "Fecha de nacimiento: " + fechaNacimiento + "Dirección: " + direccion + "Teléfono: " + telefono + "Email: " + email;

    }

    // Aqui estan creados los atributos.
    private String id, nombre, apellido, fechaNacimiento, direccion, telefono, email;
    private Colegio colegio;


    // Esto declara una lista llamada cursosInscritos y almacena una cadena.
    private List<String> cursosInscritos=new ArrayList<>();
}

