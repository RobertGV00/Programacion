package segundaevaluacion.colecciones.libreria;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //System.out.println(Colecciones.obtenerEditoriales());

        // obtener
        List miList = Colecciones.obtenerEditoriales();
        Editorial editorial = Colecciones.buscarEditorial(miList, 4);
        System.out.println(editorial.getNombre());


    }
}
