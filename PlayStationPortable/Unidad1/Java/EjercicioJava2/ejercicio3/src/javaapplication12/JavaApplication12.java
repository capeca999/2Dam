/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author 2dam
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        
     
        int NumeroThreads = Integer.parseInt("1");
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
            Thread.sleep(3000);
            System.out.println("Thread Muerto id:"+id);
        }catch(Exception err){
            err.printStackTrace();
        }
    }
}
    

