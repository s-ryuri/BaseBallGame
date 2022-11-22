package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RefereeTest {

    private static final List<String> RANDOM_NUMBERS = Arrays.asList("1","2","3");
    private static final List<String> USER_NUMBERS = Arrays.asList("1","2","3");
    private Referee referee;

    @BeforeEach
    void setUp() {
        referee = new Referee();
    }

    @Test
    void 같은자리_같은숫자_인지확인_STRIKE() {
        assertThat(referee.hasSameNumber(RANDOM_NUMBERS, 0, "1")).isTrue();
    }

    @Test
    void STRIKE_개수_세기() {
        assertThat(referee.getStrike(RANDOM_NUMBERS,USER_NUMBERS)).isEqualTo(3);
    }

    @Test
    void 같은_숫자_개수_세기() {
        assertThat(referee.totalSameNumber(RANDOM_NUMBERS,USER_NUMBERS)).isEqualTo(3);
    }

    @Test
    void 볼_개수_세기() {
        List<String> userNumbers = Arrays.asList("3","2","1");
        assertThat(referee.getBall(RANDOM_NUMBERS,userNumbers)).isEqualTo(2);
    }

}
