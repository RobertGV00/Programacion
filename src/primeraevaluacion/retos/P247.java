package primeraevaluacion.retos;

import java.util.Arrays;
import java.util.Scanner;

public class P247 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int muestras = teclado.nextInt();
        teclado.nextLine();
while (muestras != 0) {
    String linea = teclado.nextLine();
    String[] elementos = linea.split(" ");
    System.out.println(Arrays.toString(elementos));

    muestras = teclado.nextInt();
    teclado.nextInt();
}

    }
}
