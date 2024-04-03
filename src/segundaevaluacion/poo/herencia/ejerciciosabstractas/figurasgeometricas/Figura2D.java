package segundaevaluacion.poo.herencia.ejerciciosabstractas.figurasgeometricas;

import java.util.ArrayList;
import java.util.List;

public abstract class Figura2D {
    protected int lados;
    final int DIMENSIONES = 2;

    // Metodos

    public String nombreFigura() {
        return nombreFigura();
    }

    protected abstract ArrayList<Linea> crearLineas();

    protected abstract double calcularPerímetro();

    protected abstract double calcularÁrea();
}
