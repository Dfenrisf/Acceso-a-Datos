import java.io.File;

public class Fichero4 {
    public static void main(String[] args){
        String dirPadre =  "C:\\Users\\AlumnoAfternoon\\Documents\\Pruebas_Java";

        File directorio = new File(dirPadre);
        if(directorio.exists() && directorio.isDirectory()){
            String[] lista = directorio.list();

            for(int i=0;i<lista.length;i++){
                System.out.println(lista[i]);
            }
        }else {
            System.out.println("No existe el directorio");
        }
    }

}
