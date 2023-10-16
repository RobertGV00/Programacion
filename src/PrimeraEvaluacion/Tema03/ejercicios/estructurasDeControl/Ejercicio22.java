package PrimeraEvaluacion.Tema03.ejercicios.estructurasDeControl;

import java.util.Random;

public class Ejercicio22 {
    public static void main(String[] args) {
        Random generar = new Random();
        int numero = generar.nextInt(1,100);
int suma = 0;
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " ");
            numero = generar.nextInt(1, 100);
            suma = suma + numero;
        }
        System.out.println(" ");
        System.out.println("Suma total " + suma );
        double media = suma / 10;
        System.out.printf("La media es de %.2f" , media);
    }
}
