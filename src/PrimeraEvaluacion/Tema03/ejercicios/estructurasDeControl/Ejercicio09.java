package PrimeraEvaluacion.Tema03.ejercicios.estructurasDeControl;

import java.time.LocalDate;
import java.util.Scanner;
//Escribe un programa que pida una fecha (día, mes y año) y diga si es correcta. Suponemos que el año no es bisiesto.
public class Ejercicio09 {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la fecha de hoy: ");
        int dia = teclado.nextInt();
        int mes = teclado.nextInt();
        int año = teclado.nextInt();
        if (dia == 02 && mes == 11 && año == 2023 ){
            System.out.println("La fecha introducida es correcta, hoy estamos a " + hoy);
        }else {
            System.out.println("Fecha incorrecta");
        }
    }
}
