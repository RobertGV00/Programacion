package segundaevaluacion.poo.clasesyobjetos.teoria;

public class Main {
    public static void main(String[] args) {
        // creamos un objeto de la clase MiClase

        MiClase objeto1 = new MiClase();
        objeto1.imprimir(); // método de instancia
        objeto1.atributo = 5;
        objeto1.otroAtributo = true;
        objeto1.nombre = "Robert";
        System.out.println("---------------------------");
        objeto1.imprimir(); // método de instancia
    }
}
