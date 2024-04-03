package teoria.lambda.teoriainterfacesfuncuines;

public class Main {
    public static void main(String[] args) {
        // voy a intentar instancia la interfaz funcial HolaMundo.
        /*HolaMundo hm = new HolaMundo() {
            @Override
            public void HolaMundo() {
               System.out.println("Hola, mundo");
            }
        };*/
        HolaMundo hm = () -> System.out.println("Hola, mundo");

        // una vez que has "rellenado" el metodo de la clase anonima, ya tienes un objeto con el que llamarlo
        hm.HolaMundo();

        // prueba

        // de los metodos que tenemos debajo vamos a convertirlos en interfaz fucional + lambda

        // 1. Comprueba si el parámetro recibido es un número impar.
        Impar impar =  n ->  n % 2 != 0;
        System.out.println(impar.esImpar(15));
        System.out.println(impar.esImpar(16));

        // 2. Comprueba si el parámetro es la letra ‘y’ (minúscula).
        ComprobarY comprobarY = c -> c == 'y';
        System.out.println("Comprueba si el parámetro es la letra ‘y’ (minúscula)");
        System.out.println(comprobarY.esy('Y'));
        System.out.println(comprobarY.esy('y'));

        // 3. Devuelve la suma de los cuadrados de dos números.
        SumarDosNumeros sumarDosNumeros =  (n1, n2) -> n1 + n2;
        double resultado;
        resultado = sumarDosNumeros.sumar(3,4);
        System.out.println(resultado);

        // 4. Devuelve la suma de los cuadrados de dos números.
        System.out.println(" Devuelve la suma de los cuadrados de dos números.");
        SumarCuadros sumarCuadros = (a, b) -> a * a + b * b;
        int resultadoCuadrados = sumarCuadros.sumarCuadrados(2,5);
        System.out.println(resultadoCuadrados);

        // 5. Devuelve el número 42.
        DevolverCuarentaYDos  devolverCuarentaYDos = () -> 42;

        System.out.println(devolverCuarentaYDos.devolver42());

        // 6. Devuelve el número pi.
        DevolverPi devolverPi = () -> Math.PI;
        System.out.println("Numero Pi " + devolverPi.devolverPI());

        // 7. Imprime una cadena de texto.
        ImprimirCadena imprimirCadena = s -> System.out.println(s);
        imprimirCadena.imprimirCadena("Cadena a imprimir");

        // 8. Imprime “Hola, mundo”.
        ImprimirHolaMundo imprimirHolaMundo = () -> System.out.println("Hola, mundo");
        imprimirHolaMundo.imprimirHolaMundo();
    }
   // Comprueba si el parámetro recibido es un número impar.
    public static boolean esImpar(int n) {
        return n % 2 != 0;
    }


    // Comprueba si el parámetro es la letra ‘y’ (minúscula).
    public static boolean esy(Character c) {
        return c == 'y';
    }


    // Devuelve la suma de dos números.
    public static double sumar(double x, double y) {
        return x + y;
    }


    // Devuelve la suma de los cuadrados de dos números.
    public static int sumarCuadrados(int a, int b) {
        return a * a + b * b;
    }


    // Devuelve el número 42.
    public static int devolver42() {
        return 42;
    }


    // Devuelve el número pi.
    public static double devolverPI() {
        return Math.PI;
    }


    // Imprime una cadena de texto.
    public static void imprimirCadena(String s) {
        System.out.println(s);
    }


    // Imprime “Hola, mundo”.
    public static void imprimirHolaMundo() {
        System.out.println("Hola, mundo.");
    }

}
