package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import sun.net.www.content.text.plain;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @DisplayName("입력한 숫자는 3자리이다 - 3자리 아닐 경우")
    @ParameterizedTest
    @ValueSource(strings = {"1", "1234", "78"})
    public void playerNum_Test1(String inputNumbers) {
        assertThatThrownBy(() -> Player.createPlayer(inputNumbers))
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("3자리 숫자여야 합니다.");
    }

    @DisplayName("입력한 숫자는 중복이 없어야 한다 ")
    @ParameterizedTest
    @ValueSource(strings = {"122", "433", "788"})
    public void playerNum_Test2(String inputNumbers) {
        assertThatThrownBy(() -> Player.createPlayer(inputNumbers))
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("중복이 존재하지 않아야 합니다.");
    }

    @DisplayName("입력한 숫자는 1~9 사이의 숫자여야 한다 ")
    @ParameterizedTest
    @ValueSource(strings = {"019", "!@#", "st1", "a13", "tst"})
    public void playerNum_Test3(String inputNumbers) {
        assertThatThrownBy(() -> Player.createPlayer(inputNumbers))
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("1~9 사이의 숫자를 입력해야 합니다");
    }

    @DisplayName("입력한 숫자는 3자리이고, 중복이 없는 1~9 사이의 숫자이다 ")
    @ParameterizedTest
    @ValueSource(strings = {"123", "125", "789", "196"})
    public void playerNum_Test4(String inputNumbers) {
        assertDoesNotThrow(() -> Player.createPlayer(inputNumbers));
    }
}