/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializaracceso;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

/**
 *
 * @author 2dam
 */
public class SerializarAcceso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
      
		 persona paco = new persona("Paco", "Pinazo Guna", 17, true, "49573986Q");
		 persona raul = new persona("Raul", "Garcia Frias", 20, true, "8767652Q");
		
		 FileOutputStream fout = new FileOutputStream("prueba.ser");
		 ObjectOutputStream oos = new ObjectOutputStream(fout);
		 oos.writeObject(paco);
		 oos.writeObject(raul);
		 oos.close();
		 
		 ObjectInputStream ois = new ObjectInputStream(new FileInputStream("prueba.ser"));
		 persona prueba  = (persona) ois.readObject();
                 
		long serialVersionUID = ObjectStreamClass.lookup(prueba.getClass()).getSerialVersionUID();
                System.out.println("UID: " + serialVersionUID);
		 if(prueba.getNumeroDocumentoidentidad()==null){
                     System.out.println("El dni esta a null");
                 }
                
                System.out.println(prueba.toString()); 
		 persona prueba2  = (persona) ois.readObject();
                 
                 if(prueba2.getNumeroDocumentoidentidad()==null){
                     System.out.println("El dni esta a null");
                 }
			System.out.println(prueba2.toString());
    }
    
}
