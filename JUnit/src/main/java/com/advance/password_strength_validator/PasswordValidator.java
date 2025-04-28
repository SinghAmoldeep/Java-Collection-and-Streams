package com.advance.password_strength_validator;

import java.util.regex.Pattern;

public class PasswordValidator {
    public static boolean validate(String password) {
        String regex = "^(?=.*[A-Z])(?=.*\\d).{8,}$";
        Pattern pattern = Pattern.compile(regex);

        return pattern.matcher(password).matches();
    }
}
