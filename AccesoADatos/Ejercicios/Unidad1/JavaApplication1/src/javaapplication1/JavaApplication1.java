/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 2dam
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        
        
        
    
 

 
        //Variables
        int horas = 0, minutos = 0, segundos = 0;
 
        while (true) {
 
            //Mostrar
            //Si es menor que 10, escribimos un cero delante
            if (horas < 10) {
                System.out.print("0");
            }
 
            System.out.print(horas + ":");
 
            if (minutos < 10) {
                System.out.print("0");
            }
 
            System.out.print(minutos + ":");
 
            if (segundos < 10) {
                System.out.print("0");
            }
 
            //salto de linea
            System.out.println(segundos);
 
            //Aumentar el tiempo
            segundos++;
 
            //Comprobar el tiempo
            if (segundos == 60) {
                //reinicio los segundos
                segundos = 0;
                //aumento los minutos
                minutos++;
                if (minutos == 60) {
                    //Reinicio los minutos
                    minutos = 0;
                    //Aumento las horas
                    horas++;
                    if (horas == 24) {
                        //Reinicio las horas
                        horas = 0;
                    }
                }
            }
 
            Thread.sleep(1000);
 
        }
 
    }
 
}
        
        
        
        
        
        
        
        

    

