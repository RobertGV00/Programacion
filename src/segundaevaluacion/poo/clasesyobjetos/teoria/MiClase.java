package segundaevaluacion.poo.clasesyobjetos.teoria;

public class MiClase {
    // atributos
    int atributo;

    boolean otroAtributo;

    String nombre;
    // constructor -> podemos no ponerlo, y java utilizara el constructor por defecot, es decir el constructor "Invisible", que no recibe parametros, solo crea el objeto vacio.

    // getter y setter -> si queremos ponerlos.

    //  toString() -> podemos no ponerlo

    // métodos de usuario. (normalmente son meotods de instancia, solo podran llamarse a partir de objetos que hayamos creado de esta clase.)

    // metodo que imprime el atributo.
    public void imprimir () {
        System.out.println("Valor del atributo: " + atributo);
        System.out.println("Valor del nuevo atributo: " + otroAtributo);
        System.out.println("Nombre: " + nombre);
    }


}
