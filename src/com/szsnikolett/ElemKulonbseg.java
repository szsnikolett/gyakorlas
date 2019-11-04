//Írj egy programot, amely egy N elemet tartalmazó tömbről megmondja, hogy a szomszédos
//elemek között mekkora legnagyobb különbség!
//Írj egy programot, amely egy N elemet tartalmazó tömbről megmondja, hogy melyik két
//eleme között legkisebb a különbség!
package com.szsnikolett;

public class ElemKulonbseg {
    public static void main (String[] args){
        int n = 10;
        int[] tomb = new int[n];
        int[] kulonbseg = new int[n-1];
        int max = 0;
        int min;

        System.out.println("A tomb elemei: " );
        for (int i = 0; i < tomb.length; i++){
            tomb[i] = (int) (Math.random()*20);
            System.out.print(tomb[i] + " ");
        }
        System.out.println();

        System.out.println("A tomb elemei közötti különbség: " );
        for (int i = 0; i < tomb.length-1; i++) {
            kulonbseg[i] = Math.abs(tomb[i + 1] - tomb[i]);
            System.out.print(kulonbseg[i] + " ");
        }
        System.out.println();


        for (int i = 0; i < kulonbseg.length; i++) {
            if (kulonbseg[i] > max){
                max = kulonbseg[i];
            }
        }
        System.out.println("A tomb elemei közötti legnagyobb különbség: " + max);


        min = kulonbseg[0];
        for (int i = 1; i < kulonbseg.length; i++) {
            if (kulonbseg[i] < min){
                min = kulonbseg[i];
            }
        }
        System.out.println("A tomb elemei közötti legkisebb különbség: " + min);
    }
}
