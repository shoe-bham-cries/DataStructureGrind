package SDESheet;
/*
Problem Statement: Given an integer array arr, find the contiguous subarray (containing at least 
one number) which has the largest sum and returns its sum and prints the subarray.
 */
public class KadaneAlgorithm {
    public static long maxSubarraySum(int[] arr, int n) {
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++){
			if (sum > 0){
				sum += arr[i];
				maxSum = (sum > maxSum) ? sum : maxSum;
			}
			else{
				sum = 0; 
				sum += arr[i];
				maxSum = (sum > maxSum) ? sum : maxSum;
			}
		}
		return (maxSum > 0 ) ? maxSum : 0;
	}

	public static int optimisedKadane(int[] arr, int n) {
		int maxSum = arr[0];
		int currentSum = arr[0];
	
		for (int i = 1; i < n; i++) {
			currentSum = Math.max(arr[i], currentSum + arr[i]);
			maxSum = Math.max(maxSum, currentSum);
		}
	
		return maxSum;
	}
	
public static void main(String[] args) {
    int[] array1 = {1, 2, 7, -4, 3, 2, -10, 9, 1};
    int[] array2 = {10, 20, -30, 40, -50, 60};
    int[] array3 = {18, -6, -6, -5, 7, 10, 16, -6, -2, 0};
    int[] array4 = {-7, -8, -16, -4, -8, -5, -7, -11, -10, -12, -4, -6, -4, -16, -10};

    System.out.println(optimisedKadane(array1, array1.length));
    System.out.println(optimisedKadane(array2, array2.length));
    System.out.println(optimisedKadane(array3, array3.length));
    System.out.println(optimisedKadane(array4, array4.length));

}    
}
