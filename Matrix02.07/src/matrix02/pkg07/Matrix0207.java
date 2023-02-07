/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix02.pkg07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Matrix0207 {

    public static void Matrix1(int[][] matrixTomb) {
        int i, j;
        System.out.println("----Feltöltés Random számokkal----");
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

    public static void Matrix2(int[][] matrixTomb) {
        int i, j;
        System.out.println("----Feltöltés Random számokkal 2.----");
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

    public static int FoatloOsszeg(int[][] matrixTomb) {
        System.out.println("-----Fő átló összege-----");
        int i, j;
        int osszeg = 0;
        for (i = 0; i < matrixTomb.length; i++) {
            osszeg = osszeg + matrixTomb[i][i];
        }
        return osszeg;
    }

    //irj egy metóust ami felcseréli a mátrix 2 elemét
    public static void matrixFelcsereles(int[][] matrixTomb, int sor1, int oszlop1, int sor2, int oszlop2) {
        System.out.println("-----2 szám felcserélése-----");
        int k = matrixTomb[sor1][oszlop1];
        matrixTomb[sor1][oszlop1] = matrixTomb[sor2][oszlop2];
        matrixTomb[sor2][oszlop2] = k;

    }

    public static boolean egyenloMatrix(int[][] matrix1, int[][] matrix2) {
        System.out.println("-----Azonos-e a 2 mátrix-----");
        return Arrays.equals(matrix1, matrix2);
    }

    public static void forditottMatrix(int[][] matrixTomb) {
        System.out.println("-----Fordított mátrix-----");
        int i, j;
        for (i = matrixTomb.length - 1; i >= 0; i--) {
            for (j = matrixTomb[i].length - 1; j >= 0; j--) {
                System.out.print(matrixTomb[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] szamok = new int[5][5];
        Matrix1(szamok);
        Matrix2(szamok);
        System.out.println(FoatloOsszeg(szamok));
        Scanner bill = new Scanner(System.in);
        System.out.println("Add meg a helyeket:");
        System.out.println("Sor 1:");
        int sor1 = bill.nextInt();
        System.out.println("Oszlop 1:");
        int oszlop1 = bill.nextInt();
        System.out.println("Sor 2:");
        int sor2 = bill.nextInt();
        System.out.println("Oszlop 2:");
        int oszlop2 = bill.nextInt();
        matrixFelcsereles(szamok, sor1, oszlop1, sor2, oszlop2);
        writeMatrix(szamok);
        System.out.println(egyenloMatrix(szamok, szamok));
        forditottMatrix(szamok);
    }

}
