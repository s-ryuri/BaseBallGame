package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StrikeTest {

    private Strike strike;
    private static final List<String> RANDOM_NUMBERS = Arrays.asList("1", "2", "3");
    private static final List<String> USER_NUMBERS = Arrays.asList("1", "2", "3");

    @BeforeEach
    void setUp() {
        strike = new Strike();
    }

    @Test
    void 같은위치_같은숫자이면_스트라이크() {
        assertThat(strike.matchNumber(RANDOM_NUMBERS, 0, "1")).isTrue();
    }

    @Test
    void 스트라이크_개수_세기() {
        assertThat(strike.getStrikeCount(RANDOM_NUMBERS, USER_NUMBERS)).isEqualTo(3);
    }
}
