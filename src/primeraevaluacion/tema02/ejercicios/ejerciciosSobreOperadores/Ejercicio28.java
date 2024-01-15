package primeraevaluacion.tema02.ejercicios.ejerciciosSobreOperadores;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();

        boolean resultado = num1 >= num2 && num1 <= num3 || num1 <= num2 && num1 >= num3;
        System.out.println("El numero " + num1 + " esta entre los numeros " +num2 + " y " + num3 + " " + resultado);
    }
}
