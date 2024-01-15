package primeraevaluacion.tema03.ejercicios.estructurasdecontrol;

import java.util.Scanner;
//Escribe un programa que pida una fecha (día, mes y año) y diga si es correcta. Suponemos que el año no es bisiesto.
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la fecha: ");
        int dia = teclado.nextInt();
        int mes = teclado.nextInt();
        int año = teclado.nextInt();
        if (año >= 0 ){
            if (mes >=1 && mes <= 12 ) {

            }
            System.out.println("La fecha introducida es correcta ");
        }else {
            System.out.println("Fecha incorrecta");
        }
    }
}
