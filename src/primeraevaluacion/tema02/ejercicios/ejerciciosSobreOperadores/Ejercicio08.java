package primeraevaluacion.tema02.ejercicios.ejerciciosSobreOperadores;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero de dos cifras");
        int numero = teclado.nextInt();
        // muestra sus cifras invertidas
        int decenas = numero / 10;
        int unidades = numero % 10;
        System.out.println("El numero de dos cifras elegido es el " + numero + ". El numero invertido sería: " +unidades+ + decenas );
    }
}
