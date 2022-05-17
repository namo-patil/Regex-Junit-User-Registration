package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
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
}
