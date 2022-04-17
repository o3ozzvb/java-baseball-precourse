package baseball.domain;

public class Game {
    int strike;
    int ball;

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public void playGame(Balls computer, Balls player) {
//        Balls computerBalls = computer.getBalls();
//        Balls playerBalls = player.getBalls();

        for(Ball b : player.getBalls()) {
            getCompareResult(computer, b);
        }
    }

    private void getCompareResult(Balls computerBalls, Ball b) {
        if(computerBalls.compareBall(b) == BallStatus.STRIKE) {
            this.strike++;
        }
        if(computerBalls.compareBall(b) == BallStatus.BALL) {
            this.ball++;
        }
    }
}
