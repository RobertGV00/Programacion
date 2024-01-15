package primeraevaluacion.tema02.ejemplos.ejemplosprint;

public class Ejemplos {
    public static void main(String[] args) {
        //printIn ---> Imprime el contenido dentro de los parentesis y añade un salto de linea.
        System.out.println("hola, mundo");
        System.out.println("Otra linea");
        //print ---> Imprime el contenido péro no añade salto, por lo que si tenemos un print a continuacion de otro, saldran ambos en la misma linea.
        System.out.println();
        System.out.print("Hola,");
        System.out.print("mundo");
        //printf ---> Imprine con formato
        /*
        Este método permite formatear y mostrar datos utilizando especificadores de formato, como %s para cadenas, %d para enteros, %f para números de punto flotante, etc.
         */
        System.out.println();
        String nombre = "Juan";
        System.out.printf("Nombre: %s", nombre); //printf no lleva + para las variables si no una coma.
        int edad = 25;
        double altura = 1.75;
        System.out.println();
        System.out.printf("Nombre: %s, Edad: %d, Altura: %.2f.", nombre, edad, altura);
    }
}
