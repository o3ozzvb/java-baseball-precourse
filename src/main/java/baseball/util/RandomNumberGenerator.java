package baseball.util;

import java.util.ArrayList;
import java.util.List;
import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class RandomNumberGenerator {

    private static int MIN_NUMBER = 1;
    private static int MAX_NUMBER = 9;
    private static int NUMBER_COUNT = 3;

    public static List<Integer> generateNumbers() {
        List<Integer> numbers = new ArrayList<>();

        while(numbers.size() < NUMBER_COUNT) {
            addNonDupRandomNumber(numbers);
        }

        return numbers;
    }

    public static void addNonDupRandomNumber(List<Integer> numbers) {
        int randomNum = pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
        if (!numbers.contains(randomNum)) {
            numbers.add(randomNum);
        }
    }
}
