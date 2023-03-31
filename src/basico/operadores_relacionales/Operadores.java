package basico.operadores_relacionales;

class EjemploMayorQue {
    public static void main(String[] args) {
        int valor1 = 10;
        int valor2 = 5;
        boolean resultadoA = valor1 < valor2;
        System.out.println("10 < 5 " + resultadoA);
        boolean resultadoB = valor1 > valor2;
        System.out.println("10 > 5 " + resultadoB);
        boolean resultadoC = valor1 == valor2;
        System.out.println("10 == 5 " + resultadoC);
        System.out.println("--");
    }
}

class EjemploMayorIgualQue {
    public static void main(String[] args) {
        int valor1 = 10;
        int valor2 = 5;
        boolean resultadoA = valor1 >= valor2;
        System.out.println("10 >= 5 " + resultadoA);
        boolean resultadoB = valor1 <= valor2;
        System.out.println("10 <= 5 " + resultadoB);
        boolean resultadoC = valor1 != valor2;
        System.out.println("10 != 5 " + resultadoC);
        System.out.println("--");
    }
}
