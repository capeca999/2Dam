/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author paco
 */
public class listShow implements Serializable {
    
    private ArrayList<show> serieList;
    
    public listShow(){
        serieList = new ArrayList<>();
    }
    
    
      
    public show getShow(int p){
        System.out.println(p);
        return serieList.get(p);
    }
    
   
    public void setShow(show s){
        serieList.add(s);
    }
  
    
    
    public int longitud(){
        return serieList.size();
    }
    
    
}
