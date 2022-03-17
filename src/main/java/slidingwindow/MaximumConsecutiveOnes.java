package slidingwindow;


/**
 * Maximum consecutive ones II. Given an array which only consists of 0s and 1s.
 * Write a code to find the maximum number of consecutive 1s in an array, if you can flip at most one zero.
 * For example:
 * Input: {1, 1, 0, 0, 1, 1, 1, 1, 1}
 * Output: 6
 * In this example, If we can flip at most one zero then the maximum number of consecutive 1s in an array is 6 {1, 1, 1, 1, 1, 1}.
 */
public class MaximumConsecutiveOnes {

    @SuppressWarnings(value = "all")
    public int countConsecutiveOnes(int [] arr){
        int maxConsecutiveOne = 0;
        int start = 0;
        int numberOfZerosToFlip = 1;
        int numberOfZerosEncountered = 0;

        for(int end = 0; end < arr.length; end++){
            if(arr[end] == 0){
                numberOfZerosEncountered++;
            }

            while (numberOfZerosEncountered > numberOfZerosToFlip){
                if(arr[start] == 0){
                    numberOfZerosEncountered--;
                }
                start++;
            }

            maxConsecutiveOne = Math.max(maxConsecutiveOne, end - start + 1);
        }
        return maxConsecutiveOne;
    }

    //This is for if you can flip k zeros.
    @SuppressWarnings(value = "all")
    public int countConsecutiveOnesWithKFlips(int [] arr, final int k){ //[1,1,0,0,1,1,1,1,1]
        int start = 0;
        int maxConsecutiveOne = 0;
        int numberOfZerosSeen = 0;

        for(int end = 0; end < arr.length; end++){
            if(arr[end] == 0){
                numberOfZerosSeen++;
            }

            while (numberOfZerosSeen > k){
                if(arr[start] == 0){
                    numberOfZerosSeen--;
                }
                start++;
            }

            maxConsecutiveOne = Math.max(maxConsecutiveOne, end - start + 1);
        }
        return maxConsecutiveOne;
    }
}
