/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.RandomAccessFile;

/**
 *
 * @author 2dam
 */
public class Main {

    public static void main(String[] args) {



        FileInputStream fis = null;
        RandomAccessFile raf = null;

        String characterEncoding = "utf-8";

        if (args.length == 3) {
            characterEncoding = args[2];
        }

        try {
            FileWriter write = new FileWriter(args[1]);




            FileReader fr = new FileReader(args[0]);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();


            while (line != null) {
                String palabra = "";


                int i = 4;


                for (i = line.length() - 1; i >= 0; i--) {

                    palabra = palabra + line.charAt(i);
                }

                write.write(palabra);
                write.write("\n");

                line = br.readLine();

            }
            write.write("Francisco Manuel Pinazo Guna");
            write.close();

            System.out.println("Se ha escrito correctamente!");


            File f = new File(args[1]);

            BufferedReader b = new BufferedReader(new FileReader(f));

            String readLine = "";

            System.out.println("Leyendo Fichero...");

            while ((readLine = b.readLine()) != null) {
                System.out.println(readLine);
            }








        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // clean up
            try {
                fis.close();
            } catch (Exception e2) {}
            try {
                raf.close();
            } catch (Exception e2) {}
        }


    }

}