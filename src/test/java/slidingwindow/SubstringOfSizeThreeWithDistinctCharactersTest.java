package slidingwindow;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SubstringOfSizeThreeWithDistinctCharactersTest {

    @Test
    void canCountGoodSubstringsOfLengthThreeSuccessfully() {
        SubstringOfSizeThreeWithDistinctCharacters distinctCharacters = new SubstringOfSizeThreeWithDistinctCharacters();
        int result1 = distinctCharacters.countGoodSubstrings("xyzzaz");
        assertThat(result1).isEqualTo(1);
        int result2 = distinctCharacters.countGoodSubstrings("aababcabc");
        assertThat(result2).isEqualTo(4);
        int result3 = distinctCharacters.countGoodSubstrings("owuxoelszb");
        assertThat(result3).isEqualTo(8);
    }
}