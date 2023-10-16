package PrimeraEvaluacion.Tema03.ejercicios.estructurasDeControl;

public class Ejercicio19 {
    //Hacer un programa que calcule la suma de los números enteros del 1 al 10 (inclusive) usando el bucle for.
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma = suma + i;
            System.out.println("Sumamos " + i + ": " + suma);
        }
        System.out.println("La suma total es " + suma);
    }
}
