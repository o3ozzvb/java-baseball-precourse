package baseball.domain;

import baseball.constant.Message;

import java.util.*;

public class Balls {
    private final List<Ball> balls;
    private final int BALL_COUNT = 3;

    public Balls(List<Integer> numbers) {
        chkValidation(numbers);
        this.balls = createBalls(numbers);
    }

    public List<Ball> getBalls() {
        return balls;
    }

    private void chkValidation(List<Integer> numbers) {
        if (chkNumCount(numbers)) {
            throw new IllegalStateException(Message.EXP_NUM_LENGTH);
        }

        if (chkDuplicate(numbers)) {
            throw new IllegalStateException(Message.EXP_DUPLICATE);
        }
    }

    public List<Ball> createBalls(List<Integer> numbers) {
        List<Ball> ballList = new ArrayList<>();
        for (int i = 0; i < BALL_COUNT; i++) {
            ballList.add(new Ball(i, numbers.get(i)));
        }
        return ballList;
    }

    public boolean chkDuplicate(List<Integer> numbers) {
        Set<Integer> numberSet = new HashSet<>(numbers);
        return numberSet.size() != BALL_COUNT;
    }

    public boolean chkNumCount(List<Integer> numbers) {
        return numbers.size() != BALL_COUNT;
    }

    public BallStatus compareBall(Ball ball) {
        if(this.balls.stream()
                .anyMatch(b -> b.getPosition() == ball.getPosition() && b.getNumber() == ball.getNumber())) {
            return BallStatus.STRIKE;
        }
        if(this.balls.stream()
                .anyMatch(b -> b.getNumber() == ball.getNumber())) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }
}
