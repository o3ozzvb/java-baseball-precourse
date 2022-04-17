package baseball.domain;

import baseball.constant.Message;

public class Game {
    int strike;
    int ball;

    public void playGame(Balls computer, Balls player) {
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

    public String getResult() {
        String result = "";
        if(this.ball > 0) {
            result += ball + Message.STATUS_BALL;
        }
        if(this.strike > 0) {
            result += strike + Message.STATUS_STRIKE;
        }
        if(this.strike == 0 && this.ball == 0) {
            result = Message.STATUS_NOTHING;
        }
        return result;
    }

    public boolean isGameEnd() {
        return this.strike == 3;
    }
}
