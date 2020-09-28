/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author 2dam
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        
        System.out.println("Voy a empezar");
        int NumeroThreads = Integer.parseInt("2");
        ExecutorService executor= Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        try{
            for (  int i=0; i < NumeroThreads; i++){
                executor.execute(new CreadorThread(i)); 
                
                
                
            }
             
        

        }catch(Exception err){
            err.printStackTrace();
        }

        executor.shutdown(); // once you are done with ExecutorService
try {
  executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
    System.out.println("Terminaron Todos los procesos");
} catch (InterruptedException e) {
    System.out.println("Terminaron Todos los procesos");
}
          

    }   
        
        
    }
    
    
    class CreadorThread implements Runnable{

    int id;
    public CreadorThread(int i){
        this.id = i;
    }
    public void run(){
        try{
       
            if (this.id==0){
                     System.out.println("Thread Inició id:"+id + "Voy a esperar 3 segundos");
            System.out.println("Thread En Proceso: "+ Thread.currentThread().getName()); 
              
          
                      Thread.sleep(3000);
                      Thread.currentThread().interrupt();
            System.out.println("Thread Muerto id:"+id);  
            }
            else{
                     System.out.println("Thread Inició id:"+id + "Voy a esperar 5 segundos");
            System.out.println("Thread En Proceso: "+ Thread.currentThread().getName()); 
                  Thread.sleep(5000);
                    Thread.currentThread().interrupt();
            System.out.println("Thread Muerto id:"+id);  
            }
                              Thread.sleep(5000);
        
        }catch(Exception err){
            System.out.println("Se termino el proceso " + id);
        }
    }
}
    
