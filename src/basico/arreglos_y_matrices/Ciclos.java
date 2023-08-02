package basico.arreglos_y_matrices;

import java.util.Scanner;

class EjemploFor {
    public static void main(String[] args) {
        // D
        int contador = 10;

        // IPS
        for (int indice = 1; indice <= contador; indice++) {
            System.out.println("El indice es " + indice);
        }
    }
}

class EjemploWhile {
    public static void main(String[] args) {
        // D
        int contador = 10;
        int indice = 1;

        // IPS
        while (indice <= contador) {
            System.out.println("El indice es " + indice);
            indice++;
        }
    }

}

class EjemploDoWhile {
    public static void main(String[] args) {
        // D
        int contador = 10;
        int indice = 0;

        // IPS
        do {
            indice++;
            System.out.println("El indice es " + indice);
        } while (indice < contador);
    }

}

class EjemploForEach {

    public static void main(String[] args) {
        // D
        String[] personas = {"Jose", "Juan", "Miguel", "Luis", "Alberto", "Daniela"};

        // IPS
        for (String persona : personas) {
            System.out.println(persona);
        }
    }
}

class EjemploMatrizBidimensional {
    public static void main(String[] args) {
        // D
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
}

class EjemploMatrizTridimensional {
    public static void main(String[] args) {
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

class EjemploScannerMatrizBidimensional {
    public static void main(String[] args) {
        int filas = 3;
        int columnas = 3;
        int[][] matriz3x3 = new int[filas][columnas];

        Scanner leer = new Scanner(System.in);

        // Actualizar indices
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.println("Ingrese un valor la posición del arreglo bidimensional");
                matriz3x3[i][j] = leer.nextInt();
            }
        }

        // Imprimir indices
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(" " + matriz3x3[i][j]);
            }
            System.out.println();
        }
    }
}