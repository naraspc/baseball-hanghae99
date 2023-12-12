package com.baseball.View;

import java.util.Scanner;

public class InputView {


    public String getPlayerNumber() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
