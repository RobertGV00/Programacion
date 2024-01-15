package primeraevaluacion.tema03.ejercicios.estructurasdecontrol;

public class Ejercicio37 {
    public static void main(String[] args) {
        int resto = 0;
        int n = 0;
        while (resto < 50) {
            resto++;
            n = 5 * resto ;
            System.out.print(n + "\t");
            if ( resto % 10 == 0) {
                System.out.println();
            }

        }
    }
}

