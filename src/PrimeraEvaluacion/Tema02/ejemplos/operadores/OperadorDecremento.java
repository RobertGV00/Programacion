package PrimeraEvaluacion.Tema02.ejemplos.operadores;

public class OperadorDecremento {
    public static void main(String[] args) {
        // Operador de incremento
        // sirve para añadir una unidad a una variable de tipo entero
        int variable = 0;
        System.out.println(variable + " Antes de hacer un decremento");
        variable--; // incremetno la variable en una unidad
        System.out.println(variable + " Despues de decremento");
        variable--; // incremetno la variable en una unidad
        System.out.println(variable + " Despues de decremento");
        // y asi sucesivamente
        // es lo mismo que hacer variable = variable + 1.
        variable = variable - 1;
        System.out.println(variable + "Restando");
        variable -= variable;
        System.out.println(variable + " Despues de poner -=");
    }
}
