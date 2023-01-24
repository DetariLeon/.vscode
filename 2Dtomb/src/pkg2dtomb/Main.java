/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2dtomb;

import java.util.Random;

/**
 *
 * @author user3
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //2D tömb (matrix) inicializálás
        int[][] szamok = {{2, 9, 7}, {1, 0, 3}};
        int i, j;
        int sorokSzama = szamok.length;
        int oszlopokSzama = szamok[0].length;

        //2D tömb bejárása
        System.out.println(szamok.length);//matrix mérete
        i = 0;
        System.out.println(oszlopokSzama);//sor mérete
        System.out.println("--------------------------------------------------------------");

        for (i = 0; i < szamok.length; i++) {
            for (j = 0; j < oszlopokSzama; j++) {
                System.out.print(szamok[i][j] + " ");

            }
            System.out.println();//ez a sortörés
        }
        System.out.println("--------------------------------------------------------------");
        //--------------------------------------------  
        //2. sor bejárása
        for (j = 0; j < szamok[1].length; j++) {
            System.out.print(szamok[1][j] + " ");

        }
        System.out.println();
        System.out.println("--------------------------------------------------------------");

        //2.oszlop bejárása
        for (i = 0; i < szamok.length; i++) {
            System.out.println(szamok[i][1] + " ");
        }
        System.out.println("--------------------------------------------------------------");

        //Az tömb összege
        int osszeg = 0;
        for (i = 0; i < szamok.length; i++) {
            for (j = 0; j < oszlopokSzama; j++) {
                osszeg = szamok[i][j] + osszeg;

            }
        }
        System.out.println("A tömb elemeinek összege: " + osszeg);
        System.out.println("--------------------------------------------------------------");

        //Sorok összege
        for (i = 0; i < szamok.length; i++) {
            int sorOsszeg = 0;
            for (j = 0; j < oszlopokSzama; j++) {
                sorOsszeg = szamok[i][j] + sorOsszeg;
            }
            System.out.println("A sor összege: " + sorOsszeg);
        }
        System.out.println("--------------------------------------------------------------");

        //Páros darab keresése
        int parosDb = 0;
        for (i = 0; i < szamok.length; i++) {
            for (j = 0; j < oszlopokSzama; j++) {
                if (szamok[i][j] % 2 == 0) {
                    parosDb++;
                }
            }
        }
        System.out.println(parosDb);
        System.out.println("--------------------------------------------------------------");

        //páros darab keresése soronként
        for (i = 0; i < szamok.length; i++) {
            int sorParosDb = 0;
            for (j = 0; j < oszlopokSzama; j++) {
                if (szamok[i][j] % 2 == 0) {
                    sorParosDb++;
                }

            }
            System.out.println(sorParosDb);
        }
        System.out.println("--------------------------------------------------------------");

        for (j = 0; j < oszlopokSzama; j++) {
            for (i = 0; i < szamok.length; i++) {
                System.out.print(szamok[i][j] + " ");

            }
            System.out.println();//ez a sortörés
        }

        for (j = 0; j < oszlopokSzama; j++) {
            int osszegOszlop = 0;
            for (i = 0; i < szamok.length; i++) {
                osszegOszlop = szamok[i][j] + osszegOszlop;

            }
            System.out.println(osszegOszlop);
        }
        System.out.println("--------------------------------------------------------------");
        int[][] randomnumber = new int[3][5];
        Random rand = new Random();
        for (i = 0; i < randomnumber.length; i++) {
            for (j = 0; j < randomnumber[i].length; j++) {
                randomnumber[i][j] = rand.nextInt(10) + 1;
            }
        }
        
        for (i = 0; i < randomnumber.length; i++) {
            for (j = 0; j < randomnumber[i].length; j++) {
                System.out.print(randomnumber[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------");
        
        
        
        
    }
}
