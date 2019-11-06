//Írj egy programot, mely egy NxN-es valós mátrix főátlója alatti elemek összegét határozza meg!
package com.szsnikolett;

public class MatrixOsszeg {
    public static void main(String[] args){
        int[][] matrix = new int[5][5];
        int osszeg = 0;

        for (int i = 0; i < matrix.length;i++){
            for (int j = 0; j <matrix[i].length; j++){
                matrix[i][j] =(int) (Math.random()*10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < matrix.length;i++){
            for (int j = 0; j <matrix[i].length; j++){
                if (i > j){
                    osszeg = osszeg + matrix[i][j];
                }
            }
        }
        System.out.println("A főatló alatti elemek összege: " + osszeg);
    }
}
