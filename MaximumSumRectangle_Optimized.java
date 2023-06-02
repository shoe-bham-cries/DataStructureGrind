package SDESheet;

public class MaximumSumRectangle_Optimized {
    public static int maxSumRectangle(int[][] arr, int n, int m) {
        int maxSum = Integer.MIN_VALUE;
        
        for (int r1 = 0; r1 < n; r1++) {
            int[] temp = new int[m];
            
            for (int r2 = r1; r2 < n; r2++) {
                for (int c = 0; c < m; c++) {
                    temp[c] += arr[r2][c];
                }
                
                int currentSum = kadane(temp);
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        
        return maxSum;
    }
    
    private static int kadane(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
    
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, -1, -4, -20},
            {-8, -3, 4, 2, 1},
            {3, 8, 10, 1, 3},
            {-4, -1, 1, 7, -6}
        };
        
        int n = arr.length;
        int m = arr[0].length;
        
        int maxSum = maxSumRectangle(arr, n, m);
        System.out.println("Maximum Sum: " + maxSum);
    }
}

