package segundaevaluacion.poo.clasesyobjetos.teoria.ejemplosestaticos;

public class Clase {
    private String nombre;
    // esto es otro atributo, no es una variable estatica, por lo cual, solamente la podemos modificar en cada ejemplo completo.
    int otraVariable;
    // añadimos una variable estatica; no la hacemos private
    static int contarObjetos;

    public Clase(String nombre) {
        this.nombre = nombre;
        // comp queremos contar los objetos que vamos creando, incrementamos la variable contarObjetos:
        contarObjetos++;
        // con cada objetp que creo, se ira incrementado contar objetos.
        otraVariable++;

    }

    @Override
    public String toString() {
        return "Clase{" +
                "nombre='" + nombre + '\'' +
                ", otraVariable=" + otraVariable +
                '}';
    }

    // método de instancia
    public void imprimirCosas() {
        System.out.println(this.toString());
    }

    // método estatico
    public static void imprimirOtrasCosas() {
        System.out.println(contarObjetos);
    }
}
