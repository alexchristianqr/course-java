package intermedio.modificadores_de_acceso;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        System.out.println(persona.sexo); // Acceso default
        System.out.println(persona.nombre); // Acceso protegido
        System.out.println(persona.email); // Acceso público
        persona.mostrarEdad(); // Acceso privado

    }
}
