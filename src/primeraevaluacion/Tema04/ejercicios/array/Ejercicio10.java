package primeraevaluacion.Tema04.ejercicios.array;

import java.util.Scanner;

// Haz un programa que pida un número al usuario un número de mes (por ejemplo, el 4) y diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar arrays. Para simplificarlo vamos a suponer que febrero tiene 28 días
public class Ejercicio10 {
    public static void main(String[] args) {
        // Hacemos un array con los dias del mes.
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String [] meses = {"Enero" , "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        // pedimos un numero al usuario y comprobamos que es correcto; ejemplo 6.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int mes = 0;
        do {
            mes = teclado.nextInt();
            // si no es correcto, se lo decimos.
            if (mes < 1 || mes > 12) {
                System.out.println("Incorrecto");
            }
        } while (mes < 1 || mes > 12);
        // tenemos que decir cuantos días tiene;
        System.out.println(meses[mes - 1] + " Tiene " + dias[mes - 1] + " dias");
    }
}
