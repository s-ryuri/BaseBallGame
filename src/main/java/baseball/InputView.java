package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private final Scanner scanner;

    public InputView() {
        this.scanner = new Scanner(System.in);
    }

    public List<String> makeNumber() {

        List<String> numbers;

        while (true) {
            final String number = scanner.nextLine();
            numbers = new ArrayList<>();

            for(int i = 0;i<3;i++){
                numbers.add(String.valueOf(number.charAt(i)));
            }

            if(Validation.isLengthThree(numbers)) {
                System.out.println("3자리 숫자를 입력해주세요!");
                continue;
            }

            if(Validation.isDuplicated(numbers)) {
                System.out.println("중복된 숫자가 있습니다");
                continue;
            }

            break;
        }


        return numbers;
    }
}
