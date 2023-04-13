package intermedio.modificadores_de_acceso;

public class Main {
    public static void main(String[] args) {

        // D
        Persona persona = new Persona();

        // IP
        System.out.println(persona.sexo); // Acceso default
        System.out.println(persona.nombre); // Acceso protegido
        System.out.println(persona.email); // Acceso público

        // S
        persona.mostrarEdad(); // Acceso privado

    }
}
