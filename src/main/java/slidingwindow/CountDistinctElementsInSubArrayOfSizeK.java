package slidingwindow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Count Distinct Elements in Every Window of Size K.
 * Given an array of n integers and an integer k (k is always smaller or equal to n).
 * Return the count of distinct elements in all windows (or in all sub-arrays) of size k.
 * For example –
 * Example 1:
 * Input: {1, 5, 9, 3, 3, 7, 3},   k = 3
 * Output: {3, 3, 2, 2, 2}
 */
public class CountDistinctElementsInSubArrayOfSizeK {
    public List<Integer> countDistinctElementsInSubArray(final int [] array, final int k){
        List<Integer> result = new ArrayList<>();
        int windowStart = 0;
        int subWindow = k;
        int index = 0;

        for(int windowEnd = 0; windowEnd < array.length; windowEnd++){
            if(windowEnd >= k - 1){
                Set<Integer> set = new HashSet<>();
                while(subWindow > 0){
                    set.add(array[index++]);
                    subWindow--;
                }
                result.add(set.size());
                subWindow = k;
                windowStart++;
                index = windowStart;
            }

        }

        return result;
    }
}
