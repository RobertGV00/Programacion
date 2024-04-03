package teoria.interfaces;

public interface InterfazConTodoLoPosible {
    // puedo tener constantes
    int CONSTANTE = 0; // si fuera una clase normal habria que poner public static final

    // puede tener metodos abstractos: en vez de desarrollarlos aqui, los tendran que desarrollar en las clases no abstractas que implementen esa interfaz
    public void metodoAbstracto1(); // a pesar de no poner la palabra abstract aqui es opcional porder poner abstract.
    public int calcularSuma(int num1, int num2); // esto es otro metodo abstracto

    // puede tener metodos por defecto

    public default void metodoPorDefecto() {
        System.out.println("Interfaz: Método por defecto normal y corriente");
    }

    public static void metodoEstatico() {
        System.out.println("Esto es un metodo estatico que esta desarrollado en la interfaz.");
        // Llamando al método privado
        InterfazConTodoLoPosible interfaz = new InterfazConTodoLoPosible() {
            @Override
            public void metodoAbstracto1() {

            }

            @Override
            public int calcularSuma(int num1, int num2) {
                return 0;
            }
        };
        String resultado = interfaz.metodoPrivado();
        System.out.println("Resultado del método privado: " + resultado);
    }

    private String metodoPrivado() {
        return  "\nEste metodo privado solo se puede usar desde esta misma clase";
    }
}
