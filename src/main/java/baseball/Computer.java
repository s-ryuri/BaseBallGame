package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {
    public List<String> generateRandomNumber() {
        List<String> randoms = new ArrayList<>();

        while (true) {
            for(int i = 0;i<3;i++){
                final int randomNumber = new Random().nextInt(9) + 1;
                randoms.add(String.valueOf(randomNumber));
            }

            if(Validation.isDuplicated(randoms)){
                break;
            }

            randoms.clear();
        }


        return randoms;
    }
}
