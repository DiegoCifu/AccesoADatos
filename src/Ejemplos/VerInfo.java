package Ejemplos;

import java.io.*;
public class VerInfo {
public static void main(String[] args) {
	System.out.println("INFORMACI�N SOBRE EL FICHERO:");

	File f = new File(args[0]);
	
	//Ruta relativa usando el campo separator.
	//File f = new File("."+ File.separator + "src" + File.separator + "file" + File.separator + "VerInf.java");

	if(f.exists()){
		System.out.println("Nombre del fichero  : "+f.getName());
        System.out.println("Ruta                : "+f.getPath());
        System.out.println("Ruta absoluta       : "+f.getAbsolutePath());
        System.out.println("Se puede leer       : "+f.canRead());
        System.out.println("Se puede escribir   : "+f.canWrite());
        System.out.println("Tama�o              : "+f.length());
		System.out.println("Es un directorio    : "+f.isDirectory()); 
		System.out.println("Es un fichero       : "+f.isFile());
		System.out.println("Nombre del directorio padre: "+f.getParent());
  }
	else 
		System.out.println("El fichero o directorio no existe"); }
}