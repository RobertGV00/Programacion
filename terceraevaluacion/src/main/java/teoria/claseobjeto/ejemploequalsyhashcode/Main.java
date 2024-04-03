package teoria.claseobjeto.ejemploequalsyhashcode;

public class Main {
    public static void main(String[] args) {
        // creamos usuario
        Usuario usuario1 = new Usuario("pepe", "1234");
        Usuario usuario2 = new Usuario("pepe", "12345");
        Usuario usuario3 = new Usuario("Jose", "12345");
        // comparar los dos usuarios
        System.out.println(usuario1.equals(usuario2));

        // ahora vamos a ver que hace hashCode()
        int hashcode1 = usuario1.hashCode();
        System.out.println("HasCode de usuario1: " + hashcode1);
        int hashcode2 = usuario2.hashCode();
        System.out.println("HashCode de usuario2: " + hashcode2);
        System.out.println("¿Son iguales? " + (hashcode1 == hashcode2));
        int hashCode3 = usuario3.hashCode();
        System.out.println("HashCode de usuario3: " + hashCode3);

        // en conclusion, para comparar objetos entre si podemos utilizar uno u otro.

    }
}
