package PrimeraEvaluacion.Tema02.ejercicios.ejerciciosSobreOperadores;
// A partir de una variable num1 con valor inicial 12 y una variable num2 con valor inicial 4, crear nuevas variables que almacenen el resultado de realizar la suma, resta, multiplicación, división y resto de num1 y num2. Mostrar el valor de las nuevas variables por pantalla.
public class Ejercicio01 {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 4;
        //Suma
        int suma = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + suma);
        //resta
        int resta = num1 - num2;
        System.out.println(num1 + " + " + num2 + " = " + resta);
        //multiplicacion
        int producto = num1 * num2;
        System.out.println(num1 + " + " + num2 + " = " + producto);
        //division
        int coeficiente = num1 / num2;
        System.out.println(num1 + " + " + num2 + " = " + coeficiente);
        // resto o modulo
        int resto = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + resto);
    }
}
