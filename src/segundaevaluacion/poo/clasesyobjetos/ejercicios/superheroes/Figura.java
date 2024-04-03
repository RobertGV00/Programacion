package segundaevaluacion.poo.clasesyobjetos.ejercicios.superheroes;

public class Figura {
    // atributos

    private String codigo;
    private double precio;
    private Dimension dimension;
    private Superheroe superheroe;

    // Constructor


    public Figura(String codigo, double precio, Dimension dimension, Superheroe superheroe) {
        this.codigo = codigo;
        this.precio = precio;
        this.dimension = dimension;
        this.superheroe = superheroe;
    }

    // getter y setter

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public Superheroe getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }

    // toString

    @Override
    public String toString() {
        return "Figura{" +
                "codigo='" + codigo + '\'' +
                ", precio=" + precio +
                ", dimension=" + dimension +
                ", superheroe=" + superheroe +
                '}';
    }

    // Metodo Adicional

    public void subirPrecio(double cantidad) {
        if (cantidad > 0 ) {
            this.precio = this.precio + cantidad;
            System.out.println("El nuevo precio es: " + precio);
        } else {
            System.out.println("La cantidad es negativa, no puede ser.");
        }
    }
}
