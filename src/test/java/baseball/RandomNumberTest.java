package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomNumberTest {

    private RandomNumber randomNumber;
    private List<String> randomNumbers;

    @BeforeEach
    void setUp() {
        randomNumber = new RandomNumber();
        randomNumbers = randomNumber.generateNumber();
    }

    @Test
    void 숫자_3개를_가진다() {
        assertThat(randomNumbers.size()).isEqualTo(3);
    }

    @Test
    void 숫자의_범위는_1부터_9까지이다() {
        final List<Integer> collect = randomNumbers.stream()
                                                   .map(Integer::parseInt)
                                                   .toList();
        assertThat(collect.stream().allMatch(number -> number >= 1 && number <= 9)).isTrue();
    }

    @Test
    void 중복된_숫자가_없다() {
        final Set<Integer> integers = randomNumbers.stream()
                                                   .map(Integer::parseInt)
                                                   .collect(Collectors.toSet());

        assertThat(integers.size()).isEqualTo(3);
    }
}
