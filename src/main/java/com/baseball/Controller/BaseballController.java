package com.baseball.Controller;


import com.baseball.Service.GameService;
import com.baseball.Service.IOService;
import com.baseball.Service.NumService;
import com.baseball.Service.PlayerService;

import java.util.List;

public class BaseballController {
    GameService gameService = new GameService();
    NumService numService = new NumService();
    PlayerService playerService = new PlayerService();
    IOService ioService = new IOService();

    public void baseballGame() {
            int n = 1;
            String playerNum = "";
            List<Integer> randomNum = numService.getNum();

            while (true) {
                playerNum = ioService.findPlayerNumber(n);

                List<Integer> result = gameService.findResult(randomNum, playerService.getPlayerNum(playerNum));
                ioService.displayResult(result.get(0), result.get(1));

                if (result.get(1) == 3) {
                    break;
                }
                n++;
            }
            ioService.endCount(n);
        }

    }


