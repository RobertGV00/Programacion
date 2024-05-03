package ejercicios.ejerciciosrepaso.lambda.ejercicio3;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // 1. Define un predicado para comprobar si un entero es múltiplo de 5.
        System.out.println("1.");
        Predicate<Integer> esMultiploDe5 = numero -> numero % 5 == 0;
        System.out.println("120 es multplio de 5 " + esMultiploDe5.test(120));
        System.out.println("118 es multplio de 5 " + esMultiploDe5.test(118));

        // 2. Define un predicado para comprobar si un String no termina en “s”.
        System.out.println("2.");
        Predicate<String> terminaEnS = palabra -> palabra.endsWith("s");
        System.out.println("¿Coches termina en S? " + terminaEnS.test("Coches"));
        System.out.println("¿Coche termina en S? " + terminaEnS.test("Coche"));
        // 3. Define un predicado para comprobar si un entero es par y múltiplo de 3.
        System.out.println("3.");
        Predicate<Integer> enteroyMultiploDe3 = numero -> numero % 2 == 0 && numero % 3 == 0;
        System.out.println("El numero 6 es par y multiplo de 3 " + enteroyMultiploDe3.test(6));
        System.out.println("El numero 5 no es par y ni multiplo de 3 " + enteroyMultiploDe3.test(5));
        // 4. Define un predicado para comprobar si un carácter es una letra y está en mayúscula.
        System.out.println("4.");
        Predicate<Character> esLetraYMayusucla = letra -> Character.isUpperCase(letra);
        System.out.println("A es caracter y esta en mayusucla? " + esLetraYMayusucla.test('A'));
        System.out.println("3 es caracter y esta en mayusucla? " + esLetraYMayusucla.test('3'));
        System.out.println("a es caracter y esta en mayusucla? " + esLetraYMayusucla.test('a'));
        System.out.println(" es caracter y esta en mayusucla? " + esLetraYMayusucla.test(' '));
        // 5. Define un predicado para comprobar si un entero es impar y múltiplo de 7;
        System.out.println("5.");
        Predicate<Integer> imparYMupltiploDe7 = numero -> numero % 2 != 0 && numero % 7 == 0;
        System.out.println(" 7 es multplio de 7 y impar? " + imparYMupltiploDe7.test(7));
        System.out.println(" 6 es multplio de 7 y impar? " + imparYMupltiploDe7.test(6));
        // 6. Define un predicado para comprobar si un entero es impar o múltiplo de 7.
        System.out.println("6.");
        Predicate<Integer> comprobarImparOMultiploDe7 = numero -> numero % 2 != 0 || numero % 7 == 0;
        System.out.println(" 9 es multplio de 7 o impar? " + comprobarImparOMultiploDe7.test(7));
        System.out.println(" 6 es multplio de 7 o impar? " + comprobarImparOMultiploDe7.test(6));


    }
}
