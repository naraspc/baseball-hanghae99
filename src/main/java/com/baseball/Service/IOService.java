package com.baseball.Service;

import com.baseball.View.InputView;
import com.baseball.View.OutputView;

public class IOService {
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();
    String playerNum = "";

    public String findPlayerNumber(int n) {
        try {
            outputView.GameStart();
            System.out.print(n);
            outputView.tryCount();
            playerNum = inputView.getPlayerNumber();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("잘못된 입력으로 게임을 종료합니다");
            System.exit(0);
        }
        return playerNum;
    }

    public void displayResult(int ball, int strike) {
        outputView.displayResult(ball, strike);
    }

    public void endCount(int count) {
        outputView.gameCount(count);
    }
}
