package SDESheet;

public class MaximumSumRectangle {
public static void main(String[] args) {
    int[][] matrix = {
        {1, 2, -1, -4, -20},
        {-8, -3, 4, 2, 1},
        {3, 8, 10, 1, 3},
        {-4, -1, 1, 7, -6}
    };
    int n = matrix.length;
    int m = matrix[0].length;

    int maxSum = maxSumRectangle(matrix, n, m);
    System.out.println("Maximum Sum: " + maxSum);
}
public static int calculateSum(int[][] arr, int r1, int r2, int c1, int c2){
    int sum = 0;
    for(int i = r1; i <= r2; i++){
        for(int j = c1; j <= c2; j++){
            sum += arr[i][j];
        }
    }
    return sum;
}
public static int maxSumRectangle(int[][] arr, int n, int m)
    {
        // Write your code here.
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
            // start point = i,j
                for(int k = i; k < n; k++){
                    for(int l = j; l<m; l++){
                    //end point = k,l
                    currentSum = calculateSum(arr, i, k, j, l);  
                    maxSum = Math.max(currentSum, maxSum);
                    }
                }
            }
        }
    return maxSum;
    }


}
