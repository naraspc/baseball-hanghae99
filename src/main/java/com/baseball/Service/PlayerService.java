package com.baseball.Service;

import java.util.Scanner;

public class PlayerService {
    public int[] getPlayerNum(String playerNumber) {
        int[] playerNum = new int[3];
        try {

            ValidateService.validate(playerNumber);

            for (int z = 0; z < 3; z++) {
                playerNum[z] = playerNumber.charAt(z) - '0';
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return playerNum;
    }


}
