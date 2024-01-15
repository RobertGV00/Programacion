package segundaevaluacion.poo.clasesyobjetos.ejercicios.hoteles;

import static segundaevaluacion.poo.clasesyobjetos.ejercicios.hoteles.Zona.playa;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(1, playa,80);
        System.out.println(hotel);

        double precio = hotel.getPrecio();
        System.out.println(precio);
        hotel.setPrecio(400);
        precio = hotel.getPrecio();
        System.out.println(precio);
    }
}
