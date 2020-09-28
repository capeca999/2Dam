/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 *
 * @author 2dam
 */
public class Main {

    public static void main(String[] args) throws IOException {



        DataOutputStream dataOutputStream = new DataOutputStream(
            new FileOutputStream("binary.data"));

        dataOutputStream.write(45); //byte data
        dataOutputStream.writeBoolean(true); //Boolean data
        dataOutputStream.writeInt(4545); //Integer data
        dataOutputStream.writeFloat(10); //Float data
        dataOutputStream.writeDouble(109.123); //Double data
        dataOutputStream.writeChar('H'); //Character data
        dataOutputStream.writeUTF("Hola"); //String data
        dataOutputStream.close();

        System.out.println("Hola");
        DataInputStream dataInputStream =
            new DataInputStream(
                new FileInputStream("binary.data"));


        byte byte45 = dataInputStream.readByte();
        boolean booleantrue = dataInputStream.readBoolean();
        int int123 = dataInputStream.readInt();
        float float12345 = dataInputStream.readFloat();
        double double109 = dataInputStream.readDouble();

        char charh = dataInputStream.readChar();
        String utfhola = dataInputStream.readUTF();


        dataInputStream.close();
        System.out.println("byte45     = " + byte45);
        System.out.println("booleantrue = " + booleantrue);
        System.out.println("int123    = " + int123);
        System.out.println("float12345     = " + float12345);
        System.out.println("double109 = " + double109);
        System.out.println("charh    = " + charh);
        System.out.println("utfhola = " + utfhola);


    }

}