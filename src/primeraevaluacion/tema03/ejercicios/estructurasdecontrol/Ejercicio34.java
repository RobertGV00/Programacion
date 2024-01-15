package primeraevaluacion.tema03.ejercicios.estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio34 {
    //Escribe un programa que pida números hasta que se introduzca un cero. Debe imprimir la suma y la media de todos los números introducidos (sin contar el 0 con que finaliza el programa).
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int n = teclado.nextInt();
        double contador = 0;
        double suma = 0;
        while (n != 0) {
            contador++;
            suma = suma + n;
            System.out.println("Introduzca un numero");
            n = teclado.nextInt();
        }
        System.out.println(suma);
        System.out.println(contador);
            double media = suma / contador;
        System.out.printf("La media es de : %.2f", media);
    }
}
