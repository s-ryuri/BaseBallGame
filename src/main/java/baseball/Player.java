package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {

    private final Scanner scanner;

    public Player() {
        this.scanner = new Scanner(System.in);
    }

    public List<String> makeNumber() {

        List<String> numbers;
        System.out.println("숫자를 입력해주세요");
        while (true) {

            final String number = scanner.nextLine();

            if (Validation.isNotLengthThree(number)) {
                System.out.println("3자리 숫자를 입력해주세요!");
                continue;
            }

            numbers = new ArrayList<>();
            for (int i = 0; i < number.length(); i++) {
                numbers.add(String.valueOf(number.charAt(i)));
            }

            if (Validation.isDuplicated(numbers)) {
                System.out.println("중복된 숫자가 있습니다");
                continue;
            }

            break;
        }

        return numbers;
    }
}
