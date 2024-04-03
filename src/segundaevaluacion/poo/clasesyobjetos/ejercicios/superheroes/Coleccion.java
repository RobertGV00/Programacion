package segundaevaluacion.poo.clasesyobjetos.ejercicios.superheroes;

import java.util.ArrayList;

public class Coleccion {
    // atributos

    private String nombreColeccion;
    private ArrayList<Figura> listaFiguras;

    // constructor

    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        this.listaFiguras = new ArrayList<>();
    }

    // getter y setter


    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    // Metodo modificador

    public void añadirFigura(Figura fig) {
        listaFiguras.add(fig);
    }


}
