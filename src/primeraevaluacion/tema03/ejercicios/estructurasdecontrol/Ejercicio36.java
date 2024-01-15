package primeraevaluacion.tema03.ejercicios.estructurasdecontrol;

public class Ejercicio36 {
    public static void main(String[] args) {
        //Hacer un programa que imprima por pantalla los veinte primeros múltiplos de 5.
        int resto = 0;
        int multiplo = 0;
        while (resto < 20) {
            resto++;
            multiplo = 5 * resto ;
            System.out.println(multiplo);
        }

    }
}
