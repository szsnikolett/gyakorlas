//Írj egy eljárást, mely egy paraméterként kapott egész számot kettes számrendszerbeli
//számmá konvertálva ír ki!
package com.szsnikolett;

import java.util.Scanner;

public class KettesSzamrendszer {
    public static void main (String[] args){
        int szam;

        System.out.println("Adjon meg egy számot:");
        Scanner szamBe = new Scanner(System.in);
        szam = szamBe.nextInt();

        int[] kettes = new int[20];
        int hossz = 0;

        for (int i = 0; ; i++){
            kettes[i] = szam % 2;
            szam = szam / 2;
            hossz++;
            if (szam == 0){
                break;
            }
        }

        System.out.println("A megadott szam kettes szamrendszerbeli alakja: ");
        for (int i = hossz-1; i >= 0 ; i--){
            System.out.print(kettes[i] + " ");
        }
    }
}
