package primeraevaluacion.tema02.ejercicios.ejerciciosBasicos02;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        /* Declara variables con el tipo de dato de menos bits posibles que puedan representar el valor. Justifica tu elección.
Si un empleado está casado o no.
Valor máximo no modificable: 999999.
Día de la semana
Día del año.
Sexo: con dos valores posibles 'H' o 'M'
Milisegundos transcurridos desde el 01/01/1970 hasta nuestros días.
Almacenar el total de una factura.
Población mundial del planeta tierra.
*/
        Scanner teclado = new Scanner(System.in);
        // Si un empleado está casado o no.
        System.out.println("Esta usted casado: ");
        String matrimonio = teclado.nextLine();
        String casado = "si";
        boolean estadoCivil = matrimonio.equals(casado);
        System.out.println("El empleado esta casado: " + estadoCivil);
        //Valor máximo no modificable: 999999.
        int dos;

    }
}
