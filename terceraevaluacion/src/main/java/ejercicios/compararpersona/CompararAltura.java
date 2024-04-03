package ejercicios.compararpersona;

import java.util.Comparator;

public class CompararAltura implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        // primero el casting al objeto
        Persona p1 = (Persona) o1;
        Persona p2 = (Persona) o2;

        // ordenarlos por altura de mayor a menor
        if (p1.getAltura() > p2.getAltura()) {
            return -1;
        } else if (p1.getAltura() < p2.getAltura()) {
            return 1;
        } else {
            return 0;
        }

    }
}
