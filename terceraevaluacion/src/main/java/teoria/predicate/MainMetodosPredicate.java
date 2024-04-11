package teoria.predicate;

import teoria.biblioteca.Socio;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainMetodosPredicate {
    public static void main(String[] args) {
        teoria.biblioteca.Socio socio1 = new teoria.biblioteca.Socio("Caleb", "Calvo", LocalDate.of(2000, 12, 1));
        teoria.biblioteca.Socio socio2 = new teoria.biblioteca.Socio("Blas", "Blez", LocalDate.of(2010, 12, 1));
        teoria.biblioteca.Socio socio3 = new teoria.biblioteca.Socio("Fermín", "Fez", LocalDate.of(1999, 1, 1));
        teoria.biblioteca.Socio socio4 = new teoria.biblioteca.Socio("Alba", "Álvarez", LocalDate.of(2005, 10, 10));

        // los añadimos a un arraylist
        ArrayList<Socio> socios = new ArrayList<>();
        socios.add(socio1);
        socios.add(socio2);
        socios.add(socio3);
        socios.add(socio4);

        System.out.println(socios);
        // vamos a ordenar por nombre
        socios.sort((s1,s2) -> s1.getNombre().compareTo(s2.getNombre()));
        // ¿como puedo ultilzar los predicados en una lista?

        // tenemmso el meotdo removeIF -> elimina los obketos de una lista que cumplan la conidicion del predicado.
        // por ejemplo, queremos eliminar los socios cuyo nombre comience por B mayuscula.
        socios.removeIf(socio -> socio.getNombre().startsWith("B"));
        // comprobamos
        System.out.println(socios);


        //  lo metemos otra vex
        socios.add(socio2);

        // eliminamos los socios que hayan nacido antes de este siglo.
        socios.removeIf(socio -> socio.getFechaNac().isBefore(LocalDate.of(2000, 1, 1)));
        System.out.println(socios);

    }
}
