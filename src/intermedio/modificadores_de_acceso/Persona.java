package intermedio.modificadores_de_acceso;

public class Persona {

    String sexo = "Masculino";
    private int edad = 29;
    protected String nombre = "Nombres: Alex Christian";
    public String email = "Email: alexchristianqr@gmail.com";

    void mostrarEdad() {
        System.out.println("Edad: "+edad);
    }

}
