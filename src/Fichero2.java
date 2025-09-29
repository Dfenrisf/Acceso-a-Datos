import java.io.File;

public class Fichero2 {
    public static void main(String[] args) {
        //Directorio padre que acabamos de crear en documentos
        File ruta = new File("C:\\Users\\AlumnoAfternoon\\Documents\\Pruebas_Java");
        //Verifico si la ruta existe
        if(ruta.exists()){
            //Verificar si la ruta especificada es un directoria
            if(ruta.isDirectory()){
                /* Si en la ruta el ultimo elemento es un directorio me muestra un mensaje por pantalla de que la 
                ruta especifica es un directorio
                */
                System.out.println("La ruta presenta un directorio: "  + ruta.getAbsolutePath());
            }else if(ruta.isFile()){
                /* Si en la ruta el ultimo elemento es un archivo me muestra un mensaje por pantalla de que la
                ruta especifica es un archivo
                */
                System.out.println("La ruta presenta un archivo en: "+ ruta.getAbsolutePath());
            }
            //Verificar si la ruta especificada es un archivo
            
        }
    }
}
