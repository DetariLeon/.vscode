/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orai0131;

import java.util.Random;

/**
 *
 * @author user3
 */
public class Orai0131 {
    public static void RandomMatrix(int[][] matrixTomb){
    int i, j;
        System.out.println("-------Mátrix feltöltése random számokkal------");
        
        Random rand = new Random();
        for (i = 0; i < matrixTomb.length; i++) {
            for (j = 0; j < matrixTomb[i].length; j++) {
                matrixTomb[i][j] = rand.nextInt(10) + 1;
            }
        }
        for (i = 0; i < matrixTomb.length; i++) {
            for (j = 0; j < matrixTomb[i].length; j++) {
                System.out.print(matrixTomb[i][j] + " ");
            }
            System.out.println();
        }
}
    public static void writeMatrix(int[][] tomb) {
        int i, j;
        
        for (i = 0; i < tomb.length; i++) {
            for (j = 0; j < tomb[i].length; j++) {
                System.out.print(tomb[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void ReverseMatrix(int[][] matrixTomb) {
        int i, j;
        System.out.println("------Visszafele------");
        for (i = matrixTomb.length - 1; i >= 0; i--) {
            for (j = matrixTomb[i].length - 1; j >= 0; j--) {
                System.out.print(matrixTomb[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int MatrixOsszege(int[][] matrixTomb) {
        System.out.println("-----A mátrix elemeinek összege-----");
        int i, j;
        int osszeg = 0;
        for (i = 0; i < matrixTomb.length; i++) {
            for (j = 0; j < matrixTomb[i].length; j++) {
                osszeg = osszeg + matrixTomb[i][j];
            }
        }
        return osszeg;
    }

    public static boolean ParosMatrix(int[][] matrixTomb) {
        System.out.println("-----Paros számok-e-----");
        int i, j;
        int parosDb = 0;
        for (i = 0; i < matrixTomb.length; i++) {
            for (j = 0; j < matrixTomb[i].length; j++) {
                if (matrixTomb[i][j] % 2 == 0) {
                    parosDb++;
                }
            }
        }
        return parosDb >(matrixTomb.length*matrixTomb[0].length);
    }
    public static void MatrixDuplazasa(int[][] matrixTomb){
        System.out.println("-----Mátrix duplázása-----");
        for (int i = 0; i < matrixTomb.length; i++) {
            for (int j = 0; j < matrixTomb[i].length; j++) {
                matrixTomb[i][j] = matrixTomb[i][j]*2;
            }
    }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] szamok = new int [4][5] ;
        RandomMatrix(szamok);
        ReverseMatrix(szamok);
        System.out.println(MatrixOsszege(szamok));
        System.out.println(ParosMatrix(szamok));
        
        MatrixDuplazasa(szamok);
        writeMatrix(szamok);
        
        
        
        
    }
}
