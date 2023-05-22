package SDESheet;

/*
Problem Statement: 
Given a matrix if an element in the matrix is 0 then you will have to set its
entire column and row to 0 and then return the matrix.
*/

import java.util.*;

public class Day1_1_approach3 {
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
        int col0 = 1;
        System.out.println("Original Matrix:");
        printMatrixData(mat);

        for(int i = 0; i < rows; i++){
            for(int j = 0; j< cols; j++){
                if (mat[i][j] == 0){
                    mat[i][0] = 0;
                    if(j==0){
                        col0 = 0;
                    } else{
                        mat[0][j] = 0;
                    }
                }
            }
        }
        System.out.println("Matrix in transition 1: ");
        printMatrixData(mat);
        for(int i = 1; i < rows; i++){
            for(int j = 1; j< cols; j++){
                if (mat[i][j] != 0){
                    if(mat[i][0] == 0 || mat[0][j] == 0){
                        mat[i][j] = 0;
                    }
                }
            }
        }
        System.out.println("Matrix in transition 2: ");
        printMatrixData(mat);

        if (mat[0][0] == 0) {
            for (int j = 0; j < cols; j++) {
                mat[0][j] = 0;
            }
        }
        if (col0 == 0) {
            for (int i = 0; i < rows; i++) {
                mat[i][0] = 0;;
            }
        }
        System.out.println("Updated matrix: ");
        printMatrixData(mat);
        sc.close();
        }
    }    

