package basico.condicionales;

class EjemploCondicionSimple {
    public static void main(String[] args) {
        // D
        int a = 10;
        int b = 5;

        // IPS
        if (a > b) {
            System.out.println("Es verdad!");
        } else {
            System.out.println("Es falso!");
        }
    }
}

class EjemploCondicionAnidada {
    public static void main(String[] args) {
        // D
        int a = 10;
        int b = 5;
        int c = 20;
        int d = 7;

        // IPS
        if (a > b && c > a) {
            System.out.println("Es verdad!");
            if (a > d) {
                System.out.println("Es verdad y verdad!");
            } else {
                System.out.println("Es verdad y falso!");
            }
        } else {
            System.out.println("Es falso!");
        }
    }
}

class EjemploCondicionMultiple {
    public static void main(String[] args) {
        // D
        String tipoSexo = "H";

        // IPS
        switch (tipoSexo) {
            case "H":
                System.out.println("Es hombre!");
                break;
            case "M":
                System.out.println("Es mujer!");
                break;
            default:
                System.out.println("El tipo de sexo no existe");
                break;
        }
    }
}
