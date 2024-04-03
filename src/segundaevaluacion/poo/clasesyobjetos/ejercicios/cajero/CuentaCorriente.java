package segundaevaluacion.poo.clasesyobjetos.ejercicios.cajero;

import java.util.Scanner;

public class CuentaCorriente {
    static Scanner teclado = new Scanner(System.in);
    // CuentaCorriente, que almacena los datos: DNI, nombre del titular y saldo.
    private String dni;
    private String nombreDelTitular;
    private double saldo;
    private Gestor gestor;

    // constructor

    public CuentaCorriente(String dni, String nombreDelTitular) {
        this.dni = dni;
        this.nombreDelTitular = nombreDelTitular;
        // El saldo inicial será 0.
        this.saldo = 0;
    }

    // getter y setter -> Solo se necesita en gestor
    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    // Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación, si existe saldo suficiente.
    public void sacarDinero() {
        // preguntamos cuanto dinero desea sacar
        System.out.println("Cantidad a retirar: ");
        int retirada = teclado.nextInt(); teclado.nextLine();
        // ver si la cuenta tiene saldo suficiente
        if (saldo >=  retirada) {
            System.out.println("La retirada se ha realizado con exito, te quedan" + saldo + " en la cuenta");
        } else {
            System.out.println("Saldo insuficiente ");
        }
    }
    // Ingresar dinero: se incrementa
    public void ingresarDinero(){
        System.out.println("Cantidad a ingresar: ");
        int ingreso = teclado.nextInt(); teclado.nextLine();
        if (ingreso > 0) {
            saldo = saldo + ingreso;
            System.out.println("Saldo actualizado correctamente, ahora tienes " + saldo + " en la cuenta");
        } else {
            System.out.println("No puede ser");
        }
    }

    // Mostrar información: muestra la información disponible de la cuenta corriente.
    public void actualizarLibreta(){
        System.out.println("Titular: " + nombreDelTitular);
        System.out.println("Saldo: " + saldo);
        System.out.println("******** Libreta actualizada ********");
    }
    // Sobrecarga los constructores para poder crear objetos:
    //Con el DNI del titular de la cuenta y un saldo inicial.

    public CuentaCorriente(String dni, double saldo) {
        this.dni = dni;
        this.saldo = saldo;
    }

    //Con el DNI, nombre y el saldo inicial.

    public CuentaCorriente(String dni, String nombreDelTitular, double saldo) {
        this.dni = dni;
        this.nombreDelTitular = nombreDelTitular;
        this.saldo = saldo;
    }

    // toString

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "dni='" + dni + '\'' +
                ", nombreDelTitular='" + nombreDelTitular + '\'' +
                ", saldo=" + saldo +
                ", gestor=" + gestor +
                '}';
    }

}
