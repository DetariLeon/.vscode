/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajlbeolvasasautok;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author user3
 */
public class FajlbeolvasasAutok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        String[] nevek = new String[5];
        ArrayList<String> autok = new ArrayList<>();
        try {
            raf = new RandomAccessFile("Autok.txt", "r");
            sor = raf.readLine();
            while (sor != null) {
                autok.add(sor);

                sor = raf.readLine();
            }

            raf.close();

        } catch (IOException e) {
            System.err.println("HIBA");
        }
        for (int i = 0; i < autok.size(); i++) {
            System.out.println(autok.get(i) + " ");

        }
        RandomAccessFile raf2;
        
        try {
            raf2 = new RandomAccessFile("cars.txt", "rw");

            for (String car : autok) {
                if(car.startsWith("F")){
                raf2.writeBytes(car + "\n");
            }
            }
            raf2.close();
        } catch (IOException e){
            System.err.println("HIBA");
        }

    }
}