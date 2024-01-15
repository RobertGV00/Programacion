package primeraevaluacion.Tema04.ejemplos;

import java.util.Arrays;
import java.util.Random;

public class RellenarArrayRandom {
    public static void main(String[] args) {
        Random uno = new Random();
        int[] n = new int[100];
        int max = 1000;
        int min = -1000;
        // quiero rellenar el array con numeros alearioros entre 1000 y -1000
        for (int i = 0; i < n.length ; i++) {
            n[i] = uno.nextInt(min, max + 1);
        }
        System.out.println(Arrays.toString(n));
        // lo orenadmos para ver mas claro cual es el numeroo mayor y menor
        Arrays.sort(n);
        System.out.println(Arrays.toString(n));

    }
}
