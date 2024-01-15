package primeraevaluacion.retos;

import java.util.Scanner;

public class P293 {
    public static void main(String[] args) {
        //ENTRADA
        Scanner teclado = new Scanner(System.in);

        int casos = teclado.nextInt();
        teclado.nextLine();
        for (int i = 0; i < casos ; i++) {
            //cada caso de prueba es una linea
            String linea = teclado.nextLine();
            String[] elementos = linea.split(" ");
            //System.out.println(Arrays.toString(elementos));

            int [] numeros = new int[5];
            // relleno el array de numeros con los elementos convertidos de String a Int
            for (int j = 0; j < 5; j++) {
                numeros[j] = Integer.parseInt(elementos[j]);
            }
            int resultado = (numeros[0] * 6) + (numeros[1] * 8) + (numeros[2] * 10) + (numeros[3] * numeros[4]) * 2;
            System.out.println(resultado);

        }
        teclado.close();

    }
}
