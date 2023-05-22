package SDESheet;

/*
Problem Statement: 
Given a matrix if an element in the matrix is 0 then you will have to set its
entire column and row to 0 and then return the matrix.
*/

import java.util.*;

public class Day1_1_approach1 {
    public static int[][] readMatrixData(int rows, int cols) {
        int[][] mat = new int[rows][cols];
        Scanner sc = new Scanner(System.in);
    
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter Element [" + (i+0) + "][" + (j+ 0) + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return mat;
    }

    public static void printMatrixData(int[][] mat) {
    int rows = mat.length; 
    int cols = mat[0].length;

        for (int i = 0; i < rows; i++) {
            System.out.print("[");
            for (int j = 0; j < cols; j++) {
                System.out.print(" " + mat[i][j] + "");
            }
            System.out.print("]");
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix:");        
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns in the matrix:");        
        int cols = sc.nextInt();
        int mat[][] = readMatrixData(rows, cols);
        System.out.println("Original Matrix:");
        printMatrixData(mat);
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if( mat[i][j] == 0){
                    for(int k = 0; k < rows; k++){
                        mat[k][j] = (mat[k][j] != 0) ? 9999 : 0;
                    }
                    for(int k = 0; k < cols; k++){
                        mat[i][k] = (mat[i][k] != 0) ? 9999 : 0;
                    }
                } 
            }
        }
        System.out.println("Midway: ");
        printMatrixData(mat);

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                mat[i][j] = (mat[i][j] == 9999) ? 0 : mat[i][j];
            }
        }
        System.out.println("Updated matrix: ");
        printMatrixData(mat);
        sc.close();
        }
    }    

