package baseball.domain;


import java.util.List;

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

    /*public String getComputerNumber() {
        List<Ball> ballList = balls.getBalls();
        String computer = "";

        for(Ball b : ballList) {
            computer += b.getNumber();
        }
        return computer;
    }*/
}
