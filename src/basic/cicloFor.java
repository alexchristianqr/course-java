package basic;

public class cicloFor {
    public static void main(String[] args) {
        int counter = 10;

        // Ciclo for
        for (int index = 1; index <= counter; index++) {
            System.out.println("El indice es " + index);
        }

        System.out.println("--");

        // Ciclo while
        int indice = 1;
        while (indice <= counter) {
            System.out.println("El indice es " + indice);
            indice++;
        }

        System.out.println("--");

        // Ciclo do while
        int indice2 = 0;
        do {
            indice2++;
            System.out.println("El indice es " + indice2);
        } while (indice2 < counter);
    }
}
