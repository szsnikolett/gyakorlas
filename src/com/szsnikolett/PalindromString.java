package com.szsnikolett;

import java.util.Scanner;

public class PalindromString {
    public static void main(String[] args){
        Scanner szovegBe = new Scanner(System.in);
        String szoveg;
        String szovegF = "";

        System.out.println("Kérem írjon be egy szót, melyről megállapítjuk, hogy visszafelé is ugyanaz-e: ");
        szoveg = szovegBe.next();

        for (int i = szoveg.length()-1; i >= 0; i--){
            szovegF = szovegF + szoveg.charAt(i);
        }
        System.out.println("A szó megfordítva: " + szovegF);

        if (szoveg.equals(szovegF)){
            System.out.println("A " + szoveg + " visszafelé is ugyan az! ");
        } else {
            System.out.println("A " + szoveg + " visszafelé nem ugyan az! ");
        }
    }
}
