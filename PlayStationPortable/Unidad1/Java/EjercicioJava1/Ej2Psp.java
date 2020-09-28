/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;
import java.io.IOException;
import java.util.Arrays; 
import java.io.BufferedReader ; 
import java.io.IOException; 
import java.io.InputStream;

import java.io.InputStreamReader;
import java.util.Arrays; 
 
/**
 *
 * @author 2dam
 */
public class Ej2Psp {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws IOException, InterruptedException {
  Runtime.getRuntime().exec("calc");
    Runtime.getRuntime().exec("calc.exe").waitFor();
    while (siguefuncionando("Calculator.exe")) {
        Thread.sleep(1000); // make this smaller if you want
    }
    System.out.println("El Programa se ha cerrado correctamente");
}
   
   
   private static boolean siguefuncionando(String nombreProceso) throws IOException {

    String taskList = System.getenv("windir") + "\\system32\\tasklist.exe";
    InputStream is = Runtime.getRuntime().exec(taskList).getInputStream();

    try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
        return br
            .lines()
            .anyMatch(line -> line.contains(nombreProceso));
    }

}
   
   
   }


       
       
       
       

