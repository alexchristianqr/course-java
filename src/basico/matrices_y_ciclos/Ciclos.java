package basico.matrices_y_ciclos;

class EjemploFor {
    public static void main(String[] args) {
        int contador = 10;

        System.out.println("-- start --");

        // Ciclo for
        for (int indice = 1; indice <= contador; indice++) {
            System.out.println("El indice es " + indice);
        }

        System.out.println("-- end --");
    }
}

class EjemploWhile {
    public static void main(String[] args) {
        int contador = 10;
        int indice = 1;

        System.out.println("-- start --");

        // Ciclo while
        while (indice <= contador) {
            System.out.println("El indice es " + indice);
            indice++;
        }

        System.out.println("-- end --");
    }

}

class EjemploDoWhile {
    public static void main(String[] args) {
        int contador = 10;
        int indice = 0;

        System.out.println("-- start --");

        // Ciclo do while
        do {
            indice++;
            System.out.println("El indice es " + indice);
        } while (indice < contador);

        System.out.println("-- end --");
    }

}

class EjemploForEach {

    public static void main(String[] args) {
        String[] personas = {"Jose", "Juan", "Miguel", "Luis", "Alberto", "Daniela"};

        System.out.println("-- start --");

        // Ciclo forEach avanzado
        for (String persona : personas) {
            System.out.println(persona);
        }

        System.out.println("-- end --");
    }
}
