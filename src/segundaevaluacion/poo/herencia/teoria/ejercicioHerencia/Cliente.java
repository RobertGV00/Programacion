package segundaevaluacion.poo.herencia.teoria.ejercicioHerencia;

public class Cliente extends Persona{
    protected String numeroContrato;
    protected boolean oro;

    public Cliente(String nombre, int añoDeNacimiento, String direccion, String numeroContrato, boolean oro) {
        super(nombre, añoDeNacimiento, direccion);
        this.numeroContrato = numeroContrato;
        this.oro = oro;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numeroContrato='" + numeroContrato + '\'' +
                ", oro=" + oro +
                ", nombre='" + nombre + '\'' +
                ", añoDeNacimiento=" + añoDeNacimiento +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
