/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 2dam
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);


        Boolean fin = false;




        ArrayList < String > nombreRuta = new ArrayList < String > ();
        String[][] ProcesosAbiertosCerrados = new String[args.length][2];
        String[] NumerosCerrar = new String[args.length];


        for (int i = 0; i < args.length; i++) {
            ProcesosAbiertosCerrados[i][0] = args[i];
        }



        ArrayList < Process > procesos = new ArrayList < Process > ();
        for (int i = 0; i < args.length; i++) {
            nombreRuta.add(args[i].replace("\\", "/"));
        }



        for (int i = 0; i < nombreRuta.size(); i++) {

            procesos.add(Runtime.getRuntime().exec(nombreRuta.get(i)));
            System.out.println(nombreRuta.get(i) + " Numero " + i);
        }

        int i = 0;
        int cont = 0;
        while (fin != true) {

            System.out.println("*/*/*/*/*/*/*/*/*/");
            System.out.println("Selecciona el proceso a finalizar, o pulsa stop para finalizar el programa");

            String numeroIntroducido = sc.nextLine();

            if (numeroIntroducido.equals("stop")) {
                fin = true;
            } else {

                NumerosCerrar[cont] = numeroIntroducido;

                i = Integer.parseInt(numeroIntroducido);


                ProcesosAbiertosCerrados[i][1] = "Cerrado";




                //   procesos.get(Integer.parseInt(numeroIntroducido)).destroy();



                System.out.println("El proceso va ser destruido");

            }

            cont++;

        }


        for (int j = 0; j < NumerosCerrar.length; j++) {

            if (NumerosCerrar[j] == null) {
                break;
            }
            System.out.println(Integer.parseInt(NumerosCerrar[j]));

            procesos.get(Integer.parseInt(NumerosCerrar[j])).destroy();

        }


        System.out.println("Procesos que han sido destruidos: ");


        for (int j = 0; j < ProcesosAbiertosCerrados.length; j++) {


            if (ProcesosAbiertosCerrados[j][1] == null) {
                ProcesosAbiertosCerrados[j][1] = "Abierto";
            }

            if (ProcesosAbiertosCerrados[j][1].equals("Cerrado")) {


                System.out.print(ProcesosAbiertosCerrados[j][0] + "|");


            }
        }

        System.out.println("");

        System.out.println("Procesos que han sido salvados: ");
        for (int j = 0; j < ProcesosAbiertosCerrados.length; j++) {
            if (ProcesosAbiertosCerrados[j][1] == "Abierto") {
                System.out.print(ProcesosAbiertosCerrados[j][0] + "|");
            }
        }





    }
}