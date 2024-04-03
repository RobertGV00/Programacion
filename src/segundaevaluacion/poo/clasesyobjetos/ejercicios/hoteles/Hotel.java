package segundaevaluacion.poo.clasesyobjetos.ejercicios.hoteles;

import java.util.Objects;

public class Hotel {
    private int idHotel;
    private Zona zona;
    private double precio;

    public Hotel(int idHotel, Zona zona, double precio) {
        this.idHotel = idHotel;
        this.zona = zona;
        this.precio = precio;
    }
    public int getIdHotel() {
        return idHotel;
    }

    public Zona getZona() {
        return zona;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio <= 40 ||  precio >= 500) {
            System.out.println("El precio introducido no esta en el margen, intentelo de nuebo.");
        } else {
        this.precio = precio;
    }
    }


    @Override
    public String toString() {
        return "Hotel{" +
                "idHotel=" + idHotel +
                ", zona=" + zona +
                ", precio=" + precio +
                '}';
    }

    // comparar

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return idHotel == hotel.idHotel && Double.compare(precio, hotel.precio) == 0 && zona == hotel.zona;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHotel, zona, precio);
    }
}
