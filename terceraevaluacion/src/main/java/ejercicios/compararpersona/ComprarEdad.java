package ejercicios.compararpersona;

import java.util.Comparator;

public class ComprarEdad implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Persona p1 = (Persona) o1;
        Persona p2 = (Persona) o2;
        if (p1.getEdad() > p2.getEdad()){
            return -1;
        } else if (p1.getEdad() < p2.getEdad()) {
            return 1;
        } else {

            return 0;
        }
    }
}
