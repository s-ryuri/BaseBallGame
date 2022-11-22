package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class UserTest {

    private User user;

    @BeforeEach
    void setUp() {
        user = new User();
    }

    @Test
    void 세자리_숫자를_입력_받는다() {
        String input = "123";

        assertThat(user.isNotLengthThree(input)).isEqualTo(false);
    }

    @Test
    void 세자리_숫자가_아닌걸_입력_받는다() {
        String input = "13";

        assertThat(user.isNotLengthThree(input)).isEqualTo(true);
    }

    @Test
    void 중복된_숫자가_없어야된다() {
        String input = "133";

        assertThat(user.isDuplicate(input)).isEqualTo(true);
    }

    @Test
    void 숫자에_0이_포함되어있지않다() {
        String input = "012";

        assertThat(user.hasZero(input)).isEqualTo(true);
    }

}
