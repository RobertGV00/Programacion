package segundaevaluacion.colecciones.libreria;

import java.util.*;

public class Colecciones {

    public static List<Editorial> obtenerEditoriales() {

        Editorial editorial1 = new Editorial(1,"Hall");
        Editorial editorial2 = new Editorial(2,"Wiley");
        Editorial editorial3 = new Editorial(3,"Wrox");
        Editorial editorial4 = new Editorial(4,"Wesley");
        Editorial editorial5 = new Editorial(5,"Santillana");

        List<Editorial> listaEditorial = new ArrayList<Editorial>();

        listaEditorial.add(editorial1);
        listaEditorial.add(editorial2);
        listaEditorial.add(editorial3);
        listaEditorial.add(editorial4);
        listaEditorial.add(editorial5);

       return listaEditorial;
    }

    public static Editorial buscarEditorial(List<Editorial> lista, int idEditorial) {

        Editorial editorial;
        Iterator<Editorial> it = lista.iterator();

        while (it.hasNext()) {
            editorial = it.next();
            if (editorial.getIdEditorial() == idEditorial) {
                return editorial;
            }
        }
        return null;
    }

    public static List<Libro> obtenerLibro() {
        List<Libro> libros = new ArrayList<>();

        return libros;
    }

    public static Map<String, Editorial> obtenerEditorialPremiadas(){
        Map<String,Editorial> hashEditoriales = new HashMap<String, Editorial>();

        List<Editorial> listaEditorial = obtenerEditoriales();

        hashEditoriales.put("1er Premio", buscarEditorial(listaEditorial,2));
        hashEditoriales.put("2do Premio", buscarEditorial(listaEditorial,4));
        hashEditoriales.put("3er Premio", buscarEditorial(listaEditorial,1));

        return hashEditoriales;
    }


}
