package baseball;

import java.util.HashSet;
import java.util.List;

public class Validation {

    public static boolean isLengthThree(List<String> numbers) {
        return numbers.size() == 3;
    }

    public static boolean isDuplicated(final List<String> numbers) {
        return new HashSet<>(numbers).size() == 3;
    }
}
