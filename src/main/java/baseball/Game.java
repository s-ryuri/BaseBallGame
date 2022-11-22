package baseball;

import java.util.List;
import java.util.Scanner;

public class Game {

    private User user;
    private Referee referee;
    private RandomNumber randomNumber;

    private Scanner scanner;

    public Game() {
        this.user = new User();
        this.referee = new Referee();
        this.randomNumber = new RandomNumber();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("숫자를 입력해주세요");
            final List<String> randomNumber = this.randomNumber.generateNumber();

            while (true) {
                final List<String> userNumbers = user.inputNumbers();
                final int strike = referee.getStrike(randomNumber, userNumbers);
                final int ball = referee.getBall(randomNumber, userNumbers);

                if (strike == 3) {
                    System.out.println("정답을 맞췄습니다!");
                    System.out.println("게임을 계속할꺼면 1, 아니면 2를 입력해주세요");

                    final int num = scanner.nextInt();
                    if (num == 1) {
                        break;
                    }
                    return;
                }

                System.out.println(ball + " 볼" + strike + " 스트라이크");
            }
        }
    }
}
