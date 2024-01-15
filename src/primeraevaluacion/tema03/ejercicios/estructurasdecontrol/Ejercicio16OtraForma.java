package primeraevaluacion.tema03.ejercicios.estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio16OtraForma {
    //Escribe un programa que pida dos números enteros, y pida la operación que quiere realizar con estos (+, -, *, /). El programa debe realizar la operación pedida y visualizar el resultado. En caso de que el símbolo introducido no sea correcto, visualizar: operación incorrecta.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca dos numeros");
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Operacion a realizar: +, -, *, /");
        char operacion = teclado.nextLine().charAt(0);
        switch (operacion){
            case '+':
                System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
                break;
            case '-':
                System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
                break;
            case '*':
                System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
                break;
            case '/':
                System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
                break;
            default:
                System.out.println("Operación incorrecta");
        }
    }
}
