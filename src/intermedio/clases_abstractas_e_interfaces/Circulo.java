package intermedio.clases_abstractas_e_interfaces;

public class Circulo extends Figura {

    @Override
    public int area() {
        // Elevar a la potencia de 2
        return (int) Math.pow(this.radio, 2);
    }
}

