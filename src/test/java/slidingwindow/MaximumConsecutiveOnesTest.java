package slidingwindow;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaximumConsecutiveOnesTest {
    MaximumConsecutiveOnes underTest = new MaximumConsecutiveOnes();

    @Test
    void canCountConsecutiveOnesSuccessfully() {
        int result = underTest.countConsecutiveOnes(new int[]{1, 1, 0, 0, 1, 1, 1, 1, 1});
        assertThat(result).isEqualTo(6);
        int result2 = underTest.countConsecutiveOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1});
        assertThat(result2).isEqualTo(4);
        int result3 = underTest.countConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 0, 1, 0, 1});
        assertThat(result3).isEqualTo(4);
    }
}