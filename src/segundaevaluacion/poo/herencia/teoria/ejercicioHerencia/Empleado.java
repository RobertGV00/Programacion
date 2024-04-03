package segundaevaluacion.poo.herencia.teoria.ejercicioHerencia;

import java.time.LocalDate;
import java.util.Date;

public class Empleado extends Persona{
    protected LocalDate fechaInicio;
    protected Long salario;

    // constructor de la subclase: tiene que empezar llanado al constructor de la superclase con la palabra super.

    public Empleado(String nombre, int añoDeNacimiento, String direccion, LocalDate fechaInicio, Long salario) {
        super(nombre, añoDeNacimiento, direccion);
        this.fechaInicio = fechaInicio;
        this.salario = salario;
    }


    // getter y setter


    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Long getSalario() {
        return salario;
    }

    public void setSalario(Long salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "fechaInicio=" + fechaInicio +
                ", salario=" + salario +
                ", nombre='" + nombre + '\'' +
                ", añoDeNacimiento=" + añoDeNacimiento +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
