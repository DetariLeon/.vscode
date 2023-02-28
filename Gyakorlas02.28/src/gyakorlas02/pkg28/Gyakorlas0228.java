/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyakorlas02.pkg28;

import java.util.Random;

/**
 *
 * @author user3
 */
public class Gyakorlas0228 {
//Feltöltés Random számokkal

    public static void MatrixRandom(int[][] MatrixTomb) {
        int i, j;
        Random rand = new Random();
        for (i = 0; i < MatrixTomb.length; i++) {
            for (j = 0; j < MatrixTomb[i].length; j++) {
                MatrixTomb[i][j] = rand.nextInt(5) + 65;
            }

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
//max sor

    public static void MaximumSor(int[][] MatrixTomb) {
        int i, j, max;
        for (i = 0; i < MatrixTomb.length; i++) {
            max = MatrixTomb[i][0];
            for (j = 0; j < MatrixTomb[i].length; j++) {
                if (max < MatrixTomb[i][j]) {
                    max = MatrixTomb[i][j];
                }
            }
            System.out.println((i + 1) + ".sor max száma: " + max);
        }

    }
//Min oszlop 

    public static void MinOszlop(int[][] MatrixTomb) {
        int i, j, min;
        for (j = 0; j < MatrixTomb[0].length; j++) {
            min = MatrixTomb[j][0];
            for (i = 0; i < MatrixTomb.length; i++) {
                if (min > MatrixTomb[i][j]) {
                    min = MatrixTomb[i][j];
                }
            }
            System.out.println((j + 1) + ".oszlop min száma: " + min);
        }
    }
//Két mátrix összeadása

    public static int[][] MatrixOsszeadas(int[][] MatrixRandom, int[][] MatrixRandom2) {
        int i, j;
        int[][] sum = new int[MatrixRandom.length][MatrixRandom[0].length];
        for (i = 0; i < MatrixRandom.length; i++) {
            for (j = 0; j < MatrixRandom[0].length; j++) {
                sum[i][j] = MatrixRandom[i][j] + MatrixRandom2[i][j];
            }
        }
        return sum;
    }
//hanyados számitás 

    public static float[][] MatrixDivide(int[][] Matrix1, int[][] Matrix2) {
        int i, j;
        float[][] quotiens = new float[5][5];
        for (i = 0; i < Matrix1.length; i++) {
            for (j = 0; j < Matrix1[i].length; j++) {
                quotiens[i][j] = (float) Matrix1[i][j] / (float) Matrix2[i][j];
            }
        }
        return quotiens;
    }

    public static void writeFloatMatrix(float[][] tomb) {
        int i, j;

        for (i = 0; i < tomb.length; i++) {
            for (j = 0; j < tomb[i].length; j++) {
                System.out.print(tomb[i][j] + " ");
            }
            System.out.println();
        }
    }
//Van-e egymás mellett 2 egyforma szam

    public static boolean MatrixEgyforma(int[][] MatrixTomb) {
        int i, j;
        for (i = 0; i < MatrixTomb.length; i++) {
            for (j = 0; j < (MatrixTomb[i].length - 1); j++) {
                if (MatrixTomb[i][j] == MatrixTomb[i][j + 1]) {
                    return true;
                }

            }
        }
        return false;
    }

    //készíts sztasztikát, hogy hány darab 65,66,67,68,69 van a mátriban
    public static int[] MatrixStat(int[][] MatrixTomb) {
        int[] stat = new int[256];
        int i, j;
        for (i = 0; i < MatrixTomb.length; i++) {
            for (j = 0; j < MatrixTomb[i].length; j++) {
                int item = MatrixTomb[i][j];
                stat[item]++;
            }
        }
        return stat;
    }

    public static void main(String[] args) {
        int[][] szamok = new int[5][5];
        int[][] szamok2 = new int[5][5];
        MatrixRandom(szamok);
        MatrixRandom(szamok2);
        writeMatrix(szamok);
        MaximumSor(szamok);
        MinOszlop(szamok);
        writeMatrix(MatrixOsszeadas(szamok, szamok2));
        writeFloatMatrix(MatrixDivide(szamok, szamok2));
        System.out.println("Van e két egyforma szám egymás mellett? " + MatrixEgyforma(szamok));
        int[] statResult= MatrixStat(szamok);
        for (int i= 65;i<70; i++){
            System.out.println(i+1 + "; "+ statResult[i]+ " darab");
}
    }

}
