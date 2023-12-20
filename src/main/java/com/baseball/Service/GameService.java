package com.baseball.Service;
import java.util.ArrayList;
import java.util.List;

public class GameService {
    public List<Integer> findResult(List<Integer> randomNum, int[] playerNum) {
        int ball = findBall(randomNum, playerNum);
        int strike = findStrike(randomNum, playerNum);

        List<Integer> result = new ArrayList<>();
        result.add(ball);
        result.add(strike);

        return result;
    }

    private int findBall(List<Integer> randomNum, int[] playerNum) { // 객체를 넣어 보기 // 일급 컬렉션
        int ball = 0;

        for (int i = 0; i < randomNum.size(); i++) {
            for (int j = 0; j < playerNum.length; j++) {
                if (randomNum.get(i) == playerNum[j] && i != j) {
                    ball++;
                }
            }
        }
        return ball;
    }

    private int findStrike(List<Integer> randomNum, int[] playerNum) {
        int strike = 0;

        for (int i = 0; i < randomNum.size(); i++) {
            for (int j = 0; j < playerNum.length; j++) {
                if (randomNum.get(i) == playerNum[j] && i == j) {
                    strike++;
                }
            }
        }
        return strike;
    }
}
