package segundaevaluacion.poo.herencia.teoria.ejercicioHerencia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Programador extends Empleado{
    protected String[] lenguajes;

    // constructor


    public Programador(String nombre, int añoDeNacimiento, String direccion, LocalDate fechaInicio, Long salario, String[] lenguajes) {
        super(nombre, añoDeNacimiento, direccion, fechaInicio, salario);
        this.lenguajes = lenguajes;
    }
    public Programador() {
        super("",0,"",LocalDate.of(2000,1,1),0L);
    }

    public String[] getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String[] lenguajes) {
        this.lenguajes = lenguajes;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "lenguajes=" + Arrays.toString(lenguajes) +
                ", fechaInicio=" + fechaInicio +
                ", salario=" + salario +
                ", nombre='" + nombre + '\'' +
                ", añoDeNacimiento=" + añoDeNacimiento +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
