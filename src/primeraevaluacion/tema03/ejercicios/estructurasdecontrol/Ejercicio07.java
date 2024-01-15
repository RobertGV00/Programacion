package primeraevaluacion.tema03.ejercicios.estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio07 {

    // A las marmotas les gusta organizar fiestas, y en sus fiestas les gusta comer tazas de mantequilla de cacahuete. Pero no debe haber muchas, porque si no enferman. Una fiesta de la marmota exitosa tiene entre 10 y 20 tazas de mantequilla de cacahuete, ambas inclusive, a menos que sea fin de semana, en cuyo caso necesitarán de 15 a 25 tazas.
    //Escribe un programa que lea dos valores:
    //El primero es el número de tazas de mantequilla de cacahuete que hay en la fiesta.
    //El segundo es un booleano que indica si es fin de semana.
    //El programa debe imprimir si la fiesta tiene éxito o no (true o false).
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero ");
        int tazas = teclado.nextInt();
        System.out.println("¿Es fin de semana? ");
        boolean finDeSemana = teclado.nextBoolean();
        System.out.println(finDeSemana);
        boolean exito = false;
        if (finDeSemana) {
            exito = tazas >= 15 && tazas <= 25;
        }else  {
            exito = tazas >= 10 && tazas <=20;
        }
        if (exito) {
            System.out.println("La fiesta ha sido un exito");
        }else {
            System.out.println("La fiesta ha fracasado");
        }
    }

}
