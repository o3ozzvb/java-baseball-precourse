package view;

import baseball.constant.Message;

public class OutputView {

    public static void showResult(String result) {
        System.out.println(result);
    }

    public static void showGameEnd() {
        System.out.println(Message.MSG_GAME_END);
    }

    //테스트용 함수
    public static void showComputerBalls(String computer) {
        System.out.println(computer);
    }

}
