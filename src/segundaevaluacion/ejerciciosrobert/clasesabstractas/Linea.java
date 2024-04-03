package segundaevaluacion.ejerciciosrobert.clasesabstractas;

public class Linea {
    final int dimensiones = 2;
    private Punto puntoIncio;
    private Punto puntoFin;


    // comstructor

    public Linea(Punto puntoIncio, Punto puntoFin) {
        this.puntoIncio = puntoIncio;
        this.puntoFin = puntoFin;
    }

    // calcular

    public double calcularLongitud() {

        return calcularLongitud();
    }

    // toString


    @Override
    public String toString() {
        return "Linea{" +
                "dimensiones=" + dimensiones +
                ", puntoIncio=" + puntoIncio +
                ", puntoFin=" + puntoFin +
                '}';
    }

    // dibujarLinea

    public void dibujarLinea() {

    }

}
