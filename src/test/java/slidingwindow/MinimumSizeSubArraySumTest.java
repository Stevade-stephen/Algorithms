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
    }
}