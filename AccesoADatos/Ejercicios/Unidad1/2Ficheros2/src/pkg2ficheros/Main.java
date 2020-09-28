/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2ficheros;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 2dam
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
     

      
      
Path path = Paths.get("C://Users//2dam//Documents//PrimerDirectorio//SegundoDirectorio//TercerDirectorio");
Files.createDirectories(path);
boolean resultado;
File fichero = new File("C://Users//2dam//Documents//PrimerDirectorio//SegundoDirectorio//TercerDirectorio//MiFichero.txt");
try   
{  
resultado= fichero.createNewFile();


if(resultado)      
{  
System.out.println("Archivo Creado en  "+fichero.getCanonicalPath()); 
}  
else  
{  
System.out.println("File already exist at location: "+fichero.getCanonicalPath());  
}  
}   
catch (IOException e)   
{  
e.printStackTrace();   
}         

    }
    
}
