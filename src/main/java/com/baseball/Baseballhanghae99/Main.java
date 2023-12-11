package com.baseball.Baseballhanghae99;

import com.baseball.Service.PlayerService;

public class Main {
    public static void main(String[] args) {
        PlayerService playerService = new PlayerService();
        playerService.setPlayerNumber();
        playerService.getPlayerNumber();

    }
}
