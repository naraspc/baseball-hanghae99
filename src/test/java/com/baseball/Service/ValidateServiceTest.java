package com.baseball.Service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateServiceTest {
    @Test
    public void testValidateValidInput() {
        // 유효한 입력에 대한 테스트
        ValidateService.validate("123"); // 예외가 발생하지 않아야 함
    }

    @Test
    public void testValidateInvalidDuplicateInput() {
        // 중복된 값이 있는 입력에 대한 테스트
        assertThrows(IllegalArgumentException.class, () -> {
            ValidateService.validate("122"); // 중복이 있으므로 예외가 발생해야 함
        });
    }

    @Test
    public void testValidateInvalidNonNumericInput() {
        // 숫자가 아닌 값이 있는 입력에 대한 테스트
        assertThrows(IllegalArgumentException.class, () -> {
            ValidateService.validate("1a2"); // 숫자가 아닌 값이 있으므로 예외가 발생해야 함
        });
    }
}