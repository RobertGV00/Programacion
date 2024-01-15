package segundaevaluacion.poo.metodos;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio16ArraysConArraysList {
    // quiero un Scanner que sea visible
    static Scanner teclado = new Scanner(System.in);


    public static void main(String[] args) {
        int tamaño = pedirNumero("Introduce el tamaño");
        ArrayList<Integer> numeros = crearArrayList();
        int numeroFinal = pedirNumero("Introduce el numero a añadir: ");

    }

    // metodo que pida el tamaño
    public static int pedirNumero(String texto) {
        System.out.println(texto);
        int numero = teclado.nextInt(); teclado.nextLine();
        return numero;
    }
    public static ArrayList<Integer> crearArrayList() {
        ArrayList<Integer> numeros = new ArrayList<>();
        return numeros;
    }

}
