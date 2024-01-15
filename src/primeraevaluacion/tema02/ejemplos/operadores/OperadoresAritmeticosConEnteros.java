package primeraevaluacion.tema02.ejemplos.operadores;

import java.util.Scanner;

public class OperadoresAritmeticosConEnteros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int primero = teclado.nextInt();
        int segundo = teclado.nextInt();
        // suma
        int suma = primero + segundo;
        System.out.println(primero + " + " + segundo + " = " + suma);
        // resta
        int resta = primero - segundo;
        System.out.println(primero + " - " + segundo + " = " + resta);
        //multiplicacion
        int multiplicacion = primero * segundo;
        System.out.println(primero + " * " + segundo + " = " + multiplicacion);
//division
        int cociente = primero / segundo;
        System.out.println(primero + " / " + segundo + " = " + cociente);
// resto de la division o modulo
        int resto = primero % segundo;
        System.out.println(primero + " % " + segundo + " = " + resto);
    }
}
