package intermedio;

public abstract class Figura implements FiguraInterface {
    int base = 0;
    int altura = 0;
    int lado = 0;
    int radio = 0;

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}
