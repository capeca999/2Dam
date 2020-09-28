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
import java.util.ArrayList;
import java.util.Arrays;
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
       

      /* 
       Runtime.getRuntime().exec("C:\\Windows\\System32\\charmap.exe").waitFor();
              Runtime.getRuntime().exec("C:\\Windows\\System32\\dvdplay.exe").waitFor();
              Runtime.getRuntime().exec("C:\\Windows\\System32\\colorcpl.exe").waitFor();
             */ 
    String nombreExe="";
       ArrayList<String> nombreRuta= new ArrayList<String>();
          ArrayList<String> exeRuta= new ArrayList<String>();

       boolean fin = false;
       int contador=0;
       int longitudexe=0;
          // Creates an object of Scanner
        Scanner input = new Scanner(System.in);
                System.out.print("Pon la ruta de un exe: ");

        
        

        // Takes input from the keyboard
        String ruta = input.nextLine();
        System.out.println(ruta);
        
        if(!ruta.equals("stop")){
            System.out.println("hola");
        }
        
  while(!ruta.equals("Stop") && !ruta.equals("stop")){
           
        nombreRuta.add(ruta);
     
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
       
        nombreExe= ruta .substring(ruta .length()-longitudexe);
      exeRuta.add(nombreExe);
      
      
      
              System.out.print("Pon la ruta de otro exe o pon stop: ");
    input = new Scanner(System.in);
         ruta = input.nextLine();
    
  }     
   
 
       System.out.println( Arrays.toString(nombreRuta.toArray()));
  
       System.out.println(nombreRuta.size());
       
       for (int i = 0; i < nombreRuta.size(); i++) {     
           
           
           
           
                  Runtime.getRuntime().exec(nombreRuta.get(i)).waitFor(); 
                  
       }
       
           System.out.println("El Programa se ha cerrado correctamente");
/*
           Runtime.getRuntime().exec(nombreExe).waitFor();
    while (funcionando(nombreExe)) {
        Thread.sleep(500); 
    }
        
        
        */
       
 
   }
   /*
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
        
        */
        
        
        
        
        
}  
           
           
           
   


