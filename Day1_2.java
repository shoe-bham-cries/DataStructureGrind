package SDESheet;
/*
Problem Statement: This problem has 3 variations. They are stated below:
Variation 1: Given row number r and column number c. Print the element at position (r, c) in 
Pascal’s triangle.
Variation 2: Given the row number n. Print the n-th row of Pascal’s triangle.
Variation 3: Given the number of rows n. Print the first n rows of Pascal’s triangle.
 */

import java.util.*;

public class Day1_2 {
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial not defined");
        }
        
        if (n == 0 || n == 1) {
            return 1;
        }
        
        return n * factorial(n - 1);
    }
    
    public static int comibnatric(int n, int k) {
        if(n<k){
            throw new IllegalArgumentException("Combinatric not defined");
        }else{
            return factorial(n)/(factorial(k)*factorial(n-k));
        }
        
    }

    public static int nCr(int n, int r) {
        if(n<r){
            throw new IllegalArgumentException("Combinatric not defined");
        }else{
            int result = 1;
            for(int i = 0; i < r; i++){
                result *= (n - i);
                result /= (r-i);
            }
            return result;
        }
        
    }
    public static void printRows(int r) {
        System.out.println("\n");
        int res = 1;
        System.out.print(res + " "); // printing 1st element

        for(int i = 1; i < r; i++){
            res *= r-i;
            res /= i;
            System.out.print(res + " ");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number (r): ");
        int r = sc.nextInt();
        System.out.println("Enter the column number (c): ");
        int c = sc.nextInt();
        
        //Solving the variation 1 first, by using Pascal's rule:
        System.out.println("Element at position (r,c) is: ");
        System.out.print(comibnatric((r-1),(c-1)));

        
        System.out.println("\nElements of row r: ");
        /* Naive solution:
        int res = 1;
        System.out.print(res + " "); // printing 1st element

        for (int i = 0; i < r; i++) {
            row_res[i] = comibnatric(r, i);
            }   
        
        */


        //Solving variation 2 optimally:
        
        
        // Solving variation 3 optimally:
        System.out.println("\nPascal Triangle upto row" + r);
        for(int i = 1; i < r; i++){
            printRows(i);
        }
    sc.close();
    }    
}
