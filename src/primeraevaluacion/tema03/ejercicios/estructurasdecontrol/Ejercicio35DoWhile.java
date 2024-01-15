package primeraevaluacion.tema03.ejercicios.estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio35DoWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int n = teclado.nextInt();
        System.out.println("El numero introducido es " + n);
        int numero = n;
        do {
            if (n != 0){
                n = teclado.nextInt();
            }
            if (n > numero && n != 0)
            {
                numero = n;
            }
            System.out.println("Introduzca un numero");
            n = teclado.nextInt();
            System.out.println("El numero introducido es el " + n );
        } while (n !=0);
        System.out.println("El numero mayor es el " + numero);
    }

}

