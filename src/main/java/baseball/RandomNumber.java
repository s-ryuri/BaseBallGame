package baseball;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomNumber {
    public List<String> makeNumbers() {
        return new Random()
            .ints(1,10)
            .boxed()
            .distinct()
            .limit(3)
            .map(String::valueOf)
            .collect(Collectors.toList());
    }
}
