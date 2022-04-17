package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class Player {

    Balls balls;

    private Player(){

    };

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
        try {
            Integer.parseInt(inputNumbers);
        } catch (Exception e) {
            throw new IllegalStateException("1~9 사이의 숫자를 입력해야 합니다");
        }
    }
}
