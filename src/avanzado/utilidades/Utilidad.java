package avanzado.utilidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EjemploComparator {
    public static void main(String[] args) {

        class Persona {
            int edad;

            public int getEdad() {
                return edad;
            }

            public void setEdad(int edad) {
                this.edad = edad;
            }
        }

        Persona persona = new Persona();
        persona.setEdad(15);
        persona.setEdad(10);
        persona.setEdad(5);

        Comparator<Persona> edadComparator = Comparator.comparingInt(Persona::getEdad);
        List<Persona> personas = new ArrayList<>();
        personas.add(persona);// añadir objetos Persona a la lista

        Collections.sort(personas, edadComparator);

        for (Persona person : personas) {
            System.out.println("La persona es: " + person.getEdad());
        }
    }
}
