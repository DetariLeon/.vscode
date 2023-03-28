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
public class file3 {
    public static void main(String[] args) {
    RandomAccessFile raf;
        String sor;
        int[] szamok = new int[5];

        int i, adatlength = 0;
        try {
            raf = new RandomAccessFile("adat3.txt", "r");
            int db = 0;
            adatlength = Integer.valueOf(raf.readLine());
            sor = raf.readLine();

            while (sor != null) {
                szamok[db] = Integer.valueOf(sor);
                db++;
                sor = raf.readLine();
            }

            raf.close();

        } catch (IOException e) {
            System.err.println("HIBA");
        }
        for (i = 0; i < szamok.length; i++) {
            System.out.println(szamok[i] + " ");

        }
        

    }

}
