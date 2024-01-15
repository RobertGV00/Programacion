package primeraevaluacion.Tema04.ejemplos;

public class EjemplosArrays {
    public static void main(String[] args) {
        //Hasta ahora, hemos trabajado con variables individuales (solo guardan un valor)
        // ¿Que pasa si quiero guardar las notas de una clase de 16 alumnos?
        double alumno1 = 5.5; // solo puedo guardar un valor
        double alumno2 = 8.5; // solo puedo guardar un valor
        // tendriamos que crear 16 variables

        // o bien....

        // ultiizar una estructura que me permita  guardar un conjunto de valores DEL (double, int, String... el que sea)
        // y para eso el array

        int[] notas = {6, 5 ,4 ,8 ,10 ,3 ,7 ,7 ,5 ,5}; // declarar el array notas, que guarda datos de tipo entero. Si lleva [] es array, si no es una variable normal.

        // queremos recuperar la primera nota, por ejemplo, para imprimprla --> accedeo a traves de los indices
        System.out.println("Elemento guardado en la primera posicion del array");
        System.out.println(notas[0]);
        System.out.println("Numero de elementos del array");
        System.out.println(notas.length);
        System.out.println("El ultimo elemento del array");
        System.out.println(notas[notas.length -1]);
        System.out.println("Mi nota");
        System.out.println(notas[4]);
        //si quiero cambiar un dato lo puedo hacer (cosa que no puedo hacer con String)
        System.out.println("Cambio la primera nota");
        notas[0] = 7;
        System.out.println(notas[0]);

        // FORMAS DE DECLARAR Y RELLENAR UN ARRAY
        // una es la de la linea 15: lo declaro y enumero los datos en orden dentro d e {}
        // lo mas habitual es que no sepas los datos antes de declaralos, entonces se hace
        System.out.println();
        int[] numeros = new int[10]; //10 es el tamaño del array, INMODIFICABLE
        // despues, puedo usar un for (muy frecuente) para rellenarlos
        // por ejemplo, vamos a rellenar el array numeros con el valor de sus indices
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
        }
        System.out.println("Numeros metidos con el for, el ultimo");
        System.out.println(numeros[numeros.length - 1]);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }


    }
}
