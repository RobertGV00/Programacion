package segundaevaluacion.colecciones.libreria;

public class Autor extends Persona{
    private String codAutor;

    //getter y setter

    public String getCodAutor() {
        return codAutor;
    }

    public void setCodAutor(String codAutor) {
        this.codAutor = codAutor;
    }

    public Autor(String codAutor) {
        this.codAutor = codAutor;
    }

    public Autor(int idPersona, String nombre, String apellido, String codAutor) {
        super(idPersona, nombre, apellido);
        this.codAutor = codAutor;
    }


}
