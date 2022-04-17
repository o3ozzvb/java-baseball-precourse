package baseball.domain;

import baseball.util.RandomNumberGenerator;

import java.util.*;

public class Balls {
    private final List<Ball> balls;
    private final int BALL_COUNT = 3;

    public Balls(List<Integer> numbers) {
        chkValidation(numbers);
        this.balls = createBalls(numbers);
    }

    private void chkValidation(List<Integer> numbers) {
        if (chkDuplicate(numbers)) {
            throw new IllegalStateException("중복이 존재하지 않아야 합니다.");
        }

        if(chkNumCount(numbers)) {
            throw new IllegalStateException("3자리 숫자여야 합니다.");
        }
    }

    public List<Ball> createBalls(List<Integer> numbers) {
        List<Ball> ballList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ballList.add(new Ball(i, numbers.get(i)));
        }
        return ballList;
    }

    public boolean chkDuplicate(List<Integer> numbers) {
        Set<Integer> numberSet = new HashSet<>(numbers);
        if(numberSet.size() == BALL_COUNT) return true;

        return false;
    }

    public boolean chkNumCount(List<Integer> numbers) {
        if(numbers.size() == BALL_COUNT) return true;

        return false;
    }

}
