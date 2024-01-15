package segundaevaluacion.poo.clasesyobjetos.videospoo3.ventanas;

public class Ventana {
    // propiedades, atributos, campos, variables miembro.
    private int ancho;
    private int alto;
    private Color color;

    // Método contructor parametrizado

    public Ventana(int ancho, int alto, Color color) {
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
    }
    // para poder cambiar lo valores de los atributos privados utilizamos gatters y setters

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        // si queremos que el ancho maximo sean 2048 px
        if (ancho > 2048){
            System.out.println("El tamaño maximo es 2048");
        } else{
            this.ancho = ancho;
        }
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    // utilidades:
    // el metodo toString() sirve para imiprimir los valores de los atributos


    @Override
    public String toString() {
        return "Ventana{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", color=" + color +
                '}';
    }

    // métodos de usuarios

    public void aparecer() {
        System.out.println("Pum. La ventana aparece");
    }
    public void cerrar() {
        System.out.println("Poff. La ventana se cierra");
    }
}
