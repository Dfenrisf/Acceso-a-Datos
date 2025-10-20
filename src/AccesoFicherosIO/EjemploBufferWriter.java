package AccesoFicherosIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploBufferWriter {
    public static void main(String[] args) {
        String[] lineas = {
          "Encabezado del documento",
          "Esta es la primera linea",
                "Esta es la segunda linea",
                "Final del documento",
        };

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("src/AccesoFicherosIO/salida_buffer.txt"))){
            for(String linea : lineas){
                bw.write(linea);
                bw.newLine();
            }
        }
        catch (IOException e){
            System.out.println("Error al escribir el documento");
        }
    }
}
