package basico.matrices_y_ciclos;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        arregloBidimensional();
        arregloTridimensional();
        arregloScannerBidimensional();
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

    static void arregloScannerBidimensional() {
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
