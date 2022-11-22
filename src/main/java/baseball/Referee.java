package baseball;

import java.util.List;

public class Referee {
    public boolean hasSameNumber(List<String> randomNumbers, final int index, final String userNumber) {
        return randomNumbers.get(index).equals(userNumber);
    }

    public int getStrike(final List<String> randomNumbers, final List<String> userNumbers) {
        int strike = 0;
        for (int i = 0; i < userNumbers.size(); i++) {
            if (hasSameNumber(randomNumbers, i, userNumbers.get(i))) {
                strike++;
            }
        }

        return strike;
    }

    public int totalSameNumber(final List<String> randomNumbers, final List<String> userNumbers) {
        int sameNumber = 0;
        for (int i = 0; i < userNumbers.size(); i++) {
            if (randomNumbers.contains(userNumbers.get(i))) {
                sameNumber++;
            }
        }

        return sameNumber;
    }

    public int getBall(final List<String> randomNumbers, final List<String> userNumbers) {
        return this.totalSameNumber(randomNumbers, userNumbers) - this.getStrike(randomNumbers, userNumbers);
    }
}
