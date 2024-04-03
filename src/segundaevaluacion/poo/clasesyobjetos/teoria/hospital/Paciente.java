package segundaevaluacion.poo.clasesyobjetos.teoria.hospital;

import java.util.Arrays;

public class Paciente {
    private String nombre;
    private int edad;
    private String[] sintomas;

    // sobrecarga de constructores: tener uno o mas constructores, cada uno con diferente número u orden de parámetros.
// 1) constructor sin parametros: Sería el constructor por defecto si no hubiera ningún constructor explicito.
    public Paciente() {

    }
// 2) Constructor con los tres atributos como parametros.
    public Paciente(String nombre, int edad, String[] sintomas) {
        this.nombre = nombre;
        this.edad = edad;
        this.sintomas = sintomas;
    }
// 3) quiero un constructor para cuando tenga que crear un objeto de tipo paciente y solo quiera el nombre

    public Paciente(String nombre) {
        this.nombre = nombre;
        // adémas lle puedo indicar valores para los otros parámetros.
        // si no sé la edad, que valga 999 por defecto.
        this.edad = 999;
        // si no sé los síntomas, inicializo el array de síntomas, ponemos "Desconocido"
        this.sintomas = new String[]{"Desconocido"};
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

    public String[] getSintomas() {
        return sintomas;
    }

    public void setSintomas(String[] sintomas) {
        this.sintomas = sintomas;
    }

    // toString()

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sintomas=" + Arrays.toString(sintomas) +
                '}';
    }
}
