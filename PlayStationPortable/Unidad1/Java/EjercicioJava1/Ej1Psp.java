/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.IOException;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;

import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author 2dam
 */
public class Ej1Psp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {


        Process process = new ProcessBuilder(args).start();
        InputStream is = process.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line;

        System.out.println("Salida del proceso " + Arrays.toString(args) + " : ");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }



    }
}
   


  