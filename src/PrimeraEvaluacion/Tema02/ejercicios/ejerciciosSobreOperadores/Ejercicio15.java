package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosSobreOperadores;

import java.util.Scanner;

public class Ejercicio15 {
    /*
    Hacer un programa que lea una temperatura en grados centígrados y la visualice en las escalas reamur, Fahrenheit y kelvin, teniendo en cuenta que
		Reamur = Centígrados x 0.8
        Fahenheit = (Centígrados * 9/5)+32
        Kelvin = Centígrados + 273
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la temperatura en centígados: ");
        double centigrados = teclado.nextDouble();
        double reamur = centigrados * 0.8;
        System.out.printf("La temperatura en reamur es de %.2f\n" , reamur);
        double fahenheit = (centigrados*9/5)+32;
        System.out.printf("La temperatura en fahenheit es de %.2f \n" , fahenheit );
        double kelvin = centigrados + 273;
        System.out.printf("La temperatura en kelvin es de %.2f" , kelvin);

    }
}
