package segundaevaluacion.poo.clasesyobjetos.ejercicios.cajero;

public class Main {
    public static void main(String[] args) {
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente("12345678A", "Perico Palotes");

        //cuentaCorriente1.ingresarDinero();
        //cuentaCorriente1.sacarDinero();
        //cuentaCorriente1.actualizarLibreta();
        System.out.println(cuentaCorriente1);
        //Con el DNI del titular de la cuenta y un saldo inicial.
        CuentaCorriente cuentaCorriente2 = new CuentaCorriente("11111111A", 500);
        System.out.println(cuentaCorriente2);

        //Con el DNI, nombre y el saldo inicial.
        CuentaCorriente cuentaCorriente3 = new CuentaCorriente("12345678C", "John Cena", 1000000);
        System.out.println(cuentaCorriente3);
    }
}
