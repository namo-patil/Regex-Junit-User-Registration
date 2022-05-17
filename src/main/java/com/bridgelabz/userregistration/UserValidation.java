package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-z]+[_+-.]?[0-9a-z]+?[@][0-9a-z]+[.][a-z]+([.][a-z]+)?[,]?";
    Pattern pattern;
    Matcher matcher;

    public boolean validateFirstName(String firstName) {
        pattern = Pattern.compile(NAME_PATTERN);
        matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public boolean validateLastName(String lastName) {
        pattern = Pattern.compile(NAME_PATTERN);
        matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    public boolean validateEmail(String email) {
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
