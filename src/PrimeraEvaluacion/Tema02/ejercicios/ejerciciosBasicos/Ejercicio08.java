package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosBasicos;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        System.out.println("Entrada: ");
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Nombre ");
        String Nombre = Teclado.nextLine();
        System.out.println("Edad ");
        int Edad = Teclado.nextInt();
        System.out.println("Años de experiencia ");
        // El metodo nextInt ademas de dar dato, guarda un salto de linea, asi que si pedimos algo por teclado, a continuacion, puede fallar. Entonces, siempre que utilicemos nextInt vamos a añadir a continuación esta linea:
        int AñosDeExperiencia = Teclado.nextInt();
        Teclado.nextLine();
        System.out.println("Preferencia de cocina");
        String PreferenciaDeCocina = Teclado.nextLine();
        System.out.println("Salida:");
        System.out.println("El formularios de " + Nombre + ", de " + Edad + " años y " + AñosDeExperiencia + " de experiencia, esta completo.\nNos comunicaremos con usted si necesitamos alguien que cocine comida " + PreferenciaDeCocina);
    }
}
