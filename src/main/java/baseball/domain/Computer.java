package baseball.domain;

import baseball.util.RandomNumberGenerator;

import static baseball.util.RandomNumberGenerator.*;
import static baseball.util.RandomNumberGenerator.generateNumbers;

public class Computer {

    private Balls balls;

    public Computer() {
        this.balls = new Balls(generateNumbers());
    }

    public Balls getBalls() {
        return balls;
    }
}
