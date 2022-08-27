package intermedio;

public abstract class Persona implements PersonaInterface {
    public String hablar(String etiqueta) {
        return "El " + etiqueta + " está hablando...";
    }
}
