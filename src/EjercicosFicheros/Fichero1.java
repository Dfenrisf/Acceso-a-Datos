package EjercicosFicheros;

import java.io.File;

public class Fichero1 {
    public static void main(String[] args) {
        //Directorio padre que acabamos de crear en documentos
        File directorioPadre = new File("C:\\Users\\AlumnoAfternoon\\Documents\\Pruebas_Java");

        // Nombre o ruta relativa al fichero que acabamos de crear
        String nomhijo = "hijo.txt";

        // Crear una instancia File utilizando el construtor y la variable de arriba
        File archivo = new File(directorioPadre, nomhijo);

        //Verificar so eñ archivo existe
        if(archivo.exists()){
            // Si el archivo existe se muestra un mensaje y su ruta absoluta
           System.out.println("El archivo existe en la ruta " + archivo.getAbsolutePath());
        }else {
            // Si el archivo no existe se muestra un mensaje y su ruta absoluta
            System.out.println("El archivo no existe en la ruta. " + archivo.getAbsolutePath());
        }
    }
}
