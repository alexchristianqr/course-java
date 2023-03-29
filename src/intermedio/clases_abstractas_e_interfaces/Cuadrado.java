package intermedio.clases_abstractas_e_interfaces;

public class Cuadrado extends Figura {

    @Override
    public int area() {
        // Elevar a la potencia de 2
        return (int) (Math.pow(this.lado, 2));
    }
}
