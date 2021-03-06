package slidingwindow;

/**
Given an array of positive integers and a positive number K.
Write a code to find the maximum sum subarray of size k.
Java
Example 1:
Input: {2, 1, 5, 1, 3, 2},  K = 3
Output: 9 {5, 1, 3}
 */

public class MaxSubArraySum {

    public int maxSubArraySumBruteForce(int[] array, final int k) {
        int maxSum = 0;
        for (int i = 0; i < array.length - (k - 1); i++) {
            int sum = 0;
            for (int j = i; j < k + i; j++) {
                sum = sum + array[j];
            }
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }

    public int maxSubArraySumWithSlidingWindow(int [] array, final int k){
        int start = 0;
        int sum = 0;
        int maxSum = 0;

        for(int end = 0; end < array.length; end++){
            sum += array[end];

            if(end >= k - 1){
                maxSum = Math.max(sum, maxSum);
                sum -= array[start];
                start++;
            }
        }
        return maxSum;
    }
}
