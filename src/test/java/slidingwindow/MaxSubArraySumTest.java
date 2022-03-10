package slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MaxSubArraySumTest {
    private MaxSubArraySum underTest;

    @BeforeEach
    void setUp() {
        underTest = new MaxSubArraySum();
    }

    @Test
    @DisplayName("BruteForceTesting")
    void canCalculateTheMaximumSubArraySumWithBruteForce() {
        int firstResult = underTest.maxSubArraySumBruteForce(new int[]{2, 1, 5, 1, 3, 2}, 3);
        assertThat(firstResult).isEqualTo(9);
        int secondResult = underTest.maxSubArraySumBruteForce(new int[]{2, 1, 5, 1, 3, 2}, 4);
        assertThat(secondResult).isEqualTo(11);
        int thirdResult = underTest.maxSubArraySumBruteForce(new int[]{8, 7, 5, 5, 3, 2, 1, 7}, 4);
        assertThat(thirdResult).isEqualTo(25);
        int fourthResult = underTest.maxSubArraySumBruteForce(new int[]{8, 7, 5, 5, 3, 2, 1, 7}, 2);
        assertThat(fourthResult).isEqualTo(15);
        int fifthResult = underTest.maxSubArraySumBruteForce(new int[]{8, 7, 5, 5, 3, 2, 1, 7}, 3);
        assertThat(fifthResult).isEqualTo(20);
    }
}