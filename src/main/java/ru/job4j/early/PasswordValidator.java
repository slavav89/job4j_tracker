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
        int count1 = 0;
        int count2 = 0;
        char[] array = password.toCharArray();
        for (char ar : array) {
            if (isDigit(ar)) {
                count1++;
            }
            if (isDigit(ar) || isLetter(ar)) {
                count2++;
            }
        }
        if (count1 == 0) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (count2 == password.length()) {
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
