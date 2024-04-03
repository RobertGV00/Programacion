package teoria.claseobjeto.ejemploequalsyhashcode;

import java.util.Objects;

public class Usuario {
    private String login;

    private String password;

    public Usuario(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // TO STRING

    @Override
    public String toString() {
        return "Usuario{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    // hashCode y equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // this = el objeto con el que estás llamando al metodo equals: usuario1
        // o = el objeto que pasas por parametro: usuario2
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o; // estoy haciendo un casting (convertimos el objeto o en un objeto de tipo Usuario)
        return Objects.equals(login, usuario.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login);
    }
}
