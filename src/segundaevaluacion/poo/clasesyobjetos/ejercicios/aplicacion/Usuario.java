package segundaevaluacion.poo.clasesyobjetos.ejercicios.aplicacion;

public class Usuario {
    private String username;
    private String email;
    private String password;
    // Añade a la clase Usuario un atributo estado de tipo Estado;
    private Estado estado;

    // constructor

    public Usuario(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        // Haz lo necesario para que cuando se crea un usuario se le asigne por defecto el estado pendiente
        this.estado = Estado.PENDIENTE;
    }

    // getter y setter

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Añade métodos para poder ver y cambiar el estado de un usuario
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    // toString

    @Override
    public String toString() {
        return "Usuario{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
// También en la clase Usuario crea un método mensajeEstado():void.El método hace lo siguiente:
    public void mensajeEstado () {
        if (estado.equals(Estado.PENDIENTE)) {
            // Si el estado es PENDIENTE, imprime "Tienes que esperar un poco".
            System.out.println("Tienes que esperar un poco");
        } else if (estado.equals(Estado.ACTIVO)) {
            // Si el estado es ACTIVO, imprime.
            System.out.println("Todo ok, vía libre");
        } else if (estado.equals(Estado.BLOQUEADO)) {
            // Si el estado es BLOQUEADO, imprime "Usuario bloqueado. Algo habrás hecho".
            System.out.println("Usuario bloqueado. Algo habrás hecho");
        } else {
            // Si no es ninguno de estos estados, imprime "Estado desconocido".
            System.out.println("Estado desconocido ");
        }
    }

}
