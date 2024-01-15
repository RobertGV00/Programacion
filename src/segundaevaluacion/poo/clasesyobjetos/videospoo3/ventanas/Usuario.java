package segundaevaluacion.poo.clasesyobjetos.videospoo3.ventanas;

public class Usuario {

    // Propiedades
    private String usuario;
    private String contraseña;
    private String perfil;

    // Constructor

    public Usuario(String usuario, String contraseña, String perfil) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.perfil = perfil;
    }

    // Getter y setter

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    // Utilidades

    // toString

    @Override
    public String toString() {
        return "Usuario{" +
                "usuario='" + usuario + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", perfil='" + perfil + '\'' +
                '}';
    }

    public void login() {
        System.out.println("Login");
    }

    public void logout() {
        System.out.println("Logout");
    }

    public void comprar() {
        System.out.println("Comprar");
    }

}
