package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationTest {

    List<String> numbers = new ArrayList<>();

    @BeforeEach
    void setUp() {
        numbers = Arrays.asList("1","2","3");
    }

    @Test
    void 숫자가_3자리_인지를_확인한다() {
        assertThat(Validation.isLengthThree(numbers)).isTrue();
    }

    @Test
    void 중복된_숫자가_없는지_확인() {
        assertThat(Validation.isDuplicated(numbers)).isTrue();
    }

    @Test
    void 중복된_숫자가_있는_경우() {
        List<String> duplicatedNumber = Arrays.asList("1","1","1");
        assertThat(Validation.isDuplicated(duplicatedNumber)).isFalse();
    }
}
