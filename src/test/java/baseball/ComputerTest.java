package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

public class ComputerTest {

    @Test
    void 컴퓨터는_세자리_숫자를_만든다() {
        Computer computer = new Computer();

        List<String> randomNumbers = computer.generateRandomNumber();

        Assertions.assertThat(randomNumbers.size()).isEqualTo(3);
    }

    @RepeatedTest(10)
    void 컴퓨터는_중복되지않는_세자리_숫자를_만든다() {
        Computer computer = new Computer();
        List<String> randomNumbers = computer.generateRandomNumber();

        final HashSet<String> duplicatedNumbers = new HashSet<>(randomNumbers);

        Assertions.assertThat(duplicatedNumbers.size()).isEqualTo(3);
    }
}
