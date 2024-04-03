package teoria.interfaces;

public class Main {
    public static void main(String[] args) {
        Clase clase = new Clase();
        clase.metodoAbstracto1();
        // probamos el metodo abstracto2
        System.out.println(clase.calcularSuma(2,2));
        // metodo por defecto
        clase.metodoPorDefecto();
        //metodo estatico y dentro de el el private
        InterfazConTodoLoPosible.metodoEstatico();

    }
}
