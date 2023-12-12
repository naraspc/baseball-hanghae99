package com.baseball.Service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameServiceTest {
    @Test
    @DisplayName("볼, 스트라이크 찾기")
    public void testFindResult() {
        GameService gameService = new GameService();

        List<Integer> randomNum = Arrays.asList(1, 2, 3);
        int[] playerNum = {2, 1, 3};

        List<Integer> result = gameService.findResult(randomNum, playerNum);

        assertEquals(2, result.get(0)); // 예상되는 볼의 개수
        assertEquals(1, result.get(1)); // 예상되는 스트라이크의 개수
    }


}