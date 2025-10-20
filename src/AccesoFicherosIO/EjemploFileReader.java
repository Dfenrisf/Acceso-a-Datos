package AccesoFicherosIO;

import java.io.File;
import  java.io.IOException;
import java.io.FileReader;

public class EjemploFileReader {
    public static void main(String[] args) {
        int caracter;


        try(FileReader fr = new FileReader("C:\\Users\\AlumnoAfternoon\\Desktop\\David\\Aceso de BBDD\\Acceso-a-Datos\\src\\AccesoFicherosIO\\entrada.txt")){

            while ((caracter = fr.read()) != -1) {
                System.out.print((char) caracter);

            }

        }catch(IOException e){
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
