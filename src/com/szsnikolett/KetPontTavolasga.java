//Írj egy függvényt, mely paraméterként megkapja két pont (X,Y) koordinátáit és visszaadja a két pont távolságát!
//gyök alatt[negyzet(x2-x1) + negyzet(y2-y1)]
package com.szsnikolett;

import java.util.Scanner;

public class KetPontTavolasga {
    public static void main(String[] args){
        int[] pont1 = new int[2];
        int[] pont2 = new int[2];
        double hossz;

        System.out.println("Add meg a 2 pont koordinátáit: ");
        Scanner pont = new Scanner(System.in);
        pont1[0] = pont.nextInt();
        pont1[1] = pont.nextInt();
        pont2[0] = pont.nextInt();
        pont2[1] = pont.nextInt();

        System.out.println("A két pont koordinátái: " + pont1[0] + "," + pont1[1] + " es " + pont2[0] + "," + pont2[1]);

        /*System.out.println("Az első koordináták különbsége: " + (pont2[0]-pont1[0]) + ", a második koordináták különbsége: " + (pont2[1]-pont1[1]));
        System.out.println("A különbégek négyzete: " + (Math.pow((pont2[0]-pont1[0]), 2)) + " es " + (Math.pow((pont2[1]-pont1[1]), 2)));
        System.out.println("A négyzetek különbsége: " + (Math.pow((pont2[0]-pont1[0]), 2) - Math.pow((pont2[1]-pont1[1]), 2)));
        System.out.println("A négyzetkülönbség gyöke: " + Math.sqrt( (Math.pow((pont2[0]-pont1[0]), 2) - Math.pow((pont2[1]-pont1[1]), 2)) ));*/
        hossz = Math.sqrt( (Math.pow((pont2[0]-pont1[0]), 2) - Math.pow((pont2[1]-pont1[1]), 2)) );
        System.out.println("A 2 pont távolsága: " + hossz);
    }
}
