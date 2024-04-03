package segundaevaluacion.poo.clasesyobjetos.ejercicios.banco;

public class Cuenta {
    private String codigo;
    private float balance;
    private Usuario propietario;

    // contructor

    public Cuenta(String codigo, float balance, Usuario usuario) {
        this.codigo = codigo;
        this.balance = balance;
        this.propietario = usuario;
    }

    // getter y setter

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public Usuario getUsuario() {
        return propietario;
    }

    public void setUsuario(Usuario usuario) {
        this.propietario = usuario;
    }


    // to string

    @Override
    public String toString() {
        return "Cuenta{" +
                "codigo='" + codigo + '\'' +
                ", balance=" + balance +
                ", usuario=" + propietario +
                '}';
    }
}
