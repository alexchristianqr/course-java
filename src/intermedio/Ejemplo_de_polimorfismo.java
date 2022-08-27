package intermedio;

public class Ejemplo_de_polimorfismo {
    public static void main(String[] args) {
        // Instanciar la clase Profesor y utilizar el metodo "hablar()"
        Profesor profesor = new Profesor();
        System.out.println(profesor.hablar("profesor"));

        // Instanciar la clase Alumno y utilizar el metodo "hablar()"
        Alumno alumno = new Alumno();
        System.out.println(alumno.hablar("alumno"));
    }
}
