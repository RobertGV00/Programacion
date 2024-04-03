package teoria.interfaces;

public class Clase implements InterfazConTodoLoPosible {
    @Override
    public void metodoAbstracto1() {
        System.out.println("Este es el metodo abstracto que hemos desarrollado en la clase");
    }

    @Override
    public int calcularSuma(int num1, int num2) {
        System.out.println("El resultado de la suma es:");
        return num1 + num2;
    }
}
