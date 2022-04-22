package slidingwindow;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class CountDistinctElementsInSubArrayOfSizeKTest {



    @Test
    @DisplayName("CountDistinctElementsInSubArray")
    void shouldCountDistinctElementsInSubArraySuccessfully() {
        CountDistinctElementsInSubArrayOfSizeK elements = new CountDistinctElementsInSubArrayOfSizeK();
        List<Integer> list = elements.countDistinctElementsInSubArray(new int[]{1, 5, 9, 3, 3, 7, 3}, 3);

        assertThat(list.size()).isEqualTo(5);
        assertThat(list.get(0)).isEqualTo(3);
        assertThat(list.get(4)).isEqualTo(2);

        List<Integer> secondList = elements.countDistinctElementsInSubArray(new int[]{1, 4, 7, 7}, 2);

        assertThat(secondList.size()).isEqualTo(3);
        assertThat(secondList.get(0)).isEqualTo(2);
        assertThat(secondList.get(2)).isEqualTo(1);

    }
}