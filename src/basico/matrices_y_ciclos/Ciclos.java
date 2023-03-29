package basico.matrices_y_ciclos;

public class Ciclos {
    public static void main(String[] args) {
        cicloFor();
        cicloWhile();
        cicloDoWhile();
        cicloForEach();
    }

    static void cicloFor() {
        int contador = 10;

        // Ciclo for
        for (int indice = 1; indice <= contador; indice++) {
            System.out.println("El indice es " + indice);
        }
        System.out.println("--");
    }

    static void cicloWhile() {
        int contador = 10;
        int indice = 1;

        // Ciclo while
        while (indice <= contador) {
            System.out.println("El indice es " + indice);
            indice++;
        }
        System.out.println("--");
    }

    static void cicloDoWhile() {
        int contador = 10;
        int indice = 0;

        // Ciclo do while
        do {
            indice++;
            System.out.println("El indice es " + indice);
        } while (indice < contador);
        System.out.println("--");
    }

    static void cicloForEach() {
        String[] personas = {"Jose", "Juan", "Miguel", "Luis", "Alberto", "Daniela"};

        // Ciclo forEach avanzad
        for (String persona : personas) {
            System.out.println(persona);
        }
        System.out.println("--");
    }
}
