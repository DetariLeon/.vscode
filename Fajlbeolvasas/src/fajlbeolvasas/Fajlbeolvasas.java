/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajlbeolvasas;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author user3
 */
public class Fajlbeolvasas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        String[] nevek = new String[6];

        try {
            raf = new RandomAccessFile("nevek.txt", "r");
            int db = 0; //számlálót inditok
            sor = raf.readLine();   //első sort beolvasom
            while (sor != null) {     //addig fusson a mig a sor nem null
                nevek[db] = sor;        //a neveket tartalmazó tömbbe teszi a kiolvasott neveket
                db++;                   //számláló növelése (a WHILE nem növeli)
                sor = raf.readLine();     //bolvasom a következő sort
            }

            raf.close();

        } catch (IOException e) {
            System.err.println("HIBA");
        }
        for (int i = 0; i < nevek.length; i++) {
            System.out.println(nevek[i] + " ");

        }
        for(String src: nevek){
            System.out.println(src);
        }
    }

}
