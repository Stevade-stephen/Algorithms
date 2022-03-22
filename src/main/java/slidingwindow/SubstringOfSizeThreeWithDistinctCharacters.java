package slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class SubstringOfSizeThreeWithDistinctCharacters {

    public int countGoodSubstrings(String s) {
        int count = 0;
        int start = 0;
        int reset = 3;

        for(int end = 0; end < s.length(); end++) {
            int index = 0;
            index += start;
            if (end >= reset - 1) {
                Set<Character> set = new HashSet<>();
                while (reset > 0) {
                    set.add(s.charAt(index++));
                    reset--;
                }
                reset += 3;
                start++;
                if (set.size() == reset) count++;
                set.clear();
            }
        }
        return count;
    }
}
