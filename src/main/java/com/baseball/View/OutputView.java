package com.baseball.View;

public class OutputView {
    private static final String GAME_START = "컴퓨터가 숫자를 생성하였습니다. 답을 맞춰보세요!";
    private static final String GAME_END = "게임을 종료합니다.";
    private static final String GAME_END_TRY = "번만에 맞히셧습니다.";

    public static void  GameStart() {
        System.out.println(GAME_START);
    }
    public static void GameEnd() {
        System.out.println(GAME_END);
    }
    public static void gameCount() {
        System.out.println(GAME_END_TRY);
    }

}
