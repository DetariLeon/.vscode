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
        int[][] szamok1 = new int[5][4];
       
        try{
            raf = new RandomAccessFile("adat3.txt","r");
            int i = 0;
            String[] seged = null;
            sor = raf.readLine();
            
            
            while (sor != null) {
                seged = sor.split(" ");
                for(int j = 0; j < 4; j++){
                    szamok1[i][j] = Integer.parseInt(seged[j]);                  
                }
                i++;
                sor = raf.readLine();
            }
        }
        catch(IOException e)
        {
            System.err.println("HIBA");
        }
       
       
        for (int i = 0; i < szamok1.length; i++) {
            for (int j = 0; j < szamok1[i].length; j++){
                System.out.print(szamok1[i][j]+" ");
            }
            System.out.println("");
        }
        
            
    }
}
