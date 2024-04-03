package segundaevaluacion.poo.clasesyobjetos.ejercicios.aplicacion;

import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        // Llamar al metodo
        Usuario usuarioNuevo = crearUsuario();
        // Imprimir los datos
        System.out.println(usuarioNuevo);

        // Para probar este método mensajeEstado, ve al main y llama al método con el usuario creado.
        System.out.println("--------------------");
        usuarioNuevo.mensajeEstado();

        // A continuación, cambia el estado del usuario a ACTIVO, y vuelve a llamar al método mensajeEstado
        usuarioNuevo.setEstado(Estado.ACTIVO);
        System.out.println("--------------------");
        usuarioNuevo.mensajeEstado();
    }
    public static Usuario crearUsuario() {
        System.out.println("Nombre de usuario: ");
        String username = teclado.nextLine();
        System.out.println("Email: ");
        String email = teclado.nextLine();
        System.out.println("Contraseña:  ");
        String password = teclado.nextLine();
        return new Usuario(username, email, password);
    }
}
