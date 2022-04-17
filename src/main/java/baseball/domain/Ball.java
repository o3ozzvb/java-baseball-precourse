package baseball.domain;

public class Ball {

    private int position;
    private int number;

    public Ball(int position, int number) {
        this.position = position;
        this.number = number;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    /*public BallStatus compareBall(Ball ball) {
        if(ball.position == this.position && ball.number == this.number) {
            return BallStatus.STRIKE;
        }
        if(ball.number == this.number) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }*/

}
