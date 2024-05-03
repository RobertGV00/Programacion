package ejercicios.stream.ejercicio02;

public class Personaje {
    private String nombre;
    private int edad;
    private Arma arma;
    private boolean esHumano;

    // constructor

    public Personaje(String nombre, int edad, Arma arma, boolean esHumano) {
        this.nombre = nombre;
        this.edad = edad;
        this.arma = arma;
        this.esHumano = esHumano;
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

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public boolean isEsHumano() {
        return esHumano;
    }

    public void setEsHumano(boolean esHumano) {
        this.esHumano = esHumano;
    }

    // to string

    @Override
    public String toString() {
        return "Nombre = " + nombre + '\'' +
                " Edad = " + edad +
                " Arma = " + arma +
                " Es Humano = " + esHumano + "\n";
    }
}
