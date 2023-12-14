package com.baseball.View;

public class OutputView {
    private static final String GAME_START = "컴퓨터가 숫자를 생성하였습니다. 답을 맞춰보세요!";
    private static final String GAME_TRY_COUNT = "번째 시도 : ";
    private static final String GAME_END = "게임을 종료합니다.";
    private static final String GAME_END_TRY = "번만에 맞히셧습니다.";


    public void GameStart() {
        System.out.println(GAME_START);
    }

    public void GameEnd() {
        System.out.println(GAME_END);
    }

    public void gameCount(int n) {

        System.out.println(n+GAME_END_TRY);
    }

    public void tryCount() {
        System.out.println(GAME_TRY_COUNT);
    }

    public void displayResult(int ball, int strike) {
        if (ball == 0&& strike > 0) {
            System.out.println(strike+"S");
        } else if (ball > 0 && strike ==0) {
            System.out.println(ball+"B");
        } else
        System.out.println(ball+"B"+strike+"S");
    }
}
