package primeraevaluacion.tema02.ejemplos.operadores;
/**
* @see https://drive.google.com/file/d/1s_CGmUs3c-rO7o681OArhINztA_VZnze/view
 */
public class OperadoresLogicos {
    public static void main(String[] args) {
// LOS OPERADORES LOGICOS TRABAJAN CON Y DAN COMO RESULTADO VARIABLES boolean
        // el operador not (!) invierte el valor de la variable a la que afecta.
        System.out.println("**** NOT ****");
    boolean variable = true;
        System.out.println(variable); //true
        variable = !variable;
        System.out.println(variable); // false
        System.out.println("\n\n***** AND Y OR *****");
        // los operadores binarios and, or y not
        // AND
        boolean v1 = true;
        boolean v2 = true;
        boolean resultadoAnd = v1 && v2;
        boolean resultadoOR = v1 || v2;
        System.out.println("AND " + resultadoAnd + "\t OR " + resultadoOR); // true
        v2 = false;
        resultadoAnd = v1 && v2;
        resultadoOR = v1 || v2;
        System.out.println("AND " + resultadoAnd + "\t OR " + resultadoOR); // false
        v1 = false;
        v2 = true;
        resultadoAnd = v1 && v2;
        resultadoOR = v1 || v2;
        System.out.println("AND " + resultadoAnd + "\t OR " + resultadoOR); // false
        v1 = false;
        v2 = false;
        resultadoAnd = v1 && v2;
        resultadoOR = v1 || v2;
        System.out.println("AND " + resultadoAnd + "\t OR " + resultadoOR); // false

        // \t mete una tabulación
    }
}
