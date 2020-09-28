/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;
import java.util.Scanner;
/**
 *
 * @author 2dam
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
  int PosicionMayor=0;
  int PosicionMenor=0;
  int mediaTodos=0;
  int i=0;
  double media = 0.0;
                    String nombreAlumno="";
                  int edadAlumno=0;

     String [][]nombresEdades=new String[5][2];
        Scanner entradaEscaner = new Scanner(System.in);
     
        System.out.println ("Empezamos el programa");
        
        for ( i = 0; i < 5; i++) {
            
                  System.out.println ("Por favor introduzca el nombre del alumno numero " + i); 
            
                  
               
                  nombreAlumno= entradaEscaner.nextLine();
                  nombresEdades[i][0]=nombreAlumno;

                  System.out.println("Por favor introduzca la edad del alumno con nombre "+ nombreAlumno );
             
                  edadAlumno= entradaEscaner.nextInt();
                  media=media+edadAlumno;
                                    entradaEscaner.nextLine();
String edad=String.valueOf(edadAlumno);
                  nombresEdades[i][1]=edad;  
                  
                  //    int i=Integer.parseInt("200");  
                  if (edadAlumno > Integer.parseInt(nombresEdades[PosicionMayor][1])) {
                PosicionMayor=i;
            }
                  else if(edadAlumno<Integer.parseInt(nombresEdades[PosicionMayor][1])){
                      
                      PosicionMenor=i;
                  }
                                                      System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*" );

                        
        }
        
        System.out.println("Nombre Y Edad Alumno Mayor:"  + nombresEdades[PosicionMayor][0] + " " + nombresEdades[PosicionMayor][1]);
                System.out.println("Nombre Y Edad Alumno Menor:"  + nombresEdades[PosicionMenor][0] + " " + nombresEdades[PosicionMenor][1]);
                System.out.println("La media de la edad es:" + media/i);

    }
    
}
