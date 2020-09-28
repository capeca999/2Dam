/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paco
 */
public class acceso {
    
    private static File f = new File ("series.dat");
    
    
    public static void guardarLS(listShow ls) throws FileNotFoundException, IOException{
        try{
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(ls);
            oos.close();
        } catch(IOException ex){
            System.out.println("El Fichero No se Puede Abrir");
        }
    }
    
    
     public static void EliminarLs(int posicion) throws FileNotFoundException, IOException, ClassNotFoundException{
        try{
     
            
            
            
            List<Object> results = new ArrayList<Object>();
            
FileInputStream fis = new FileInputStream("series.dat");

ObjectInputStream ois = new ObjectInputStream(fis);

try {
  
 
    while (true) {
        results.add(ois.readObject());

        System.out.println("entro");
    }
    
  
} catch (OptionalDataException e) {
    if (!e.eof) 
        throw e;
} finally {
    System.out.println(results.size());
    results.remove(posicion);
    ois.close();
}



fis.close();
        } catch(IOException ex){
            System.out.println(ex);
        }
    }
    
    
    
    
    
    
    public static listShow cargarLS() throws FileNotFoundException, IOException, ClassNotFoundException{
        listShow ls = new listShow();
        ObjectInputStream ois = null;
    
        
        try{
             System.out.println("hola");
            FileInputStream fis = new FileInputStream(f);
                 
            ois = new ObjectInputStream(fis);
          
            ls = (listShow) ois.readObject();
            ois.close();
        }
        
     catch(IOException io){
            System.out.println(io);
}finally{
    return ls;
}
    
}
}
