package com.szsnikolett;

public class HaromszogMatrix {
    public static void main(String[] args) {
        int[][] haromszogMatrix = new int[4][4];

        for (int i = 0; i < haromszogMatrix.length; i++){
            for (int j = 0; j < haromszogMatrix[i].length; j++){
                if (i == j){
                    haromszogMatrix[i][j] = 2;
                    System.out.print(haromszogMatrix[i][j] + " ");
                } else if (i > j){
                    haromszogMatrix[i][j] = 1;
                    System.out.print(haromszogMatrix[i][j] + " ");
                } else {
                    haromszogMatrix[i][j] = 0;
                    System.out.print(haromszogMatrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
