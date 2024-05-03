package ejercicios.ejerciciosrepaso.lambda.ejercicio4;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // 1.
        Function<String, Integer> getLength = String::length;

        System.out.println(getLength.apply("hello"));

        // 2.
        Function<Integer, Integer> getSquare = n -> n * n;

        System.out.println(getSquare.apply(5));

        // 3.
        Function<Double, Double> getTenPercent = n -> n * 0.1;

        System.out.println(getTenPercent.apply(100.0));
    }
}
