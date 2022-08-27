package intermedio;

public class Triangulo extends Figura {
    @Override
    public int area() {
        return (this.base * this.altura) / 2;
    }
}
