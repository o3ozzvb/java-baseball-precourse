package baseball.util;

import baseball.constant.Message;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ValidationTest {

    @DisplayName("Continue Input Validation Test - 에러 인풋일 때 ")
    @ParameterizedTest
    @ValueSource(strings = {"10", "te"})
    public void continueInputValidationTest2(String input) {
        assertThatThrownBy(() -> Validation.chkIsOneOrTwo(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(Message.EXP_ONE_OR_TWO);
    }

}