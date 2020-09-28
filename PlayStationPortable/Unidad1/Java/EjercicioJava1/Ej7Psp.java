/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author paco
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Runtime rt = Runtime.getRuntime();
        String[] commands = {
            "ipconfig.exe"
        };
        Process proc = rt.exec(commands);
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream()));


        BufferedReader stdError = new BufferedReader(new InputStreamReader(proc.getErrorStream()));

        String s = null;
        int cont = 0;








        while ((s = stdInput.readLine()) != null) {

            if (cont == 8) {
                cont++;
                String IPADDRESS_PATTERN =
                    "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

                Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);
                Matcher matcher = pattern.matcher(s);
                if (matcher.find()) {


                    System.out.println("Tu dirección ip es : " + matcher.group());

                } else {
                    System.out.println("no");
                }








            } else {
                cont++;
            }



        }



    }

}

  