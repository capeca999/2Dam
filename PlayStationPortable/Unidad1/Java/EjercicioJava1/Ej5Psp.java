/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package javaapplication6;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author 2dam
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {

        ArrayList < String > nombreRuta = new ArrayList < String > ();
        ArrayList < Process > procesos = new ArrayList < Process > ();
        for (int i = 0; i < args.length; i++) {
            nombreRuta.add(args[i].replace("\\", "/"));
        }

        System.out.println(Arrays.toString(nombreRuta.toArray()));


        for (int i = 0; i < nombreRuta.size(); i++) {

            procesos.add(Runtime.getRuntime().exec(nombreRuta.get(i)));
        }

        for (int i = 0; i < nombreRuta.size(); i++) {
            procesos.get(i).waitFor();
        }
        System.out.println("El Programa se ha cerrado correctamente");
    }
}