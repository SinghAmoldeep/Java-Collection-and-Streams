package com.advance.user_registration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean registerUser (String username, String email, String password) {
        String usernameR = "[A-Za-z0-9]+";
        String emailR = "^[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z0-9]{2,}$";
        String passwordR = "^(?=.*[A-Z])(?=.*\\d).{8,}$";

        Pattern userName= Pattern.compile(usernameR);
        Pattern userEmail= Pattern.compile(emailR);
        Pattern userPassword= Pattern.compile(passwordR);

        Matcher nameMatcher = userName.matcher(username);
        Matcher emailMatcher = userEmail.matcher(email);
        Matcher passwordMatcher = userPassword.matcher(password);

        if (nameMatcher.matches() && emailMatcher.matches() && passwordMatcher.matches()) {
            return true;
        }
        throw new IllegalArgumentException();
    }

}
