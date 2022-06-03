package com.bridgelabz.userregistration;

import javax.naming.NameNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-z]+[_+-.]?[0-9a-z]+?[@][0-9a-z]+[.][a-z]+([.][a-z]+)?[,]?";
    private static final String MOBILE_NUMBER_PATTERN = "^[0-9]{2}\s[789][0-9]{9}";
    private static final String PASSWORD_PATTERN = "^\\w(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%&!]).{8,}$";
    Pattern pattern;
    Matcher matcher;

    public boolean validateFirstName(String firstName) throws InvalidUserException {
        pattern = Pattern.compile(NAME_PATTERN);
        matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();
        try {
            if (result) {
                return true;
            } else {
                throw new InvalidUserException("Please Enter Valid First Name");
            }
        } catch (InvalidUserException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public boolean validateLastName(String lastName) throws InvalidUserException {
        pattern = Pattern.compile(NAME_PATTERN);
        matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();
        try {
            if (result) {
                return result;
            } else {
                throw new InvalidUserException("Please Enter Valid Last Name");
            }
        } catch (InvalidUserException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public boolean validateEmail(String eMail) throws InvalidUserException {
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(eMail);
        boolean result = matcher.matches();
        try {
            if (result) {
                return result;
            } else {
                throw new InvalidUserException("Please Enter Valid Email id");
            }
        } catch (InvalidUserException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public boolean validateMobileNumber(String mobNumber) throws InvalidUserException {
        pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
        matcher = pattern.matcher(mobNumber);
        boolean result = matcher.matches();
        try {
            if (result) {
                return result;
            } else {
                throw new InvalidUserException("Please Enter Valid Mobile Number");
            }
        } catch (InvalidUserException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public boolean validatePassword(String password) throws InvalidUserException {
        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(password);
        boolean result = matcher.matches();
        try {
            if (result) {
                return result;
            } else {
                throw new InvalidUserException("Please Enter Valid Password");
            }
        } catch (InvalidUserException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}