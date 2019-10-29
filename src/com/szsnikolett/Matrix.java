package com.szsnikolett;

public class Matrix {

    public static void main(String[] args) {
	    int[][] matrix = {{2, 3, 4, 1}, {1, 1, 2, 1}, {2, 2, 1, 2}, {2, 3, 1, 1}};

	    for (int i = 0; i < matrix.length; i++){
	        for (int j = 0; j < matrix[i].length; j++){
	            System.out.print(matrix[i][j] + " ");
            }
	        System.out.println();
        }

	    //transzponálás vagyis tükrözés
        System.out.println();
	    System.out.println("tükrözés után: ");
        for (int i = 0; i < matrix.length; i++){
            for (int j = i + 1; j < matrix[i].length; j++){
                    int temp =  matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
