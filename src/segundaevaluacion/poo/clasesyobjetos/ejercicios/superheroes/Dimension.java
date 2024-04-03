package segundaevaluacion.poo.clasesyobjetos.ejercicios.superheroes;

public class Dimension {
    // Atributos

    private double alto;
    private double ancho;
    private double profundidad;

    // constructor

    public Dimension() {
        this.alto = 0;
        this.ancho = 0;
        this.profundidad = 0;
    }

    public Dimension(double alto, double ancho, double profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    // getter y setter


    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    // metodo calculo
    public double getVolume() {
        double volumenMaximo = alto * ancho * (profundidad);
        return volumenMaximo;
    }

    // toString

    @Override
    public String toString() {
        return "Dimension{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", profundidad=" + profundidad +
                ", volumen maximo= " + getVolume() +
                '}';
    }
}
