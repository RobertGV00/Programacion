package ejercicios.ejercicio01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Ejercicio01Main {
    public static void main(String[] args) {
        // 1. Crea una lista de Strings y utiliza una expresión lambda para imprimir cada elemento de la lista.

        List<String> lista = new ArrayList<>();
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");
        lista.add("cuatro");
        lista.add("cinco");
        lista.add("veinticinco");


        // 2. Crea una lista de Strings y utiliza una expresión lambda para contar cuántas palabras tienen más de 5 caracteres.
       Ejercicio02 ejercicio02 = new Ejercicio02() {
           @Override
           public int contador() {
               return 0;
           }
       };

        // 3.Crea una lista de números enteros y utiliza una expresión lambda para encontrar el número mayor.
        List<Integer> numeros = new ArrayList<>();
// la rellenamos con numeros random entre 0 y 10
        Random generador = new Random();
        for (int i = 0; i < 20; i++) {
            numeros.add(0,11);
        }

        // 4. Crea una lista de números enteros y utiliza una expresión lambda para encontrar la suma de los números pares.
        Ejercicio04 e4 = lista1 -> {
            int suma = 0;
            for (Integer numero: lista1) {
                if (numero % 2 == 0) {
                    suma += numero;
                }
            }
            return suma;
        };
        System.out.println(e4.sumaPares(numeros));
        // 5

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Carlos", 29));
        personas.add(new Persona("Oscar", 15));
        personas.add(new Persona("Kamilly", 18));
        personas.add(new Persona("Sergio", 18));
        personas.add(new Persona("Ana", 8));
        personas.add(new Persona("Alejandro", 55));

        // 1) Ordenamos por edades de menor a mayor
        // además, por primera vez vamos a utilizar la versión más corta posible
        System.out.println("01");
        personas.sort((p1, p2) -> p1.getEdad() - p2.getEdad());
        System.out.println("\nOrdenados por edad (de menor a mayor)");
        //System.out.println(personas);

        // si quisiéramos ordenar de mayor a menor
        //personas.sort((p1, p2) -> p2.getEdad() - p1.getEdad());
        //System.out.println("\n\n" + personas);

        // 2) Cogemos el que haya quedado primero
        System.out.println("\n02");
        System.out.println("Persona más joven: " + personas.get(0));

        // si nos pidieran, sin volver a ordenar, el último elemento de la lista
        //System.out.println(personas.get(personas.size() - 1));

        System.out.println("\nEjercicio 6:\n============");
        //06.- Crea una lista de objetos de tipo Persona (con atributos nombre y edad) y utiliza una expresión lambda para ordenar la lista por edad, de menor a mayor

        // hecho en el ejercicio anterior
        personas.sort((p1, p2) -> p1.getEdad() - p2.getEdad());
        System.out.println(personas);

        //07.- Crea una lista de objetos de tipo Persona y utiliza una expresión lambda para filtrar las personas que tienen una edad mayor a 30.
        System.out.println("\nEjercicio 7:\n============");
        // volveremos cuando sepamos cómo se hace un predicado
        personas.stream()
                .filter(persona -> persona.getEdad() > 30)
                .forEach(persona -> System.out.println(persona));

        //08.- Crea una lista de objetos de tipo Producto (con atributos nombre y precio) y utiliza una expresión lambda para calcular el precio total de la lista.
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Pan",0.99));
        productos.add(new Producto("Leche",1.1));
        productos.add(new Producto("Jamón",1));
        productos.add(new Producto("Estropajo",2.15));
        productos.add(new Producto("Donuts",1.50));
        productos.add(new Producto("Doritos",1.25));
        productos.add(new Producto("Coca.cola",1.25));
        productos.add(new Producto("Aceite",10.5));

        // hemos creado una interfaz funcional con un unico metodo abstracto
        System.out.println("\nEjercicio 8:\n============");
        Ejercicio08 e8 = lista8 -> {
            double suma = 0;
            for (Producto item: lista8) {
                suma = suma + item.getPrecio();
            }
            return suma;
        };
        double resultado = e8.calcularTotal(productos);
        System.out.printf("Total: %.2f\n", resultado);


        // otra forma de hacerlo mucho mas corto es con stream - map - sum
       resultado = productos.stream()
               .mapToDouble(producto -> producto.getPrecio())
               .sum();
        System.out.printf("Otra Forma %.2f\n" , resultado);
        //09.- Crea una lista de objetos de tipo Producto y utiliza una expresión lambda para ordenar la lista por precio, de mayor a menor.
        // no hay que hacer una interfaz funcional, sino que utilimzaos la que tiene Java: Comparator
        System.out.println("\nEjercicio 9:\n============");
        Comparator<Producto> comparator = (p1, p2) -> Double.compare(p2.getPrecio(), p1.getPrecio());
        productos.sort(comparator);
productos.forEach(producto -> System.out.println(producto));
        //10.- Crea una lista de objetos de tipo Producto y utiliza una expresión lambda para filtrar los productos que tienen un precio menor a 10
        System.out.println("\nEjercicio 10:\n============");
         productos.stream()
                .filter(producto -> producto.getPrecio() < 10)
                .forEach(producto -> System.out.println(producto));

    }






}
