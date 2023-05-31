package SDESheet;
import java.util.* ;
import java.io.*; 

public class FlipBits {
	public static int flipBits(int[] arr,int n) {
        //Write your code here
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                arr[i] = -1;
            }
        }

        int smallestGlobal = 0;
        int smallestSoFar = 0;

        for (int x : arr) {
            smallestSoFar += x;
            if (smallestSoFar > 0) {
                smallestSoFar = 0;
            }
            smallestGlobal = Math.min(smallestGlobal, smallestSoFar);
        }

        int countOfOnes = 0;
        for (int x : arr) {
            if (x == 1) {
                countOfOnes++;
            }
        }

        return (-1) * smallestGlobal + countOfOnes;
	}
}
