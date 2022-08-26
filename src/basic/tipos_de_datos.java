package basic;

/*
byte	8 bits	    -128                        127
short	16 bits	    -32768	                    32767
int	    32 bits	    -2147483648	                2147483647
long	64 bits	    -9223372036854775808	    9223372036854775807
float	32 bits	    -3.402823e38	            3.402823e38
double	64 bits	    -1.79769313486232e308	    1.79769313486232e308
char	16 bits	    '\u0000'	                '\uffff'
*/

class Main {
    static final int DIAS_SEMANA = 7;
    static final int DIAS_LABORABLES = 5;

    public static void main(String[] args) {
        // Constantes
        final double PI = 3.14;
        System.out.println("El valor de PI es " + PI);
        System.out.println("El número de días de la semana son " + DIAS_SEMANA);
        System.out.println("El número de días laborables de la semana son " + DIAS_LABORABLES);

        // Numéricos
        byte num1 = -128;
        short num2 = 9999;
        int num3 = 999999999;
        long num4 = 999999999;
        float num5 = 999999999;
        double num6 = 99.9;
        System.out.println("byte " + num1);
        System.out.println("short " + num2);
        System.out.println("int " + num3);
        System.out.println("long " + num4);
        System.out.println("float " + num5);
        System.out.println("doube " + num6);
        int base = 12;
        int altura = 14;
        int area;
        area = (base * altura) / 2;
        System.out.println("El area de un triangulo es " + area);

        // Carácteres alfanuméricos
        String nombreCompleto = "Alex Christian";
        String miCorreo = "admin123@gmail.com";
        System.out.println(nombreCompleto);
        System.out.println(miCorreo);

        // Carácteres unicode de 16 bits
        char valorUnicode = 100;
        System.out.println(valorUnicode);

        // Logicos
        boolean esVerdad = true;
        System.out.println(esVerdad);
    }
}
