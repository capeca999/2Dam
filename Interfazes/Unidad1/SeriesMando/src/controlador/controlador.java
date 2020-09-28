/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.io.FileNotFoundException;
import java.io.IOException;
import modelo.acceso;
import modelo.listShow;
import modelo.show;

/**
 *
 * @author paco
 */
public class controlador {
    private int posicion;
    private listShow ls;
    
    
    public controlador() throws IOException, FileNotFoundException, ClassNotFoundException{
        posicion=0;
        ls =new listShow();
        ls= acceso.cargarLS();

    }
    
    public show primero(){          
        posicion=0;
        return ls.getShow(posicion);
        
    }
    
      public show ultimo(){     
     posicion=  ls.longitud()-1;
        return ls.getShow(posicion);
        
    }
    
    
    
    public show anterior(){
        if(posicion>0){
            posicion--;
        }
        return ls.getShow(posicion);
    }
    
     
    public int getPosition(){
       return posicion;
       
    }
    
   
      
 
    
     public show siguiente(){
         posicion++;
       if(posicion==ls.longitud()){
           posicion--;
       }
        return ls.getShow(posicion);
    }
     
     public void nuevo(show s ) throws IOException{
         ls.setShow(s);
         System.out.println(ls.longitud());
         posicion=ls.longitud()-1;
         acceso.guardarLS(ls);
     }
     
    
}
