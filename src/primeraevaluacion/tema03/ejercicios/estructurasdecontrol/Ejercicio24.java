package primeraevaluacion.tema03.ejercicios.estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        // [FOR ANIDADO] Escribe un programa que reciba dos valores enteros por teclado, a y b, y dibuje un rectángulo en que la base sea el número mayor y la altura el número menor, con un carácter también introducido por teclado.
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
char caracter = teclado.next().charAt(0);
int mayor, menor;
if (a > b) {
    mayor = a;
    menor = b;
}else{
    mayor = b;
    menor = a;
}
        for (int i = 1; i <= menor; i++) {
            for (int j = 1; j <= mayor; j++) {
                System.out.print(caracter + " ");
            }
            System.out.println();
        }
    }
}
