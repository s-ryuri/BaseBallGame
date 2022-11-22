package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;

public class InputTest {

    private Input input;

    @BeforeEach
    void setUp() {
        input = new Input();
    }

    @Test
    void 세자리_숫자를_입력_받는다() {
        String inputNumber = "123";

        assertThat(input.isNotLengthThree(inputNumber)).isEqualTo(false);
    }

    @Test
    void 세자리_숫자가_아닌걸_입력_받는다() {
        String inputNumber = "13";

        assertThat(input.isNotLengthThree(inputNumber)).isEqualTo(true);
    }

    @Test
    void 중복된_숫자가_없어야된다() {
        String inputNumber = "133";

        assertThat(input.isDuplicate(inputNumber)).isEqualTo(true);
    }

    @Test
    void 숫자에_0이_포함되어있지않다() {
        String inputNumber = "012";

        assertThat(input.hasZero(inputNumber)).isEqualTo(true);
    }
}
