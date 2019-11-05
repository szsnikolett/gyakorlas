//Írj egy programot, mely egy valós tömb elemei közül meghatározza mekkora a második legnagyobb érték!
package com.szsnikolett;

public class LegnagyobbTombelem {
    public static void main(String[] args){
        int[] tomb = new int[10];
        int max1 = 0, max2;

        for (int i = 0; i < tomb.length; i++){
            tomb[i] = (int) (Math.random()*40);
            System.out.print(tomb[i] + " ");
        }
        System.out.println();

        //Első egyszerűbb megoldás a sorbarendezés majd a 2 utolsó elem lesz az eredmény
        System.out.println("A elso megoldás rendezett sorból:");
        for (int i = 0; i < tomb.length-1; i++){
            for (int j = i+1; j < tomb.length; j++){
                if (tomb[j] < tomb[i]){
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

        for (int i = 0; i < tomb.length; i++){
            if (tomb[i] > max1) {
                max1 = tomb[i];
            }
        }
        System.out.println();
        System.out.print("A legnagyobb elem: " + max1);

        max2 = max1;
        for (int i = tomb.length-1; i > 0; i--){
            if (tomb[i] < max2) {
                max2 = tomb[i];
                break;
            }
        }
        System.out.println();
        System.out.println("A masodik legnagyobb elem: " + max2 + "\n");

        //Masodik megoldás amikor az eredeti rendezetlen tömbből keresem ki az értékeket
        int[] tomb2 = new int[10];
        int maxR1, maxR2;

        System.out.println("A masodik megoldás rendezetlen sorból:");
        for (int i = 0; i < tomb2.length; i++){
            tomb2[i] = (int) (Math.random()*40);
            System.out.print(tomb2[i] + " ");
        }
        System.out.println();

        if (tomb2[0] < tomb2[1]){
            maxR1 = tomb2[1];
            maxR2 = tomb2[0];
        } else {
            maxR1 = tomb2[0];
            maxR2 = tomb2[1];
        }

        for (int i = 2; i < tomb2.length; i++){
            if (tomb2[i] > maxR1) {
                maxR2 = maxR1;
                maxR1 = tomb2[i];
            } else if (tomb2[i] > maxR2){
                maxR2 = tomb2[i];
            }
        }
        System.out.println();
        System.out.println("A legnagyobb elem: " + maxR1);
        System.out.println("A masodik legnagyobb elem: " + maxR2);
    }
}
