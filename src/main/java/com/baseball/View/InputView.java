package com.baseball.View;

import java.util.Scanner;

public class InputView {
    String playerPickNum;

    private void setPlayerNumber() {
        Scanner sc = new Scanner(System.in);
        this.playerPickNum = sc.nextLine();
    }

    public String getPlayerNumber() {
        setPlayerNumber();
        return playerPickNum;
    }
}
