package segundaevaluacion.poo.herencia.teoria.ejemplospolimorfismo1;

class Imagen extends Fichero {

    protected int width;
    protected int height;
    protected byte[] contenido;

    // constructor

    // getters y setters

    @Override
    protected String getInfoFichero() {
        return String.format("Imagen: %s, width: %d, height: %d", nombreCompleto, width, height);
    }
}

