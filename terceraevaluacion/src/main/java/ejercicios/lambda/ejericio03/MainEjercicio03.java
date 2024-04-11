package ejercicios.lambda.ejericio03;

import java.util.function.Predicate;

public class MainEjercicio03 {
    public static void main(String[] args) {
        // 1. Define un predicado para comprobar si un entero es múltiplo de 5.
        Predicate<Integer> esMultiploDe5 = numero ->  numero % 5 == 0;
        System.out.println("125 es multiplo de 5? " + esMultiploDe5.test(125));
        System.out.println("22 es multiplo de 5? " + esMultiploDe5.test(22));

        // 2. Define un predicado para comprobar si un String no termina en “s”.
        System.out.println("\n2. Define un predicado para comprobar si un String no termina en “s”.");
        Predicate<String> noTerminaEnS = letra -> !letra.endsWith("s");
        System.out.println("La palabra 'Trombon' no termina en s? " + noTerminaEnS.test("trombon"));
        System.out.println("La palabra 'dos' no termina en s? " + noTerminaEnS.test("dos"));

        // 3. Define un predicado para comprobar si un entero es par y múltiplo de 3.
        System.out.println("\n3. Define un predicado para comprobar si un entero es par y múltiplo de 3.");
        Predicate<Integer> esMultiploDe3 = numero -> numero % 2 == 0 && numero % 3 == 0;
        System.out.println("El numero 12 es par y multiplo de 3? " + esMultiploDe3.test(12));
        System.out.println("El numero 15 es par y multiplo de 3? " + esMultiploDe3.test(15));

        // 4. Define un predicado para comprobar si un carácter es una letra y está en mayúscula.
        System.out.println("\n4. Define un predicado para comprobar si un carácter es una letra y está en mayúscula.");
        Predicate<Character> esLetraMayuscula = Character::isUpperCase;
        System.out.println("A es caracter y esta en mayusucla? " + esLetraMayuscula.test('A'));
        System.out.println("3 es caracter y esta en mayusucla? " + esLetraMayuscula.test('3'));
        System.out.println("a es caracter y esta en mayusucla? " + esLetraMayuscula.test('a'));
        System.out.println(" es caracter y esta en mayusucla? " + esLetraMayuscula.test(' '));

        // 5. Define un predicado para comprobar si un entero es impar y múltiplo de 7;
        System.out.println("\n5. Define un predicado para comprobar si un entero es impar y múltiplo de 7;");
        Predicate<Integer> comprobarImparYMultiploDe7 = numero -> numero % 2 != 0 && numero % 7 == 0;
        System.out.println(" 7 es multplio de 7 y impar? " + comprobarImparYMultiploDe7.test(7));
        System.out.println(" 6 es multplio de 7 y impar? " + comprobarImparYMultiploDe7.test(6));

        // 6. Define un predicado para comprobar si un entero es impar o múltiplo de 7.
        System.out.println("\n6. Define un predicado para comprobar si un entero es impar o múltiplo de 7.");
        Predicate<Integer> comprobarImparOMultiploDe7 = numero -> numero % 2 != 0 || numero % 7 == 0;
        System.out.println(" 9 es multplio de 7 o impar? " + comprobarImparYMultiploDe7.test(7));
        System.out.println(" 6 es multplio de 7 o impar? " + comprobarImparYMultiploDe7.test(6));

    }
}
