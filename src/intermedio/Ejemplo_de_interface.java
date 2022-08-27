package intermedio;

public class Ejemplo_de_interface {
    public static void main(String[] args) {
        areaTriangulo();
        areaCudrado();
        areaCirculo();
    }

    static void areaTriangulo() {
        Triangulo triangulo = new Triangulo();
        triangulo.setBase(2);
        triangulo.setAltura(4);
        System.out.println("El área de un triangulo es " + triangulo.area());
        System.out.println("--");
    }

    static void areaCudrado() {
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(4);
        System.out.println("El área de un cuadrado es " + cuadrado.area());
        System.out.println("--");
    }

    static void areaCirculo() {
        Circulo circulo = new Circulo();
        circulo.setRadio(6);
        System.out.println("El área de un circulo es " + circulo.area());
        System.out.println("--");
    }
}
