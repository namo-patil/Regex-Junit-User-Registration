package com.bridgelabz.emailaddressvalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleEmailAddressValidator {
    private static final String EMAIL_PATTERN = "^[a-z]+[_+-.]?[0-9a-z]+?[@][0-9a-z]+[.][a-z]{2,}([.][a-z])?[,]?";

    public boolean validateEmail(String eMail) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(eMail);
        return matcher.matches();
    }
}
