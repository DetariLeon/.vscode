/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detari;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author user3
 */
public class Detari {

    
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        int osszeg = 0;
        String nev = "";
        
        ArrayList<String> versenyzo = new ArrayList<>();
        try {
            raf = new RandomAccessFile("versenyzo.txt", "r");
            nev = raf.readLine();
            sor = raf.readLine();
            
            
            while (sor != null) {
                versenyzo.add(sor); 

                sor = raf.readLine();
            }

            raf.close();

        } catch (IOException e) {
            System.err.println("HIBA");
        }
        for (int i = 0; i < versenyzo.size(); i++) {
            System.out.println(versenyzo.get(i) + " ");
        }
        for(int i = 0; i < versenyzo.size(); i++) {
            
         //  osszeg = osszeg + versenyzo.get(i);
        }
        System.out.println(osszeg);
        
        
        
        RandomAccessFile raf2;
        
        try {
            raf2 = new RandomAccessFile("eredemeny.txt", "rw");

            for (String eredmeny : versenyzo) {
                
                raf2.writeBytes(eredmeny);
            
            }
            raf2.close();
        } catch (IOException e){
            System.err.println("HIBA");
        }

    }
}
