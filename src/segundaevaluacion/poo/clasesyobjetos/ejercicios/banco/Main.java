package segundaevaluacion.poo.clasesyobjetos.ejercicios.banco;

public class Main {
    public static void main(String[] args) {
        Usuario propietario = new Usuario("demo", "Ale", "Chim Pom");

        Cuenta cuenta = new Cuenta("123456", 1000, propietario);

        mostrarCuenta(cuenta);
    }
    // Un método estático mostrarCuenta, que recibe una cuenta y muestra toda la información de la cuenta.
    public static void mostrarCuenta(Cuenta cuenta) {

        System.out.println(cuenta);
    }
}
