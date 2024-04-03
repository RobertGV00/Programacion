package segundaevaluacion.poo.herencia.teoria.ejercicioHerencia;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Programador p = new Programador();

        System.out.println(p);

        // setters heredados de persona
        p.setNombre("A. Arenal");
        p.setAñoDeNacimiento(1985);
        p.setDireccion("Pobladura del Valle, 15");
        // setters heredados de empleaod
        p.setFechaInicio(LocalDate.of(2000, 04, 23));
        p.setSalario(50_000L);
        // setters de programador
        p.setLenguajes(new String[] { "Java", "SQL", "HTML" });

        System.out.println(p);




    }
}
