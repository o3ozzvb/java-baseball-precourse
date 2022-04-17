package view;

import baseball.constant.Message;
import baseball.util.Validation;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String inputNumber() {
        System.out.println(Message.MSG_INPUT_NUMBER);

        return Console.readLine();
    }

    public static String inputContinue() {
        System.out.println(Message.MSG_INPUT_CONTINUE);
        String input = Console.readLine();

        Validation.chkIsOneOrTwo(input);
        return input;
    }

}
