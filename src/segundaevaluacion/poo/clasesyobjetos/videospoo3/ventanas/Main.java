package segundaevaluacion.poo.clasesyobjetos.videospoo3.ventanas;

public class Main {
    public static void main(String[] args) {
        // aqui es donde vamos a crear los objetos.
        // Queremos una ventana verde, de 30px de ancho y 100px de alto.

       Ventana ventana1 = new Ventana(100, 30, Color.VERDER);
        System.out.println(ventana1); // ojo, esto sale bien porque hemos implementado el metodo toString() en Ventana. si no, saldría una cosa diferete que este mal.

        ventana1.aparecer();
        ventana1.cerrar();

        // quiero guardar el ancho de la ventana en una variable aqui.

        int a = ventana1.getAncho();
        System.out.println(a);

    }
}
