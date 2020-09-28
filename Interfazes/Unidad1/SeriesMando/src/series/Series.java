/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series;
import controlador.controlador;
import java.io.FileNotFoundException;
import vista.PrimeraPantalla;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.acceso;
import modelo.listShow;
import modelo.show;
/**
 *
 * @author paco
 */
public class Series {
    
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException{
  
        
     
        
        
        controlador control = new controlador();
     
    
                
           //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrimeraPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrimeraPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrimeraPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrimeraPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                try {
                      controlador control = new controlador();
                      
                      
                PrimeraPantalla f = new PrimeraPantalla(control);
                       f.setVisible(true);
                    
                    
                } catch (IOException ex) {
                    
                    Logger.getLogger(PrimeraPantalla.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Series.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }); 
        
        
        /*
        try {
            show sh = new show ("Breaking Bad", "Vicent Guilligan", 5, "Drama", 5);
            listShow ls = new listShow();
            ls.setShow(sh);
            sh=new show ("Futurama", "Matt Groening", 6, "Comedia", 6);
            ls.setShow(sh);
            acceso.guardarLS(ls);
            System.out.println("Series Guardadas");
        } catch (IOException ex) {
            Logger.getLogger(Series.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        */
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
