package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosSobreOperadores;

import java.util.Scanner;

public class Ejercicio06 {
    //Escribe un programa que reciba un tiempo en segundos y muestre por pantalla este tiempo pero expresado en horas, minutos y segundos. Por ejemplo, 12.610 segundos son 3 horas, 30 minutos y 10 segundos.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int segundos = teclado.nextInt();

        //Calculos
        //int horas = segundos / 3600;
        //int minutos = segundos / 60 - horas * 60;
        //System.out.print("En " + segundos + " segundos hay " + horas + " horas " + minutos + " minutos y ");
        //segundos = segundos % 60;
        //System.out.print( segundos + " segundos");

        // intento 2
        int horas2 = segundos / 3600; // en cada hora hay 3600 segundos, por lo que si divido los segundos entre 3600 me da las horas contiene
        int resto = segundos % 3600; // el resto son los segundos que sobran tas extraer las horas;
        int minutos2 = resto / 60; // Se divide el resto entre 60 para sacar los minutos, 60 son porque 60 seggundos son 1 minuto
        int segundosRestantes = resto % 60; // son los segundos que quedan al sacar las horas y los minutos


        System.out.println("hay " + horas2 + " horas " + minutos2+ " minutos y " + segundosRestantes+ " segundos");
    }
}

