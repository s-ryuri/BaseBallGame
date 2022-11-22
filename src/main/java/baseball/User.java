package baseball;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class User {

    private Scanner scanner;

    public User() {
        scanner = new Scanner(System.in);
    }

    public boolean isNotLengthThree(final String input) {
        return input.length() != 3;
    }

    public boolean isDuplicate(final String input) {
        List<String> numbers = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            numbers.add(String.valueOf(input.charAt(i)));
        }

        return new HashSet<>(numbers).size() != 3;
    }

    public boolean hasZero(final String input) {
        return input.contains("0");
    }

    public List<String> input() {
        String input;
        while (true) {
            input = scanner.nextLine();

            if (isNotLengthThree(input)) {
                System.out.println("세 자리 숫자를 입력해주세요");
                continue;
            }

            if (hasZero(input)) {
                System.out.println("0은 입력할 수 없습니다");
                continue;
            }

            if (isDuplicate(input)) {
                System.out.println("중복된 숫자를 입력했습니다");
                continue;
            }

            break;
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            result.add(String.valueOf(input.charAt(i)));
        }

        return result;
    }
}
