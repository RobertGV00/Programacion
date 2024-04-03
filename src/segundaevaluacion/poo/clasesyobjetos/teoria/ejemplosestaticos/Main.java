package segundaevaluacion.poo.clasesyobjetos.teoria.ejemplosestaticos;

public class Main {
    public static void main(String[] args) {

        Clase objeto1 = new Clase("Primera");
        System.out.println(objeto1 + "contarObjetos = " + Clase.contarObjetos);

        Clase objeto2 = new Clase("Segundo");
        System.out.println(objeto2 + "contarObjetos = " + Clase.contarObjetos);

        Clase objeto3 = new Clase("Tercero");
        System.out.println(objeto3 + "contarObjetos = " + Clase.contarObjetos);

 // ahora llamamos a los metodos.
        objeto1.imprimirCosas();
        Clase.imprimirOtrasCosas();
    }
}
