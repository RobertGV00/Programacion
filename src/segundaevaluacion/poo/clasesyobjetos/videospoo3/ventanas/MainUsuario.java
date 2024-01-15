package segundaevaluacion.poo.clasesyobjetos.videospoo3.ventanas;

public class MainUsuario {
    public static void main(String[] args) {

        Usuario registro = new Usuario("Robert", "prueba1234","RobertGV");
        // Probar el to string
        System.out.println("\nProbamos el toString: " + registro);
        System.out.println();

        // Queiro guardar el valor de usuario en otra variale y verlo

        String a = registro.getUsuario();
        System.out.println("Usuario: " + a);
        String b = registro.getPerfil();
        System.out.println("Nombre de perfil: " + b);

        // Metodos
        System.out.println();
        System.out.println("METODOS");
        registro.login();
        registro.logout();
        registro.comprar();
    }
}
