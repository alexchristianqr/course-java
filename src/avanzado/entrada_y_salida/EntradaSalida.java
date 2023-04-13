package avanzado.entrada_y_salida;

import java.io.*;

class EjemploLeerEscribirArchivoBinario {
    public static void main(String[] args) {
        try (
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("datos.bin"));
                DataInputStream dis = new DataInputStream(new FileInputStream("datos.bin"))
        ) {
            // Escribir datos en el archivo binario
            dos.writeUTF("Juan");
            dos.writeInt(30);
            dos.writeDouble(185.5);

            // Leer datos del archivo binario
            String nombre = dis.readUTF();
            int edad = dis.readInt();
            double altura = dis.readDouble();

            // Mostrar datos en la consola
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Altura: " + altura);
        } catch (IOException e) {
            System.err.println("Error al leer/escribir en el archivo binario: " + e.getMessage());
        }
    }
}

class EjemploEscribirArchivoTexto {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("archivo.txt"))) {
            bw.write("Hola, mundo!");
            bw.newLine();
            bw.write("Esto es una línea de texto.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}

class EjemploCopiarArchivo {
    public static void main(String[] args) {
        try (
                FileInputStream fis = new FileInputStream("archivo.txt");
                FileOutputStream fos = new FileOutputStream("archivo_copiado.txt")
        ) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            System.err.println("Error al copiar el archivo: " + e.getMessage());
        }
    }
}