package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    @Test
    void 같은_숫자의_총_갯수_확인() {
        final List<String> computerNumbers = Arrays.asList("1", "3", "2");
        final List<String> userNumbers = Arrays.asList("1", "2", "3");
        final Ball ball = new Ball(computerNumbers, userNumbers);

        assertThat(ball.getSameNumberCounts()).isEqualTo(3);
    }

    @Test
    void 볼_갯수_구하기() {
        final List<String> computerNumbers = Arrays.asList("1", "2", "3");
        final List<String> userNumbers = Arrays.asList("1", "3", "2");
        final Ball ball = new Ball(computerNumbers, userNumbers);

        assertThat(ball.getBallCount()).isEqualTo(2);
    }
}
