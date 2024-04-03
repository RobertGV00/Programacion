package segundaevaluacion.poo.ejerciciosuml.eltacondeoro;

public class Pedido {
    private Socio socio;

    public boolean comprobarTarjeat() {
        boolean valida = false;
        if (socio.getTarjeta().equals("")) {
            valida = true;
        }
        return valida;
    }
}
