package com.baseball.Service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateServiceTest {
    @Test
    @DisplayName("유효값 검증")
    public void testValidateValidInput() {
        ValidateService.validate("123"); // 예외가 발생하지 않아야 함
    }

    @Test
    @DisplayName("중복값 검증")
    public void testValidateInvalidDuplicateInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            ValidateService.validate("122");
        });
    }

    @Test
    @DisplayName("숫자가 아닌 값 검증")
    public void testValidateInvalidNonNumericInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            ValidateService.validate("1a2");
        });
    }
    @Test
    @DisplayName("3글자 이상 혹은 이하 출력")
    public void testLength() {
        assertThrows(IllegalArgumentException.class, () -> {
            ValidateService.validate("12");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            ValidateService.validate("12345");
        });

    }
}