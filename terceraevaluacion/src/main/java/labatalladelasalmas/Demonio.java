package labatalladelasalmas;

public class Demonio extends Incorporeo{
    private int bondad;
    private int maldad;

    // constructor

    public Demonio(int bondad, int maldad) {
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

    @Override
    public void mostrar() {

    }
}
