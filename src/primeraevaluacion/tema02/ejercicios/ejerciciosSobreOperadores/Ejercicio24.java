package primeraevaluacion.tema02.ejercicios.ejerciciosSobreOperadores;

import java.util.Scanner;

public class Ejercicio24 {
    /*
    Un alumno desea saber cual será su nota final en un módulo. Dicha calificación se compone de los siguientes porcentajes:
El 55% se obtiene del promedio de la nota de las tres evaluaciones..
El 30% se obtiene de la nota en un examen final.
El 15% se obtiene de de la calificación de un trabajo final.

     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Intoduce la nota de la primera evaluación: ");
        double evaluacion1 = teclado.nextDouble();
        System.out.println("Intoduce la nota de la segunda evaluación: ");
        double evaluacion2 = teclado.nextDouble();
        System.out.println("Intoduce la nota de la tercera evaluación: ");
        double evaluacion3 = teclado.nextDouble();
        double media = (evaluacion1 + evaluacion2 + evaluacion3) / 3;
            System.out.println("La nota media de los tres trimestres es: " + media);
            System.out.println();
            System.out.println("Nota del examen final: ");
        double nota = teclado.nextDouble();
            System.out.println("Nota del trabajo final: ");
        double trabajo = teclado.nextDouble();
        //Procentajes
        double procentajeNotaMedia = media * 0.55;
            System.out.println("Procentaje de la nota media " + procentajeNotaMedia);
        double procentajeExamenFinal = nota * 0.30;
            System.out.println("Procentaje del examen final " + procentajeExamenFinal);
        double procentajeTrabajo = trabajo * 0.15;
        System.out.println("Procentaje del trabajo final " + procentajeTrabajo);
        double notaFinal = procentajeNotaMedia + procentajeExamenFinal + procentajeTrabajo;
            System.out.printf("\nTu nota final del modulo es %.2f ", notaFinal);
    }
}
