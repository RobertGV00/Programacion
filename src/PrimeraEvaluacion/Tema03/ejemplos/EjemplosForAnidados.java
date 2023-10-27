package PrimeraEvaluacion.Tema03.ejemplos;

public class EjemplosForAnidados {
    // un for dentro de otro for sirve para trabajar tablas, tableros, arrays bidimensionales, etc.
    // es decir, cualquier estructura que se organice en filas y columnas
    public static void main(String[] args) {
        // Esto empezaría para i = 0, 0 < 5 es true, entra y se encuntra el for interno.
        for (int i = 1; i <= 5 ; i++) { // en el bucle de fuera, llevamos las filas.
            for (int j = 1; j <= 5 ; j++) { // en el bucle de dentro, llevamos las columnas.
                System.out.print("f" + i + "c" + j + " ");
            }
            // cada vez que finaliza una pasada del bucle completo, hace un salto de linea, antes de seguir incrementando i en el bucle externo.
            System.out.println();
        }
    }

}
