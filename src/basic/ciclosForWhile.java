package basic;

public class ciclosForWhile {
    public static void main(String[] args) {
        cicloFor();
        cicloWhile();
        cicloDoWhile();
        arregloBidimensional();
        arregloTridimensional();
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

    static void arregloBidimensional() {
        int filas = 3;// j
        int columnas = 3;// i
        int contador = 1;

        // Arreglo bidimensional (2 dimensiones)
        int[][] numeros = new int[filas][columnas];

        // Iterar fila x fila
        for (int j = 0; j < filas; j++) {

            // Iterar columna x columna
            for (int i = 0; i < columnas; i++) {
                numeros[j][i] = contador;
                contador++;
                System.out.print("[" + numeros[j][i] + "]");
            }
            System.out.println();
        }
        System.out.println("--");
    }

    static void arregloTridimensional() {
        int caras = 3;// Z
        int filas = 3;// Y
        int columnas = 3;// X
        int contador = 1;

        // Arreglo tridimensional (3 dimensiones)
        int[][][] numeros = new int[caras][filas][columnas];

        // Iterar cara x cara
        for (int z = 0; z < caras; z++) {
            System.out.println("Cara " + z);

            // Iterar fila x fila
            for (int y = 0; y < filas; y++) {

                // Iterar columna x columna
                for (int x = 0; x < columnas; x++) {
                    numeros[z][y][x] = contador;
                    contador++;
                    System.out.print("[" + numeros[z][y][x] + "]");
                }
                System.out.println();
            }
            contador = 1;// Reiniciar contador de arreglo bidimensional
        }
        System.out.println("--");
    }
}
