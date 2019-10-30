package com.szsnikolett;

import java.util.Scanner;

public class PrimSzam {
    public static void main(String[] args){
        int szam;
        boolean prim = true;

        Scanner in = new Scanner(System.in);
        System.out.println("Kérem, hogy gépelje be a szamot(0 és 1 nem prímszám)!");
        szam = in.nextInt();

        if (szam == 0 || szam == 1){
            System.out.println(szam + " nem prímszam!");
            prim = false;
        } else {
            for (int i = 2; i < Math.sqrt(szam); i++){
                if (szam % i == 0){
                    prim = false;
                    System.out.println(szam + " nem prímszam!");
                    break;
                }
            }

            if (prim == true){
                System.out.println(szam + " prímszam!");
            }
        }

    }
}
