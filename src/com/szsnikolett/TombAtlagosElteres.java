//. Írj egy programot, mely egy N db valós számot tartalmazó tömb elemeiről megmondja, hogy olyan eleme van, megy az értékek átlagától maximum 10-zel tér el!
package com.szsnikolett;

import java.util.Random;
import java.util.Scanner;

public class TombAtlagosElteres {
    public static void main(String[] args){
        int n;
        int osszeg = 0;
        int atlag = 0;
        int elter = 0;

        System.out.println("Add meg a tomb elemszámát: ");
        Scanner elemszam = new Scanner(System.in);
        n = elemszam.nextInt();

        int[] tomb = new int[n];
        int[] eltero = new int[n];

        for (int i = 0; i < n; i ++){
            tomb[i] = new Random().nextInt(50)+1;;
        }

        System.out.println("A tomb elemei: ");
        for (int i = 0; i < n; i ++){
            System.out.print(tomb[i] + " ");
        }
        System.out.println();

       for (int i = 0; i < n; i ++){
           osszeg = osszeg + tomb[i];
       }

       atlag = osszeg / n;
        System.out.println("A tömb átlaga: " + atlag);

        System.out.println("A tomb átlagától max 10-zel eltérő elemek:");
        for (int i = 0; i < n; i ++){
            eltero[i] = Math.abs(tomb[i] - atlag);

            if (eltero[i] < 11){
                elter++;
                System.out.print(tomb[i] + " ");
            }
        }

        System.out.println();
        System.out.println("A tomb átlagától max 10-zel eltérő elemek szama: " + elter + ", az eltérések:");
        for (int i = 0; i < n; i ++){
            System.out.print(eltero[i] + " ");
        }
        System.out.println();


    }
}
