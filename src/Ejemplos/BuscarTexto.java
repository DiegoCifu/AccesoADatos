package Ejemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BuscarTexto {

    public static void main(String[] args) throws IOException {

        // Leer la cadena a buscar desde la consola (asumiendo que la clase Consola está definida)
        System.out.println("Indica por favor la cadena que quieres buscar");
        String cadena = Consola.readString(); // clase está definida en tu código

        // Definir la ruta del archivo
        String rutaFichero = "." + File.separator + "src" + File.separator + "Ejemplos" + File.separator + "pruebaLectura.txt";

        try (BufferedReader fbr = new BufferedReader(new FileReader(rutaFichero))) {
            int numeroLinea = 1; // Contador para las líneas
            String linea = fbr.readLine();

            // Leer el archivo línea por línea
            while (linea != null) {
                int indice = linea.indexOf(cadena); // Buscar la primera aparición

                // Mientras haya más coincidencias en la misma línea
                while (indice != -1) {
                    // Mostrar el número de línea y columna (índice + 1 para que la columna empiece desde 1)
                    System.out.format("[%d,%d] %s%n", numeroLinea, (indice + 1), linea);
                    // Seguir buscando en la misma línea después de la última coincidencia
                    indice = linea.indexOf(cadena, indice + 1);
                }

                // Leer la siguiente línea
                numeroLinea++;
                linea = fbr.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("No existe fichero: " + rutaFichero);
        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

