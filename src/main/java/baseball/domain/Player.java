package baseball.domain;

import baseball.constant.Message;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private Balls balls;

    private Player(){

    }

    public Balls getBalls() {
        return balls;
    }

    public static Player createPlayer(String inputNumbers){
        Player player = new Player();

        chkIsDigit(inputNumbers);

        List<Integer> numberList = createNumberList(inputNumbers);
        player.balls = new Balls(numberList);

        return player;
    }

    private static List<Integer> createNumberList(String inputNumbers) {
        List<Integer> numberList = new ArrayList<>();
        for(char c : inputNumbers.toCharArray()) {
            numberList.add(Character.getNumericValue(c));
        }
        return numberList;
    }

    public static void chkIsDigit(String inputNumbers) {
        final String REGEX = "[1-9]+";
        if(!inputNumbers.matches(REGEX)) {
            throw new IllegalStateException(Message.EXP_BETWEEN_ONE_AND_NINE);
        }
    }

}
