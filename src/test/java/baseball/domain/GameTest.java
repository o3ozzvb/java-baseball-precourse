package baseball.domain;

import baseball.constant.Message;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class GameTest {

    @Test
    @DisplayName("게임 결과 테스트 - 1 스트라이크 1 볼")
    public void gameResultTest1() {
        Game game = new Game();

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(2, 4, 3);

        Balls computer = new Balls(list1);
        Balls player = new Balls(list2);

        game.playGame(computer, player);

        assertThat(game.getResult()).isEqualTo("1스트라이크 1볼 ");
    }

    @Test
    @DisplayName("게임 결과 테스트 - 낫씽")
    public void gameResultTest2() {
        Game game = new Game();

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(7, 4, 6);

        Balls computer = new Balls(list1);
        Balls player = new Balls(list2);

        game.playGame(computer, player);

        assertThat(game.getResult()).isEqualTo(Message.STATUS_NOTHING);
    }
}