package baseball;

import java.util.List;

public class Ball {

    private List<String> computerNumbers;
    private List<String> userNumbers;

    private Strike strike;
    public Ball(final List<String> computerNumbers, final List<String> userNumbers) {
        this.computerNumbers = computerNumbers;
        this.userNumbers = userNumbers;
        this.strike = new Strike(computerNumbers,userNumbers);
    }

    public int getSameNumberCounts() {
        int sameNumbers = 0;

        for(String userNumber : this.userNumbers) {
            sameNumbers += getSameNumbers(userNumber);
        }

        return sameNumbers;
    }

    private int getSameNumbers(final String userNumber) {
        int result = 0;

        if(this.computerNumbers.contains(userNumber)) {
            result++;
        }

        return result;
    }

    public int getBallCount() {
        return this.getSameNumberCounts() - strike.getStrike();
    }
}
