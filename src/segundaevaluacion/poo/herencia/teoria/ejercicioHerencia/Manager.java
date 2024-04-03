package segundaevaluacion.poo.herencia.teoria.ejercicioHerencia;

import java.time.LocalDate;

public class Manager extends Empleado{
    protected boolean sonrisa;

    // constructor


    public Manager(String nombre, int añoDeNacimiento, String direccion, LocalDate fechaInicio, Long salario, boolean sonrisa) {
        super(nombre, añoDeNacimiento, direccion, fechaInicio, salario);
        this.sonrisa = sonrisa;
    }

    public boolean isSonrisa() {
        return sonrisa;
    }

    public void setSonrisa(boolean sonrisa) {
        this.sonrisa = sonrisa;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "sonrisa=" + sonrisa +
                ", fechaInicio=" + fechaInicio +
                ", salario=" + salario +
                ", nombre='" + nombre + '\'' +
                ", añoDeNacimiento=" + añoDeNacimiento +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
