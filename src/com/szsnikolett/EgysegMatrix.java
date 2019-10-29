package com.szsnikolett;

public class EgysegMatrix {
    public static void main(String[] args) {
        int[][] egysegMatrix = new int[5][5];

        for (int i = 0; i < egysegMatrix.length; i++){
            for (int j = 0; j < egysegMatrix[i].length; j++){
                if (i == j){
                    egysegMatrix[i][j] = 1;
                    System.out.print(egysegMatrix[i][j] + " ");
                } else {
                    egysegMatrix[i][j] = 0;
                    System.out.print(egysegMatrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
