package baseball;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomNumberTest {

    @Test
    void 중복되지않는_숫자_3개를_만든다() {
        final RandomNumber randomNumber = new RandomNumber();
        final List<String> lottoNumbers = randomNumber.makeNumbers();

        assertThat(lottoNumbers.size()).isEqualTo(3);
    }

}
