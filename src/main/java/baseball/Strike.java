package baseball;

import java.util.ArrayList;
import java.util.List;

public class Strike {

    private List<String> computerNumbers;
    private List<String> userNumbers;

    public Strike() {
        computerNumbers = new ArrayList<>();
        userNumbers = new ArrayList<>();
    }

    public Strike(final List<String> computers, final List<String> users) {
        this.computerNumbers = computers;
        this.userNumbers = users;
    }

    public int getStrike() {
        int strike = 0;

        for(int i = 0;i<userNumbers.size();i++){
            if(correctLocation(i, userNumbers.get(i))) {
                strike++;
            }
        }

        return strike;
    }

    private boolean correctLocation(final int index, final String number) {
        return computerNumbers.get(index).equals(number);
    }
}
