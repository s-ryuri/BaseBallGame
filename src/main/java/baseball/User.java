package baseball;

import java.util.List;

public class User {

    private Input input;

    public User() {
        this.input = new Input();
    }

    public List<String> inputNumbers() {
        return input.input();
    }

}
