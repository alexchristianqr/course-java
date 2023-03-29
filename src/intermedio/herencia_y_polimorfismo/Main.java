package intermedio.herencia_y_polimorfismo;

public class Main {
    public static void main(String[] args) {
        instanciarClasePersona();
        instanciarClaseProfesor();
        instanciarClaseAlumno();
    }

    static void instanciarClasePersona() {
        // Instanciar la clase Persona
        Persona persona = new Persona();
        System.out.println(persona.quienSoy());
        System.out.println("--");
    }

    static void instanciarClaseProfesor() {
        // Instanciar la clase Profesor y utilizar el metodo "hablar()"
        Profesor profesor = new Profesor();
        System.out.println(profesor.quienSoy("profesor"));
        System.out.println(profesor.explicarTrabajo());
        System.out.println(profesor.desarrollarTrabajo());
        System.out.println("--");
    }

    static void instanciarClaseAlumno() {
        // Instanciar la clase Alumno y utilizar el metodo "hablar()"
        Alumno alumno = new Alumno();
        System.out.println(alumno.quienSoy("alumno"));
        System.out.println(alumno.escribirTarea());
        System.out.println(alumno.hacerTarea());
        System.out.println("--");
    }
}
