package PrimeraEvaluacion.Tema02.ejemplos.ejemplosVariables;

public class Ejemplo03 {
    //De momento todas las clases llevan método main
    public static void main(String[] args) {
        // una variable es una palabra que guarda un valor
        // tipos de variables
        // - Numéricas
        //    - enteros
        //     según el tamaño que vayan a ocupar en memoria: byte (8 bits), short (2 bytes), int (4 bytes), long (8 bytes)
        //     se suele utilizar: int, y, si no "cabe", long.
        int año = 2023;
        System.out.println("Empezamos DAM " + año);
        // si quiero cambiar el valor de la variable año:
        año = año + 2;
        System.out.println("Acabaremos DAM en el año " + año);
        //     - en coma flotante
        // tenemos float (32 bits) mejor no utilizarlo y utilizar double (64 bits)
        double sueldo = 20800;
        System.out.println("El sueldo medio de un desarrollador junior es " + sueldo + "€");
        double procentajeSubida = 0.0452; // equivale a 4,52%
        double subidaAnual = sueldo * procentajeSubida; // el valor que guardo en la variable es el resultado
        // de una expresión matemática
        System.out.println("En un año me subirán " + subidaAnual + "€");
// Otro tipo de variable: String= cadena de caracteres, o texto
        String nombre = "Robert";
        String segundoNombre = "George";
        String apellido = "Vorobchevici";
        System.out.println("Mi nombre es " + nombre + " " + segundoNombre + " " + apellido);
    }
}
