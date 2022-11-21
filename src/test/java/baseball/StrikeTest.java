package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StrikeTest {

    public static final List<String> COMPUTERS_NUMBERS = Arrays.asList("1", "2", "3");
    public static final List<String> USER_NUMBERS = Arrays.asList("1", "2", "3");

    private Strike strike;

    @BeforeEach
    void setUp() {
        strike = new Strike(COMPUTERS_NUMBERS, USER_NUMBERS);
    }

    @Test
    void 스트라이크_개수를_확인() {
        assertThat(strike.getStrike()).isEqualTo(3);
    }

}
