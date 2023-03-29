package basico.utilidades;

import java.util.Scanner;

public class _Scanner {
    public static void main(String[] args) {
        promedioNotas();
    }

    static void promedioNotas() {
        float prom;
        System.out.println("Ingresa nota 01");

        Scanner leerN1 = new Scanner(System.in);// Pedir nota #01
        float n1 = leerN1.nextFloat();
        System.out.println("Ingresa nota 02");

        Scanner leerN2 = new Scanner(System.in);// Pedir nota #01
        float n2 = leerN2.nextFloat();
        System.out.println("Ingresa nota 03");

        Scanner leerN3 = new Scanner(System.in);// Pedir nota #01
        float n3 = leerN3.nextFloat();

        prom = (n1 + n2 + n3) / 3;

        System.out.println("El promedio es " + Math.round(prom));
        System.out.println("--");
    }
}
