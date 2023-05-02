/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nevbeolvasas04.pkg25;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author user3
 */
public class Nevbeolvasas0425 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        ArrayList<String> nevek = new ArrayList<>();
        try {
            raf = new RandomAccessFile("nevsor.txt", "r");
            sor = raf.readLine();
            while (sor != null) {
                nevek.add(sor);

                sor = raf.readLine();
            }

            raf.close();

        } catch (IOException e) {
            System.err.println("HIBA");
        }

        //Mindegyik név hosszát írd ki.
        System.out.println("-----Mindegyik név hosszát írd ki.-----");
        for (int i = 0; i < nevek.size(); i++) {
            String nev = nevek.get(i);
            int hossz = nev.length();
            System.out.println(nev + " (" + hossz + " karakter hosszú)");
        }
        //Melyik a leghosszabb név?
        System.out.println("-----Melyik a leghosszabb név?-----");
        String leghosszabbNev = "";
        int leghosszabbHossz = 0;
        for (String nev : nevek) {
            int hossz = nev.length();
            if (hossz > leghosszabbHossz) {
                leghosszabbHossz = hossz;
                leghosszabbNev = nev;
            }
        }
        System.out.println("Leghosszabb név: " + leghosszabbNev);
        //Hány vezetéknév kezdődik 'A' betűvel?
        System.out.println("-----Hány vezetéknév kezdődik 'A' betűvel?-----");
        int aVezeteknevDb = 0;
        for (int i = 0; i < nevek.size(); i++) {
            String nev = nevek.get(i);
            if (nev.startsWith("A")) {
                aVezeteknevDb++;
            }

        }
        System.out.println(aVezeteknevDb + " db vezetéknév kezdődik 'A' betűvel.");
        //Hány keresztnév kezdődik 'A' betűvel?
        System.out.println("-----Hány keresztnév kezdődik 'A' betűvel?-----");
        int aNevDb = 0;
        for (int i = 0; i < nevek.size(); i++) {
            String nev = nevek.get(i);
            String keresztnev = nev.split(" ")[1];
            if (keresztnev.startsWith("A")) {
                aNevDb++;
            }

        }
        System.out.println(aNevDb + " db keresztnév kezdődik 'A' betűvel.");
        //Van e Péter
        System.out.println("-----Van e Péter-----");
        boolean vanPeter = false;
        for (int i = 0; i < nevek.size(); i++) {
            String nev = nevek.get(i);
            if (nev.contains("Peter")) {
                vanPeter = true;

            }
        }
        System.out.println(vanPeter ? "Van Péter a névsorban " : "Nincs Péter a névsorban");
        //Rendezd a neveket abc szerint növekvő sorba.
        System.out.println("------abc szerint növekvő sor---------");
          int n = nevek.size();
          
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nevek.get(i).compareTo(nevek.get(j)) > 0) {
                    String sorrend = nevek.get(i);
                    nevek.set(i, nevek.get(j));
                    nevek.set(j, sorrend);
                }
            }
        }

        System.out.println("A nevek abc sorrendben:");
        for (int i = 0; i < n; i++) {
            System.out.println(nevek.get(i));
        }
    }
}
