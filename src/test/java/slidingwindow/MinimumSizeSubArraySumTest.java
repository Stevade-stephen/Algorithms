package slidingwindow;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MinimumSizeSubArraySumTest {

    @Test
    void minSubArraySum() {
        MinimumSizeSubArraySum underTest = new MinimumSizeSubArraySum();
        int result = underTest.minSubArraySum(new int[]{7, 2, 1, 1, 6, 5}, 11);
        assertThat(result).isEqualTo(2);
        int result2 = underTest.minSubArraySum(new int[]{7, 3, 2, 1, 1, 6, 5, 4}, 5);
        assertThat(result2).isEqualTo(1);
        int result3 = underTest.minSubArraySum(new int[]{8, 1, 5, 2, 1, 1, 6, 5}, 9);
        assertThat(result3).isEqualTo(2);
        int result4 = underTest.minSubArraySum(new int[]{4, 3, 2, 1, 3, 1, 6, 5, 4}, 5);
        assertThat(result4).isEqualTo(1);
        int result5 = underTest.minSubArraySum(new int[]{4, 3, 2, 1, 3, 1, 6, 5, 4}, 4);
        assertThat(result5).isEqualTo(1);
    }
}