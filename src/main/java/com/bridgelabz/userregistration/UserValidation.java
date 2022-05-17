package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-z]+[_+-.]?[0-9a-z]+?[@][0-9a-z]+[.][a-z]+([.][a-z]+)?[,]?";
    private static final String MOBILE_NUMBER_PATTERN = "^[0-9]{2}\s[789][0-9]{9}";
    private static final String PASSWORD_PATTERN = "^\\w(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%&!]).{8,}$";
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

    public boolean validateEmail(String eMail) {
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(eMail);
        return matcher.matches();
    }

    public boolean validateMobileNumber(String mobNumber) {
        pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
        matcher = pattern.matcher(mobNumber);
        return matcher.matches();
    }

    public boolean validatePassword(String password) {
        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
