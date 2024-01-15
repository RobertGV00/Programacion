package primeraevaluacion.tema03.ejercicios.estructurasdecontrol;

import java.util.Scanner;

//Escribe un programa que pida una fecha (día, mes y año) y diga si es correcta. Suponemos que el año no es bisiesto.
public class Ejercicio09bis {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String fecha = teclado.nextLine();
        String[] arrayFecha = fecha.split("-");
        //
        int dia = Integer.parseInt(arrayFecha[0]);
        int mes = Integer.parseInt(arrayFecha[1]);
        int año = Integer.parseInt(arrayFecha[2]);
        //
if (año >= 0) {
    if (mes >= 1 && mes <=12){
        if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia >= 1 && dia <= 31){
            System.out.println("La fecha es correcta");
        }else {
            if ((mes == 4 || mes == 6 || mes == 9 || mes == 11)&& dia >= 1 && dia <= 30) {
                System.out.println("La fecha es correcta");
            }else {
                if (dia >= 1 && dia <= 28) {
                    System.out.println("La fecha es correcta");
                }else {
                    System.out.println("La fecha es incorrecta");
                }
            }
        }
    }else {
        System.out.println("Fecha incorrecta");
    }
}else {
    System.out.println("Fecha incorrecta");
}
    }
}
