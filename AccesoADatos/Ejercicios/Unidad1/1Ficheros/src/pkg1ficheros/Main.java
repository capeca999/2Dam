/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1ficheros;

import java.io.File;
import java.io.IOException;
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
        System.out.println(Arrays.toString(args));
        
        try{
                    File f = new File(args[0]);
          if (f.exists() && f.isDirectory() )
{
      
        System.out.println("Listamos con list");
        System.out.println(Arrays.toString(f.list()));
                System.out.println("Listamos con listFiles");
        System.out.println(Arrays.toString(f.listFiles())); 
}  
          else{
         throw new IOException("error");
          }  
        }
        catch(IOException ex) {
            System.out.println("Fichero No Existe");
}
        
        
    }
    
}
