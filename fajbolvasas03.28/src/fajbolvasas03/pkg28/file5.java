/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajbolvasas03.pkg28;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author user3
 */
public class file5 {

    public static void main(String[] args) {
        RandomAccessFile raf;
        String sorMatrix;
       
        ArrayList<ArrayList<Integer>> szamokMatrix = new ArrayList<>();

        try {
            raf = new RandomAccessFile("adat3.txt", "r");
            sorMatrix = raf.readLine();
           
            ArrayList<Integer> sor = new ArrayList<Integer>();

            while (sorMatrix != null) {
                sor = new ArrayList<>();
                for (int i = 0; i < sorMatrix.split(" ").length; i++) {
                    sor.add(Integer.parseInt(sorMatrix.split(" ")[i]));
                }
                szamokMatrix.add(sor);
                sorMatrix = raf.readLine();
            }

            raf.close();
        } catch (IOException e) {
            System.out.println(e);
        }
       
        System.out.println(szamokMatrix);

       
    }
}

