package baseball.domain;

import baseball.util.RandomNumberGenerator;

import static baseball.util.RandomNumberGenerator.*;
import static baseball.util.RandomNumberGenerator.generateNumbers;

public class Computer {

    Balls balls;

    public Computer() {
        this.balls = new Balls(generateNumbers());
    }

}
