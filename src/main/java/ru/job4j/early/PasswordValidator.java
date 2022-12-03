package ru.job4j.early;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;

public class PasswordValidator {
    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        if (password.equals(password.toLowerCase())) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (password.equals(password.toUpperCase())) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        int countFigure = 0;
        int countSpecialSymbol = 0;
        char[] array = password.toCharArray();
        for (char ar : array) {
            if (isDigit(ar)) {
                countFigure++;
            }
            if (!isDigit(ar) && !isLetter(ar)) {
                countSpecialSymbol++;
            }
            if (countFigure > 0 && countSpecialSymbol > 0) {
                break;
            }
        }
        if (countFigure == 0) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (countSpecialSymbol == 0) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        String[] pass = new String[]{"qwerty", "12345", "password", "admin", "user"};
        for (String str : pass) {
            int index = password.toLowerCase().indexOf(str);
            if (index != -1) {
                throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
            }
        }
        return password;
    }
}
