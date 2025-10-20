package AccesoFicherosIO;

import java.io.RandomAccessFile;
import java.io.IOException;

public class EjemploRandomAcessFile {

    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("src/AccesoFicherosIO/dato.bin", "rw")) {
            raf.writeBytes("Inicio");
            raf.seek(20);
            raf.writeBytes("Medio");
            raf.seek(40);
            raf.writeBytes("Final");

            raf.seek(0);
            System.out.println("Posicion 0 : " + raf.readInt());

            raf.seek(20);
            System.out.println("Posicion 20 : " + raf.readInt());

            raf.seek(40);
            System.out.println("Posicion 40 : " + raf.readInt());

            System.out.println("Tamaño del archivo : " + raf.length() + " bytes");
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
