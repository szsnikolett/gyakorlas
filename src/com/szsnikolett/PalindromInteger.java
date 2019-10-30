package com.szsnikolett;

import java.util.Scanner;

public class PalindromInteger {
        public static void main(String[] args){
            System.out.println("Please Enter a number : ");
            int palindrome = new Scanner(System.in).nextInt();

            if(isIntPalindrom(palindrome)){
                System.out.println("Number : " + palindrome + " is a palindrome");
            }else{
                System.out.println("Number : " + palindrome + " is not a palindrome");
            }
        }

        public static boolean isIntPalindrom(int num) {
            int palindrom = num;
            int reverse = 0;

            while (palindrom != 0) {
                int remainder = palindrom % 10; //a remainderbe kerül a maradék (10-es számrendszer ezért a 10zel osztás)
                reverse = reverse * 10 + remainder; // a reverse értékét visszaszorozzuk 10zel, majd a maradékot hozzáadjuk így építjuk vissza a számot
                palindrom = palindrom / 10; //a palindrom értéke lesz a 10zel való osztás egész értéke, melyet a következő körben újra osztunk maradékos osztással
            }

            if (num == reverse) {
                return true;
            }

            return false;
        }

}
