/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolgozat0301;

import java.util.Random;

/**
 *
 * @author user3
 */
public class Dolgozat0301 {

    public static void matrix(int[][] matrixTomb) {
        int i, j;
        Random rand = new Random();
        for (i = 0; i < matrixTomb.length; i++) {
            for (j = 0; j < matrixTomb[i].length; j++) {
                matrixTomb[i][j] = rand.nextInt(21) + 10;
            }
        }
    }

    public static void writeMatrix(int[][] matrixTomb) {
        int i, j;

        for (i = 0; i < matrixTomb.length; i++) {
            for (j = 0; j < matrixTomb[i].length; j++) {
                System.out.print(matrixTomb[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Kulonbseg(int[][] matrixTomb) {
        int i, j, max, min, kulonbseg = 0;
        for (i = 0; i < matrixTomb.length; i++) {
            max = matrixTomb[i][0];
            min = matrixTomb[i][0];
            for (j = 0; j < matrixTomb[i].length; j++) {
                if (max < matrixTomb[i][j]) {
                    max = matrixTomb[i][j];
                }
                if (min > matrixTomb[i][j]) {
                    min = matrixTomb[i][j];
                }
                kulonbseg = max - min;
            }
            System.out.println("A(z) " + (i + 1) + " sor különbsége:" + kulonbseg);
        }
    }

    public static boolean Primszam(int[][] matrixTomb) {
        int i, j, oszto = 2;

        for (i = 0; i < matrixTomb.length; i++) {
            for (j = 0; j < matrixTomb[i].length; j++) {
                if (matrixTomb[i][j] % oszto != 0 && oszto < matrixTomb[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void primszamHelye(int[][] matrixTomb) {
        int i, j, oszto = 2,oszlop,sor;

        for (i = 0; i < matrixTomb.length; i++) {
            for (j = 0; j < matrixTomb[i].length; j++) {
                if (matrixTomb[i][j] % oszto != 0 && oszto < matrixTomb[i][j]) {
                    sor = matrixTomb[i+1][j];
                }
            }
            
        }
    }

    

    public static void main(String[] args) {
        int[][] szamok = new int[1][  1];
        matrix(szamok);
        writeMatrix(szamok);
        Kulonbseg(szamok);
        System.out.println(Primszam(szamok) ? "Van prímszám" : "Nincs prímszám");
        primszamHelye(szamok);
    }

}
