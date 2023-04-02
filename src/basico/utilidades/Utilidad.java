package basico.utilidades;

import java.util.Scanner;

class EjemploScanner {
    public static void main(String[] args) {
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

class EjemploTryCatch {
    public static void main(String[] args) {
        try {
            int result = (4 / 0) * 10;
            System.out.println(result);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class EjemploMath {
    public static void main(String[] args) {
        double num = 5.7;

        // Valor absoluto
        double absValue = Math.abs(num);
        System.out.println("El valor absoluto de " + num + " es " + absValue);

        // Seno radianes
        double angle = Math.PI / 4; // ángulo de 45 grados en radianes
        double sinValue = Math.sin(angle);
        System.out.println("El seno de " + angle + " es " + sinValue);

        // Redondeo
        int roundValue = (int) Math.round(num);
        System.out.println("El número " + num + " redondeado es " + roundValue);

        // Valor máximo y mínimo
        double num1 = 10.5;
        double num2 = 7.3;
        double max = Math.max(num1, num2);
        double min = Math.min(num1, num2);
        System.out.println("El máximo de " + num1 + " y " + num2 + " es " + max);
        System.out.println("El mínimo de " + num1 + " y " + num2 + " es " + min);

        // Potenciación
        double base = 2.0;
        double exponente = 3.0;
        double potencia = Math.pow(base, exponente);
        System.out.println(base + " elevado a la " + exponente + " es " + potencia);

        // Logaritmo
        double logValue = Math.log(num);
        System.out.println("El logaritmo natural de " + num + " es " + logValue);

        // Coseno radianes
        double sexagesimal = 30;
        double radianes = Math.PI / 180 * sexagesimal;
        System.out.println("Angulo en radianes : " + radianes);

        // Random
        double randValue = Math.random();
        System.out.println("Un número aleatorio entre 0 y 1 es " + randValue);

        // Grados
        double angleDeg = 45.0; // ángulo de 45 grados
        double angleRad = Math.toRadians(angleDeg);
        System.out.println(angleDeg + " grados es igual a " + angleRad + " radianes");
    }
}
