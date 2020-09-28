/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Scanner;

/**
 *
 * @author 2dam
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        int numero,fibo1,fibo2,i; 
        
        final PipedOutputStream output = new PipedOutputStream();
        final PipedInputStream  input  = new PipedInputStream(output);


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int  fibo1=1;
                int  fibo2=1;
                System.out.print(fibo1 + " ");
                for(int i=2;i<=Integer.parseInt(args[0]);  i++){
                    System.out.print(fibo2 + " ");
                    fibo2 = fibo1 + fibo2;
                    fibo1 = fibo2 - fibo1;
                }
            }
        });


       
        thread1.start();
        
        
        
    }
    
}
