package primeraevaluacion.tema03.ejercicios.estructurasdecontrol;

public class Ejercicio26 {
    //Hacer un programa que calcule la suma y el producto de los 30 primeros números naturales. (El 0 no cuenta)
    public static void main(String[] args) {
        int n = 1;
        int suma = 0;
        for (int i = n; i < 31; i++) {
            suma = suma + i;
            System.out.println(   i + " = " + suma);
        }
        int producto = 1;
        for (int i = 1; i < 31; i++) {
            producto = producto * i;
            System.out.println(producto);
        }
    }
}
