package teoria.claseobjeto;

public class MainObject {
    public static void main(String[] args) {
        EjemploObject eo = new EjemploObject("Ojbeto", 1);
        // por tener implementado el metodo toString basta meter el objeto en el sout
        System.out.println(eo);

        // puedo saber la ruta de la clase a la que pertenece este objeto.
        // con el meptpd getClass()
        String rutaClase = String.valueOf(eo.getClass());
        System.out.println("Esta clase esta en: " + rutaClase);

    }
}
