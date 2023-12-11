package com.baseball.Controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumControllerTest {
    NumController numController = new NumController();
    List<Integer> numbers = numController.getNum();
    @Test
    @DisplayName("난수 길이 테스트 ")
    void checkLength() {

        for (int i = 0; i < 100; i++) {
            assertEquals(3, numbers.size());
        }

    }

    @Test
    @DisplayName("난수 범위 테스트")
    void checkRange() {
        for (Integer num : numbers) {
            assertTrue(num >= 0 && num < 10 , "Invalid number");
        }
    }
    @Test
    @DisplayName("난수 중복 확인")
    void checkDuplicate() {
        assertEquals(3, numbers.stream().distinct().count(), "중복이 존재하지 않습니다.");
    }
}