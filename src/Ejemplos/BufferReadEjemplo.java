package Ejemplos;
import java.io.*;

public class BufferReadEjemplo {
	
	  public static void main(String[] args) {
	  try{
		  File fic = new File("."+ File.separator + "src" +  File.separator + "fichtexto.txt");//declara fichero
	      BufferedReader fichero = new BufferedReader(new FileReader(fic)); 
	      
	      String linea;
          int numeroLinea = 1; // Contador para enumerar las líneas

          // Leer cada línea del fichero
          while ((linea = fichero.readLine()) != null) {
              // Imprimir la línea numerada
              System.out.println(numeroLinea + ": " + linea);
              numeroLinea++; // Aumentar el contador después de imprimir
          }
	      
	      fichero.close(); 
		}
		catch (FileNotFoundException fn ){                      
	               System.out.println("No se encuentra el fichero");}
		catch (IOException io) {
	               System.out.println("Error+de E/S ");}
	               
	  }
	}