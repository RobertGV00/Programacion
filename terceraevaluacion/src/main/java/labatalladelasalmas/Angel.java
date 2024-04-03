package labatalladelasalmas;

public class Angel extends Incorporeo{

    int bondad;
    int maldad;

    // constructor

    public Angel(int bondad, int maldad) {
        this.bondad = bondad;
        this.maldad = maldad;
    }

    // getter y setter

    public int getBondad() {
        return bondad;
    }

    public void setBondad(int bondad) {
        this.bondad = bondad;
    }

    public int getMaldad() {
        return maldad;
    }

    public void setMaldad(int maldad) {
        this.maldad = maldad;
    }

    // mostrar

    @Override
    public void mostrar() {

    }
}
