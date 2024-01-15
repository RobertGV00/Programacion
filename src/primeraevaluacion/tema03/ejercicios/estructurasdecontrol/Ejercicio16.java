package primeraevaluacion.tema03.ejercicios.estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio16 {
    //Escribe un programa que pida dos números enteros, y pida la operación que quiere realizar con estos (+, -, *, /). El programa debe realizar la operación pedida y visualizar el resultado. En caso de que el símbolo introducido no sea correcto, visualizar: operación incorrecta.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca dos numeros");
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        System.out.println("Selecciona una opcion del menu");
        System.out.println("0 = +");
        System.out.println("1 = -");
        System.out.println("2 = *");
        int elegir = teclado.nextInt();
        int resultado;
        switch (elegir) {
            case 0 :
                resultado = n1 + n2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 1 :
                resultado = n1 - n2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 2:
                resultado = n1 * n2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            default:
                System.out.println("Operacion incorrecta ");
        }
    }
}
