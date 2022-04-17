package baseball.service;

import baseball.domain.Computer;
import baseball.domain.Game;
import baseball.domain.Player;
import view.InputView;
import view.OutputView;

public class BaseBallGameService {
    private final int GAME_START = 1;
    private final int GAME_STOP = 2;


    public void play() {
        Game game;
        Computer computer = new Computer();
        Player player;
        do {
            game = new Game();
            //OutputView.showComputerBalls(computer.getComputerNumber());
            String inputNumbers = InputView.inputNumber();
            player = Player.createPlayer(inputNumbers);

            game.playGame(computer.getBalls(), player.getBalls());
            OutputView.showResult(game.getResult());

            if(game.isGameEnd()) {
                OutputView.showGameEnd();
            }
        } while(!game.isGameEnd());
    }

    public boolean isContinue() {
        String inputValue = InputView.inputContinue();
        return inputValue.equals("1");
    }
}
