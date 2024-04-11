package teoria.function;

import ejercicios.ejercicio01.Persona;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class EjemplosFunction {
    public static void main(String[] args) {

        // la funcion recibe un double, calcula su cuadrado y lo devuelve (otro double)
        Function<Double, Double> cuadrado = x -> Math.pow(x,2);
        double resultado = cuadrado.apply(1.25);
        System.out.println(resultado);

        List<ejercicios.ejercicio01.Persona> personas = new ArrayList<>();
        personas.add(new ejercicios.ejercicio01.Persona("Carlos", 29));
        personas.add(new ejercicios.ejercicio01.Persona("Oscar", 15));
        personas.add(new ejercicios.ejercicio01.Persona("Kamilly", 18));
        personas.add(new ejercicios.ejercicio01.Persona("Sergio", 18));
        personas.add(new ejercicios.ejercicio01.Persona("Ana", 8));
        personas.add(new Persona("Alejandro", 55));

        Map<String, Integer> mapaEdades = new HashMap<>();
        mapaEdades.put("Carlos", 29);
        mapaEdades.put("Oscar", 15);
        mapaEdades.put("Kamilly", 18);
        mapaEdades.put("Sergio", 18);
        mapaEdades.put("Ana", 8);
        mapaEdades.put("Alejandro", 55);
        Function<Integer,Integer> aumentarEdad = edad -> edad + 1;
        mapaEdades.replaceAll((nombre, edad) -> aumentarEdad.apply(edad));
        mapaEdades.forEach((nombre, edad) -> System.out.println(nombre + " " + edad));
    }
}
