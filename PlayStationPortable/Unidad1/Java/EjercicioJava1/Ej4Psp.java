/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

import java.io.BufferedReader;
import java.io.IOException; 
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 *
 * @author 2dam
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws IOException, InterruptedException {
   
       boolean fin = false;
       int contador=0;
       int longitudexe=0;
          // Creates an object of Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Pon la ruta de un exe: ");

        // Takes input from the keyboard
        String ruta = input.nextLine();
       
     
               int length = ruta .length();
       //Convertimos la ruta para que sea legible y conseguimos el nombre del exe de la ruta
       ruta = ruta .replace("\\", "/");

     
       
       while(fin==false){

          if(  ruta.charAt((length-1)-contador)== '/' ){
              longitudexe=contador;
              fin=true;
          }
          else{
              contador++;
          }
           
       }
       
       String nombreExe= ruta .substring(ruta .length()-longitudexe);
       
       
           Runtime.getRuntime().exec(nombreExe).waitFor();
    while (funcionando(nombreExe)) {
        Thread.sleep(500); 
    }
    System.out.println("El Programa se ha cerrado correctamente");
        
        
        
        
 
   }
   
   //Cogemos el administrador de tareas y comprobamos si nuestro exe existe en el.
           private static boolean funcionando(String nombreProceso) throws IOException {
               
    String taskList = System.getenv("windir") + "\\system32\\tasklist.exe";
    InputStream is = Runtime.getRuntime().exec(taskList).getInputStream();
//Buscamos entre las linteas
    try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
        return br
            .lines()
            .anyMatch(line -> line.contains(nombreProceso));
    }
        
        
        
        
        
        
        
}  
   
}




