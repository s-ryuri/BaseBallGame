package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StrikeTest {

    @Test
    void 같은위치_같은숫자이면_스트라이크() {
        List<String> randomNumbers = Arrays.asList("1","2","3");
        final Strike strike = new Strike();

        assertThat(strike.matchNumber(randomNumbers,0,"1")).isTrue();
    }

    @Test
    void 스트라이크_개수_세기() {
        List<String> randomNumbers = Arrays.asList("1","2","3");
        List<String> userNumbers = Arrays.asList("1","2","3");
        final Strike strike = new Strike();

        assertThat(strike.getStrikeCount(randomNumbers,userNumbers)).isEqualTo(3);
    }
}
