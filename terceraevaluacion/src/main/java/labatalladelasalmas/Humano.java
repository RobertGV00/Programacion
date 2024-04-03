package labatalladelasalmas;

import java.util.ArrayList;

public class Humano extends Ser implements Espiritual {
     ArrayList<Demonio> demonios;
    private double fe;

     ArrayList<Angel> angeles;
    // constructor

    public Humano(double fe) {
        this.fe = fe;
    }

    //metodos

    public void rezar(){

    }

    public void pecar() {

    }

    @Override
    public void mostrar() {

    }

    public void añadirAngel() {

    }

    public double getFe() {
        return fe;
    }

    public void setFe(double fe) {
        this.fe = fe;
    }

    public void añadirDemonio() {

    }


}
