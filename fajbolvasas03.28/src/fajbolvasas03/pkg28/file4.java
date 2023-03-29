package fajbolvasas03.pkg28;


import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user3
 */
public class file4 {
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        String[] nevek = new String[5];
        ArrayList<Integer> szamok = new ArrayList<Integer>();
        try {
            raf = new RandomAccessFile("adat1.txt", "r");
            sor = raf.readLine();   
            while (sor != null) {  
                szamok.add(Integer.parseInt(sor.strip())); 
                             
                sor = raf.readLine(); 
            }

            raf.close();

        } catch (IOException e) {
            System.err.println("HIBA");
        }
        for (int i = 0; i < szamok.size(); i++) {
            System.out.println(szamok.get(i) + " ");

        }
        
    }
    
}

