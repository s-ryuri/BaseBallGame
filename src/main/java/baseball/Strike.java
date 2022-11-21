package baseball;

import java.util.List;

public class Strike {
    public boolean matchNumber(final List<String> randomNumbers, final int index, final String number) {
        return randomNumbers.get(index).equals(number);
    }

    public int getStrikeCount(final List<String> randomNumbers, final List<String> userNumbers) {
        int count = 0;
        for(int i = 0;i<randomNumbers.size();i++) {
            if(matchNumber(randomNumbers,i, userNumbers.get(i))){
                count++;
            }
        }
        return count;
    }
}
