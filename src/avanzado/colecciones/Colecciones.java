package avanzado.colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

class EjemploArrayList {
    public static void main(String[] args) {
        // DI
        ArrayList<String> lista = new ArrayList<String>();

        // P
        lista.add("Manzana");
        lista.add("Banana");
        lista.add("Naranja");

        // S
        System.out.println(lista); // Imprime "Manzana"
        System.out.println(lista.get(0)); // Imprime "Manzana"
    }
}

class EjemploHashmap {
    public static void main(String[] args) {
        // DI
        HashMap<String, String> diccionario = new HashMap<String, String>();

        // P
        diccionario.put("Casa", "House");
        diccionario.put("Perro", "Dog");
        diccionario.put("Gato", "Cat");

        // S
        System.out.println(diccionario.values()); // Imprime "Dog"
        System.out.println(diccionario.get("Perro")); // Imprime "Dog"
    }
}

class EjemploTreeset {
    public static void main(String[] args) {
        // D
        TreeSet<Integer> numeros = new TreeSet<Integer>();

        // I
        numeros.add(5);
        numeros.add(3);
        numeros.add(9);

        // PS
        System.out.println(numeros); // Imprime "[3, 5, 9]"
    }
}