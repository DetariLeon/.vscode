/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajbolvasas03.pkg28;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author user3
 */
public class Fajbolvasas0328 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        String[] nevek = new String[5];
        int osszeg = 0;
        int[] szamok = new int[6];

        try {
            raf = new RandomAccessFile("adat1.txt", "r");
            int db = 0; //számlálót inditok
            sor = raf.readLine();   //első sort beolvasom
            while (sor != null) {     //addig fusson a mig a sor nem null
                szamok[db] = Integer.parseInt(sor.strip());        //a neveket tartalmazó tömbbe teszi a kiolvasott neveket
                db++;                   //számláló növelése (a WHILE nem növeli)
                sor = raf.readLine();     //bolvasom a következő sort
            }

            raf.close();

        } catch (IOException e) {
            System.err.println("HIBA");
        }
        for (int i = 0; i < szamok.length; i++) {
            System.out.println(szamok[i] + " ");

        }
        for(int i = 0; i < nevek.length; i++) {
            
            osszeg = osszeg + szamok[i];
        }
        System.out.println(osszeg);
        
    }
    
}
