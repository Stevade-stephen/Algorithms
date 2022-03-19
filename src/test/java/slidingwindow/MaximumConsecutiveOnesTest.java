package slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaximumConsecutiveOnesTest {
    private MaximumConsecutiveOnes underTest;

    @BeforeEach
    public void setUp(){
        underTest = new MaximumConsecutiveOnes();
    }

    @Test
    void canCountConsecutiveOnesSuccessfully() {
        int result = underTest.countConsecutiveOnes(new int[]{1, 1, 0, 0, 1, 1, 1, 1, 1});
        assertThat(result).isEqualTo(6);
        int result2 = underTest.countConsecutiveOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1});
        assertThat(result2).isEqualTo(4);
        int result3 = underTest.countConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 0, 1, 0, 1});
        assertThat(result3).isEqualTo(4);
        int result4 = underTest.countConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1});
        assertThat(result4).isEqualTo(6);
        int result5 = underTest.countConsecutiveOnes(new int[]{1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1});
        assertThat(result5).isEqualTo(5);
    }

    @Test
    void canCountConsecutiveOnesSuccessfullyWithKFlipsAllowed(){
        int result = underTest.countConsecutiveOnesWithKFlips(new int[]{1, 1, 0, 0, 1, 1, 1, 1, 1}, 2);
        assertThat(result).isEqualTo(9);
        int result2 = underTest.countConsecutiveOnesWithKFlips(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1}, 2);
        assertThat(result2).isEqualTo(5);
        int result3 = underTest.countConsecutiveOnesWithKFlips(new int[]{1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1}, 2);
        assertThat(result3).isEqualTo(6);
        int result4 = underTest.countConsecutiveOnesWithKFlips(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1}, 3);
        assertThat(result4).isEqualTo(9);
    }

}