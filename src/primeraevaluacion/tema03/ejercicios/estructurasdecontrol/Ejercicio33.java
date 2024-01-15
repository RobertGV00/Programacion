package primeraevaluacion.tema03.ejercicios.estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio33 {
    //Escribe un programa que cuente la cantidad de números que vamos introduciendo por teclado. Cuando el programa lee 0, debe terminar y mostrar la longitud de la secuencia (sin contar el 0 final).
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int n = teclado.nextInt();
        int suma = 0;
        while (n != 0) {
            suma = suma + 1;
            n = teclado.nextInt();
        }
        System.out.println(suma);
    }
}
