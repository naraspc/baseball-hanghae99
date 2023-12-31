package com.baseball.Service;

public class ValidateService {
    public static void validate(String playerNumber) {
        if (hasDuplicate(playerNumber)) {
            throw new IllegalArgumentException("잘못된 입력입니다. 중복된 값이 있습니다. ");
        }

        if (!isNumeric(playerNumber)) {
            throw new IllegalArgumentException("잘못된 입력입니다. 숫자가 아닌 값이 있습니다.");
        }
        if (playerNumber.length() != 3) {
            throw new IllegalArgumentException("잘못된 입력입니다. 입력된 숫자가 많거나 적습니다.");
        }
    } // 커스텀 익셉션을 만들어서 던져주고 OutputView에서 파싱해서 보여주기

    private static boolean hasDuplicate(String playerNumber) {
        for (int i = 0; i < playerNumber.length(); i++) {
            for (int j = i + 1; j < playerNumber.length(); j++) {
                if (playerNumber.charAt(i) == playerNumber.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isNumeric(String str) {
        // 정규표현식을 사용하여 문자열이 숫자로만 구성되어 있는지 확인
        return str.matches("\\d+");
    }
}

