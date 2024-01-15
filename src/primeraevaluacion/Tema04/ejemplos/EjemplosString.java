package primeraevaluacion.Tema04.ejemplos;

public class EjemplosString {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str);// null
        str = ""; // cadena vacia
        System.out.println(str);
        str = "hola";
        System.out.println(str); // hola

        String cadena = "Esto es una cadena";
        System.out.println(cadena);

        String otraCadena = "Esta\n es\n otra cadena";
        System.out.println(otraCadena);

        int longitud = cadena.length();
        System.out.println(longitud);
        System.out.println(cadena.charAt(3));
        System.out.println(cadena.charAt(0));
        System.out.println(cadena.charAt(17));
    // Metodos utiles para trabajar con cadenas de texto
        String cadena1 = "Los ordenadores son buenos siguiendo instrucciones, no leyendo tu mente";
        String cadena2 = "";
        // isEmpty
        System.out.println();
        boolean b1 = cadena1.isEmpty();
        System.out.println("Esta vacía: " + b1);

        // toUpperCase
String s1 = cadena1.toUpperCase();
        System.out.println("Letras mayusculas: " + s1);

        // toLowerCase
        String s2 = cadena1.toLowerCase();
        System.out.println("Letras en minuscula: " + s2);
// startsWith
        b1 = cadena1.startsWith("Los");
        System.out.println(b1);

        // endsWith
        b1 = cadena1.endsWith("mente");
        System.out.println(b1);

        // contains
        b1 = cadena1.contains("buenos");

        // substring

        s1 = cadena1.substring(4, 9);
        System.out.println(s1);

        //replace
        s1 = cadena1.replace("ordenadores", "computadoras" );
        System.out.println(s1);
        // trim
        s1 = cadena1.trim();
        System.out.println(s1);
    }
}
