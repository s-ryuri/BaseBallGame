package baseball;

import java.util.HashSet;
import java.util.List;

public class Validation {

    public static boolean isNotLengthThree(String numbers) {
        return numbers.length() == 3;
    }

    public static boolean isDuplicated(final List<String> numbers) {
        return new HashSet<>(numbers).size() != 3;
    }
}
