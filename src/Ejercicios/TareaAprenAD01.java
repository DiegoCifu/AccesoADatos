package Ejercicios;
import java.io.File;

public class TareaAprenAD01 {

	
	    public static void main(String[] args) {
	        // Directorio por defecto C:\Windows
	        String rutaDirectorio = "C:\\Windows";

	        // Si hay un argumento, usamos esa ruta
	        if (args.length > 0) {
	            rutaDirectorio = args[0];
	        }

	        // Crear un objeto File con la ruta especificada
	        File directorio = new File(rutaDirectorio);

	        // Verificamos si el directorio existe y es realmente un directorio
	        if (directorio.exists() && directorio.isDirectory()) {
	            // Obtener la lista de ficheros y directorios dentro del directorio
	            File[] listaFicheros = directorio.listFiles();

	            if (listaFicheros != null) {
	                System.out.println("Listado de archivos y directorios en: " + rutaDirectorio);
	                for (File fichero : listaFicheros) {
	                    if (fichero.isDirectory()) {
	                        System.out.println("[D] " + fichero.getName());
	                    } else if (fichero.isFile()) {
	                        System.out.println("[F] " + fichero.getName());
	                    }
	                }
	            } else {
	                System.out.println("No se pudo obtener la lista de archivos del directorio.");
	            }
	        } else {
	            System.out.println("El directorio especificado no existe o no es un directorio.");
	        }
	    }
	}
