package AccesoFicherosIO;

import java.io.File;
import java.io.FileWriter;
import  java.io.IOException;
import java.io.FileReader;

public class EjemploFileWriter {

    public static void main(String[] args) {
        String contenido = "Primera linea \n Segunda linea \n Tercera linea";

        try (FileWriter fw = new FileWriter("src/AccesoFicherosIO/salida.txt")) {
            fw.write(contenido);
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo" + e.getMessage());
        }
    }

}
