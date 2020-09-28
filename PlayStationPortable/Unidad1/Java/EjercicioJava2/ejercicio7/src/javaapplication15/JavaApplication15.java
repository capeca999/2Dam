/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;
        import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author paco
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
 //El sistema prioriza los hilos con mas prioridad ya en el campo set priority o incluso si le ponemos MAX priority
        
          
        HiloPrioridad thread1 = new HiloPrioridad();
        thread1.setName("Hilo 1");
        thread1.setPriority(1);
        
          HiloPrioridad thread3 = new HiloPrioridad();
        thread1.setName("Hilo 3");
        thread1.setPriority(1);
        
            HiloPrioridad thread4 = new HiloPrioridad();
        thread1.setName("Hilo 4");
        thread1.setPriority(1);
        
        
        
            HiloPrioridad thread5 = new HiloPrioridad();
        thread1.setName("Hilo 5");
        thread1.setPriority(1);
        
        
        
            HiloPrioridad thread6 = new HiloPrioridad();
        thread1.setName("Hilo 6");
        thread1.setPriority(1);
        
        
        
        
        HiloPrioridad thread2 = new HiloPrioridad();
        thread2.setName("Hilo 2");
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();
         thread3.start();
        thread4.start();

           thread5.start();
        thread6.start();





        
        
    }
    
}
class HiloPrioridad extends Thread {
    public void run() {
        System.out.println("Soy el " + Thread.currentThread().getName() + " empezando.");
        for (int i = 0; i < 10; i++) System.out.println("Soy el " + Thread.currentThread().getName() + " iteración " + i);
        System.out.println("Soy el " + Thread.currentThread().getName() + " acabando.");
    }
}