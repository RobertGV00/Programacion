package segundaevaluacion.poo.herencia.teoria.ejemplospolimorfismo1;

public class Fichero {
    protected String nombreCompleto;

    // constructor con un parámetro

    // getters y setters

    public void imprimeInfoFichero() {
        String info = this.getInfoFichero(); // comportamiento polimórfico
        System.out.println(info);
    }

    protected String getInfoFichero() {
        return "Fichero: " + nombreCompleto;
    }
}

