package baseball.util;

import baseball.constant.Message;

public class Validation {

    public static void chkIsOneOrTwo(String input) {
        if(!(input.equals("1") || input.equals("2"))) {
            throw new IllegalArgumentException(Message.EXP_ONE_OR_TWO);
        }
    }
}
