package basico.tipos_de_datos;

/*
byte	8 bits	    -128                        127
short	16 bits	    -32768	                    32767
int	    32 bits	    -2147483648	                2147483647
long	64 bits	    -9223372036854775808	    9223372036854775807
float	32 bits	    -3.402823e38	            3.402823e38
double	64 bits	    -1.79769313486232e308	    1.79769313486232e308
char	16 bits	    '\u0000'	                '\uffff'
*/

class Tipos {
    static final int DIAS_SEMANA = 7;
    static final int DIAS_LABORABLES = 5;

    public static void main(String[] args) {
        tipoConstante();
        tipoNumerico();
        tipoCaracter();
        tipoCaracterUnicode();
        tipoLogico();
    }

    static void tipoConstante() {
        // Constantes
        final double PI = 3.14;

        // Consola
        System.out.println("El valor de PI es " + PI);
        System.out.println("El número de días de la semana son " + DIAS_SEMANA);
        System.out.println("El número de días laborables de la semana son " + DIAS_LABORABLES);
        System.out.println("--");
    }

    static void tipoNumerico() {
        // Numéricos
        byte num1 = -128;
        short num2 = 9999;
        int num3 = 999999999;
        long num4 = 999999999;
        float num5 = 999999999;
        double num6 = 99.9;

        // Consola
        System.out.println("byte " + num1);
        System.out.println("short " + num2);
        System.out.println("int " + num3);
        System.out.println("long " + num4);
        System.out.println("float " + num5);
        System.out.println("doube " + num6);
        System.out.println("--");
    }

    static void tipoCaracter() {
        // Carácteres alfanuméricos
        String nombreCompleto = "Alex Christian";
        String miCorreo = "admin123@gmail.com";

        // Consola
        System.out.println(nombreCompleto);
        System.out.println(miCorreo);
        System.out.println("--");
    }

    static void tipoCaracterUnicode() {
        // Carácter unicode de 16 bits
        char valorUnicode = 100;

        // Consola
        System.out.println(valorUnicode);
        System.out.println("--");
    }

    static void tipoLogico() {
        // Logico
        boolean esVerdad = true;

        // Consola
        System.out.println(esVerdad);
        System.out.println("--");
    }
}
