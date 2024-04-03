package hoteles;

public class MainHotel {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(1, Zona.playa,80);
        Hotel hotel2 = new Hotel(1, Zona.playa,80);
        Hotel hotel3 = new Hotel(2, Zona.playa,80);

       /* double precio = hotel.getPrecio();
        System.out.println(precio);
        hotel.setPrecio(400);
        precio = hotel.getPrecio();
        System.out.println(precio);*/

        // comparar con el equals
        System.out.println("¿Son iguales el hotel1 y el hotel2? " + hotel.equals(hotel2));
        System.out.println("Son iguales el hotel 1 y el hotel 3 " + hotel.equals(hotel3));

        // hashcode
        int hashCode1 = hotel.hashCode();
        int hashCode2 = hotel2.hashCode();
        int hashCode3 = hotel3.hashCode();
        System.out.println(hashCode1);
        System.out.println(hashCode2);
        System.out.println(hashCode3);
        System.out.println("¿Son iguales el hotel 1 y 2? " + (hashCode1 == hashCode2));
        System.out.println("¿Son iguales el hotel 1 y 3? " + (hashCode1 == hashCode3));
    }
}
