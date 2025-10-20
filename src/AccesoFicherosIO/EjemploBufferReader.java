package AccesoFicherosIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EjemploBufferReader {
    public static void main(String[] args) {
        String linea;
        int numLineas = 1;

        try(BufferedReader br = new BufferedReader(new FileReader("src/AccesoFicherosIO/entrada.txt"))){

            while ((linea = br.readLine()) != null){
                System.out.println(numLineas + ": " + linea);
                numLineas++;
            }
        } catch (IOException e){
            System.err.println("Error al cargar el archivo: " + e.getMessage());
        }
    }
}

