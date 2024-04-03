package segundaevaluacion.poo.clasesyobjetos.ejercicios.ejercito;

public class Main {

// i. 	contiene un método main.

//Crea los siguientes objetos: 5 de tipo Unidad, 3 de tipo Caballero, 1 General, 1 Médico.

//Muestra cuántos objetos de cada tipo contiene nuestro ejército.
    public static void main(String[] args) {

        // 5 unidades
        Unidad unidad1 = new Unidad("Primera");
        Unidad unidad2 = new Unidad("Segunda");
        Unidad unidad3 = new Unidad("Tercera");
        Unidad unidad4 = new Unidad("Cuarta");
        Unidad unidad5 = new Unidad("Quinta");

        // 3 caballeros
        Caballero caballero1 = new Caballero("Quijote");
        Caballero caballero2 = new Caballero("Lancelot");
        Caballero caballero3 = new Caballero("William Wallace");

        // 1 General
        General general1 = new General("Steve McGarreth");
        // 1 Medico
        Médico medico1 = new Médico("Dr.House");

        // llamaos al metodo
        imprimirEjercito();
    }

    public static void imprimirEjercito() {
        System.out.println("Mi ejercito tiene: " );
        System.out.println(" * " + Unidad.unidades + " Unidades");
        System.out.println(" * " + Caballero.caballeros + " Caballeros");
        System.out.println(" * " + General.generales + " Generales");
        System.out.println(" * " + Médico.medico + " Medicos");
    }
}
