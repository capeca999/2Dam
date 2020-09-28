/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Scanner;
import java.util.concurrent.*;

/**
 *
 * @author 2dam
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
         Scanner sc = new Scanner(System.in);
 
        
        System.out.println("Introduce los hilos que deseas crear");
    String cantidad =    sc.nextLine();
     
        int NumeroThreads = Integer.parseInt(cantidad);
        ExecutorService executor= Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        try{
            for (  int i=0; i < NumeroThreads; i++){
                executor.execute(new CreadorThread(i));                
            }
        }catch(Exception err){
            err.printStackTrace();
        }
        executor.shutdown(); // once you are done with ExecutorService
    }   
}
class CreadorThread implements Runnable{
    int id;
    public CreadorThread(int i){
        this.id = i;
    }
    public void run(){
        try{
            System.out.println("Thread Inició id:"+id);
            System.out.println("Thread En Proceso: "+ Thread.currentThread().getName()); 
            System.out.println("Thread Muerto id:"+id);
        }catch(Exception err){
            err.printStackTrace();
        }
    }
}
 
        
    
    

