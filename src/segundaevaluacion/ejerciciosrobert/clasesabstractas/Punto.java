package segundaevaluacion.ejerciciosrobert.clasesabstractas;

public class Punto {
    private double x;
    private double y;

    // constructor

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }


    // toString


    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
