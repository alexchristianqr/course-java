package intermedio;

public class Ejemplo_de_instancia {
    public static void main(String[] args) {
        // Instanciar la clase Profesor y utilizar sus metodos publicos
        Profesor profesor = new Profesor();
        System.out.println(profesor.hablar("profesor"));
        System.out.println(profesor.explicar());
        System.out.println(profesor.desarrollar());
    }
}
