package slidingwindow;

/**
 * Given an array of positive integers and a positive number target,
 * find the smallest contiguous subarray whose sum is either greater and equal to target.
 * If no subarray is found, return 0.
 * Example: {7, 2, 1, 1, 6, 5}, target = 11
 * output is 2, subarray {6,5} has the minimum subarray sum.
 * */
public class MinimumSizeSubArraySum {
    public int minSubArraySum(int [] numbers, final int target){
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;

        for (int end = 0; end < numbers.length; end++){
            sum += numbers[end];

            while(sum >= target && start <= end){
                minLength = Math.min(minLength, end - start + 1);
                sum -= numbers[start++];
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}
