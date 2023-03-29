package intermedio.clases_abstractas_e_interfaces;

public class Triangulo extends Figura {
    @Override
    public int area() {
        return (this.base * this.altura) / 2;
    }
}
