package segundaevaluacion.poo.clasesyobjetos.teoria.hospital;

public class Main {
    public static void main(String[] args) {
        // probamos el primer constructor: sin parametros.
        Paciente paciente1 = new Paciente();
        // como no le hemos puesto contructor a la clase, utiliza el constructor por defecto, es decir, el contructor "inovisible" que crea Java si tú no le pones ninguno.
        System.out.println(paciente1);
        paciente1.setNombre("Jota");
        paciente1.setEdad(25);
        paciente1.setSintomas(new String[]{"Tos", "Cansancio", "Fiebre"}); // Creamis el array sobre la marcha, sin ecesudad de meter una variable previamente.
        System.out.println(paciente1);

        // probamos el segundo constructor: inicializamos el objeto con valores para los tres parametros
        Paciente paciente2 = new Paciente("Efe", 58, new String[]{"Dolor de cabeza", "Ansiedad"});
        System.out.println(paciente2
        );
        // ingresa un paciente inconsciente que se ha caido en la calle. Sólo sabemos el nombre y se llama Pepe
        Paciente paciente3 = new Paciente("Pepe");
        System.out.println(paciente3);
    }
}
