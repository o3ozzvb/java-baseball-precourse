package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BallsTest {

    @Test
    @DisplayName("테스트 1 - 스트라이크")
    void compareBall_Strike() {
        List<Integer> ballList = new ArrayList<>();
        ballList.add(1);
        ballList.add(4);
        ballList.add(6);

        Balls balls = new Balls(ballList);
        Ball ball = new Ball(0, 1);
        assertThat(balls.compareBall(ball)).isEqualTo(BallStatus.STRIKE);

    }

    @Test
    @DisplayName("테스트 2 - 볼")
    void compareBall_Ball() {
        List<Integer> ballList = new ArrayList<>();
        ballList.add(1);
        ballList.add(4);
        ballList.add(6);

        Balls balls = new Balls(ballList);
        Ball ball = new Ball(1, 1);
        assertThat(balls.compareBall(ball)).isEqualTo(BallStatus.BALL);

    }

    @Test
    @DisplayName("테스트 3 - 낫")
    void compareBall_Nothing() {
        List<Integer> ballList = new ArrayList<>();
        ballList.add(1);
        ballList.add(4);
        ballList.add(6);

        Balls balls = new Balls(ballList);
        Ball ball = new Ball(0, 9);
        assertThat(balls.compareBall(ball)).isEqualTo(BallStatus.NOTHING);

    }
}