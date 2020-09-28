/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 2dam
 */
public class Main {

	 public static void main(String[] args) throws IOException, ClassNotFoundException {

		 persona paco = new persona("Paco", "Pinazo Guna", 17, true, "49573986Q");
		 persona raul = new persona("Raul", "Garcia Frias", 20, true, "8767652Q");
		
		 FileOutputStream fout = new FileOutputStream("prueba.ser");
		 ObjectOutputStream oos = new ObjectOutputStream(fout);
		 oos.writeObject(paco);
		 oos.writeObject(raul);
		 
		 
		 ObjectInputStream ois = new ObjectInputStream(new FileInputStream("prueba.ser"));
		 persona prueba  = (persona) ois.readObject();
		
		System.out.println(prueba.toString()); 
		 persona prueba2  = (persona) ois.readObject();
			System.out.println(prueba2.toString());
}
}