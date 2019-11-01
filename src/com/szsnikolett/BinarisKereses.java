package com.szsnikolett;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarisKereses {
    public static void main (String[] args){
        int[] tomb = new int[10];
        int szam;
        Random rand = new Random();

        for (int i = 0; i < tomb.length; i++){
            tomb[i] = rand.nextInt(50)+1;
            System.out.print(tomb[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < tomb.length-1; i++){
            for (int j = i + 1; j <= tomb.length-1; j++) {
                if (tomb[i] > tomb[j]) {
                    int tmp = tomb[i];
                    tomb[i] = tomb[j];
                    tomb[j] = tmp;
                }
            }
        }

        for (int i = 0; i < tomb.length; i++){
            System.out.print(tomb[i] + " ");
        }
        System.out.println();

        Scanner kerSzam = new Scanner(System.in);
        System.out.println("Írjon be egy számot, melyet keressünk meg a sorban:");
        szam = kerSzam.nextInt();

        int also = 0;
        int felso = tomb.length-1;
        int kozepso;

        do {
            kozepso = (also + felso) / 2;
            if (szam < tomb[kozepso]) {
                felso = kozepso - 1;
            } else if (szam > tomb[kozepso]){
                also = kozepso + 1;
            }

        } while((tomb[kozepso] != szam) && (also <= felso));

        if (also <= felso){
            System.out.println("helye: " + (kozepso+1));
        } else {
            System.out.println("nincs benne");
        }

        /*int keresettzam = Arrays.binarySearch(tomb, szam);
        if (keresettzam == -1){
            System.out.println("Nincs benn");
        } else {
            System.out.println("benn:" + keresettzam);
        }*/


    }
}
