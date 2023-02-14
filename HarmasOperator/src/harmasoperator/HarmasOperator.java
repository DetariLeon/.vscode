/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harmasoperator;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class HarmasOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 10;
        String decide;
        if (num < 20) {
            decide = "Kisebb";
        } else {
            decide = "Nagyobb";
        }
        System.out.println(decide);

        decide = (num < 20) ? "Kisebb" : "Nagyobb";
        System.out.println(decide);
        System.out.println("-----Nagybetűs-e-----");
        //A felhasználó kérjen be egy karaktert és öntsük el hogy Nagybetűs-e
        Scanner bill = new Scanner(System.in);
        System.out.print("Irjal egy karaktert:");
        char betu = bill.next().charAt(0);
        if (Character.isUpperCase(betu)) {
            System.out.println("A(z)" + betu + " karakter nagybetűs");

        } else {
            System.out.println("A(z) " + betu + " karakter kisbetűs");
        }

        //Kiiratás egy sorba
        System.out.println("-----Egy sorba kiiratás-----");
        System.out.println("A(z) " + betu + " " + (Character.isUpperCase(betu) ? "nagybetűs" : "Kisbetűs") + ".");

        //Felhasználótol bekérérjük egy hónap sorszámát.
        //Switch szerkezettel megmondjuk, hogy hány napos az adott hónap
        System.out.println("-----Hónapok-----");
        System.out.println("Irj eg hónapszámot: ");
        int honap = bill.nextInt();
        int napok = 0;
        System.out.print("Kérlek add meg az évszámot: ");
        int ev = bill.nextInt();
        switch (honap) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                napok = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                napok = 30;
                break;
            case 2:
                if ((ev % 4 == 0 && ev % 100 != 0) || ev % 400 == 0) {
                    napok = 29;
                } else {
                    napok = 28;
                }
                break;
            default:
                System.out.println("Nincs ilyen hónap");
                break;
        }
        System.out.println(napok);

    }

}
