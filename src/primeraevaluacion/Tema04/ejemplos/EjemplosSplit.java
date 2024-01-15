package primeraevaluacion.Tema04.ejemplos;

import java.util.Arrays;

public class EjemplosSplit {
    public static void main(String[] args) {
        String cadena = "1 2 3 4 5 6 7 8 9 10";

        // con el metodo slipt creo n array de Strings

        String[] array = cadena.split(" ");
        System.out.println(Arrays.toString(array));
    //Ahora tengo un array de String, pero si queremos hacer operaciones
        //Numericas tengo qe convertir cada elemento a un numero. Lo hacemos asi:
        //1) creo un array para guardar los numero como int
    int [] numeros = new int[array.length];

    //2) lo relleno con los elementos del array de String convertidos uno a uno a int mediante Integer.parseInt(CADENA)
        String uno = "1";
        String dos = "2";

        String suma = uno + dos;
        System.out.println(suma);

        // si yo realmente quiero sumarlos tengo que convertirlos a int: pasarlos de String a Int
        // eso lo hace el metodo Integrar.parseIn(StringQuePareceUnNumero)

        int n1 = Integer.parseInt(uno); // tambien funciona int n1 = Integer.parseIn("1")
        int n2 = Integer.parseInt(dos);
        System.out.println(n1 + n2);
        // La operación contraria seria tener un numero (int) y querer pasarlo a String. Eso se hace con String.valueOf(int)

        // volvemos a nuestro array de String lleno de "números" que todavia no son numeros.
        // Tenemos ya creado el array numeros, ahora lo rellenamos convirtiendo cada elemento de array

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(array[i]); // eesto coge cada elemento de array, lo convierte en int y lo guarda en numeros.
        }
        System.out.println(Arrays.toString(numeros));

        System.out.println(array[0] + array[1] + array[2]);
        System.out.println(numeros[0] + numeros[1] + numeros[2]);
    }
}
