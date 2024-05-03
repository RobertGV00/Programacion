package ejercicios.ejerciciosrepaso.lambda.ejercicio1;

import ejercicios.ejercicio01.Producto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // 01  Crea una lista de Strings y utiliza una expresión lambda para imprimir cada elemento de la lista.
        List lista = new ArrayList<>();
        lista.add("Robert");
        lista.add("Ainara");
        lista.add("Carlos");
        lista.add("Juan Daniel");

        lista.forEach(elemento -> System.out.println(elemento));

        // 02 Crea una lista de Strings y utiliza una expresión lambda para contar cuántas palabras tienen más de 5 caracteres.
        Ejercicio2 ejercicio2 = lista2 -> {
            int contador = 0;
            for (String elemento: lista2) {
                if (elemento.length() > 5) {
                    contador++;
                }
            }
            return contador;
        };
        System.out.println(ejercicio2.palabrasConMasDe5Caracteres(lista));

        // 03 Crea una lista de números enteros y utiliza una expresión lambda para encontrar el número mayor.
        List<Integer> numeros = new ArrayList<>();

        // Llenar la lista con números aleatorios
        Random generador = new Random();
        for (int i = 0; i < 100; i++) {
            numeros.add(generador.nextInt(100));
        }

        // Utilizar una expresión lambda para encontrar el número mayor
        Ejercicio3 ejercicio3 = lista1 -> {
            int mayor = lista1.stream()
                    .mapToInt(Integer::intValue)
                    .max()
                    .orElseThrow(); // Se lanza una excepción si la lista está vacía
            return mayor;
        };
        System.out.println("El número mayor en la lista es: " + ejercicio3.encontrarMayor(numeros));

        // 04 Crea una lista de números enteros y utiliza una expresión lambda para encontrar la suma de los números pares.

       int sumarPares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sumarPares);

        // 05 Crea una lista de objetos de tipo Persona (con atributos nombre y edad) y utiliza una expresión lambda para encontrar a la persona más joven.
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Robert",24));
        personas.add(new Persona("Carlos",30));
        personas.add(new Persona("Juan Daniel",21));
        personas.add(new Persona("Ainara",26));
        personas.add(new Persona("Nadie",52));

        Persona personaJoven = personas.stream()
                .min(Comparator.comparingInt(Persona::getEdad))
                .orElse(null);

        // mostrar persona mas joven
        if (personaJoven != null) {
            System.out.println("La persona mas joven es: " + personaJoven.getNombre());
        } else {
            System.out.println("La lista de personas esta vacia");
        }

        // 06 Crea una lista de objetos de tipo Persona (con atributos nombre y edad) y utiliza una expresión lambda para ordenar la lista por edad, de menor a mayor.
        personas.stream()
                .sorted((p1, p2) -> p1.getEdad() - p2.getEdad())
                .forEach(persona -> System.out.println("Ordenado de menor a mayor " + persona));

        // 07 Crea una lista de objetos de tipo Persona y utiliza una expresión lambda para filtrar las personas que tienen una edad mayor a 30.
            personas.stream()
                    .filter(persona -> persona.getEdad() > 30)
                    .forEach(persona -> System.out.println("Mayores de 30 " + persona));

        // 08 Crea una lista de objetos de tipo Producto (con atributos nombre y precio) y utiliza una expresión lambda para calcular el precio total de la lista.
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Pan",0.99));
        productos.add(new Producto("Leche",1.1));
        productos.add(new Producto("Jamón",1));
        productos.add(new Producto("Estropajo",2.15));
        productos.add(new Producto("Donuts",1.50));
        productos.add(new Producto("Doritos",1.25));
        productos.add(new Producto("Coca.cola",1.25));
        productos.add(new Producto("Aceite",10.5));

         double totalPrecio = productos.stream()
                .mapToDouble(producto -> producto.getPrecio())
                .sum();
        System.out.printf("Precio total %.2f" , totalPrecio);

        // 09 Crea una lista de objetos de tipo Producto y utiliza una expresión lambda para ordenar la lista por precio, de mayor a menor.
            productos.stream()
                    .sorted((p1,p2) -> Double.compare(p2.getPrecio(), p1.getPrecio()))
                    .forEach(producto -> System.out.println(producto));

        // 10 Crea una lista de objetos de tipo Producto y utiliza una expresión lambda para filtrar los productos que tienen un precio menor a 10.
        productos.stream()
                .filter(precio -> precio.getPrecio() < 10 )
                .forEach(producto -> System.out.println("Precio menor que 10 € " + producto));

    }
}
