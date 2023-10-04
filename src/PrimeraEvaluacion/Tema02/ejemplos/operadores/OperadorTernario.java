package PrimeraEvaluacion.Tema02.ejemplos.operadores;

import java.util.Scanner;

public class OperadorTernario {
    /*
    Es un operator ternario que permite asignar un valor u otro a una variable en función de que se cumpla o no una condición. Es una forma reducida de utilizar una sentencia if .. else en casos específicos.

    La síntaxis del operador es:

    resultado = condicion ? valorSiVerdadero: valorSiFalso
     */
    public static void main(String[] args) {
// Probar si un numero es par o impar
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        String cadena = numero % 2 == 0 ? "Es numero par" : "Es numero impar"; // si al dividir numero entre dos da coo resto 0, guarda en cadena Es numero par y, si es falso guarda en cadena es numero impar.
        System.out.println(numero + " " + cadena);

        // podemos hacer esto tambien de forma que guarde el boolean resultante
        boolean resultado = numero % 2 == 0 ? false : true;
        System.out.println(numero + " " + resultado);
    }
}
