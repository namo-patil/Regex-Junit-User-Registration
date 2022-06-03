package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
    UserValidation userValidation = new UserValidation();

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = false;
        try {
            result = userValidation.validateFirstName("Kajal");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        boolean result = false;
        try {
            result = userValidation.validateFirstName("kajal");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = false;
        try {
            result = userValidation.validateLastName("Sharma");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        boolean result = false;
        try {
            result = userValidation.validateLastName("sh");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        boolean result = false;
        try {
            result = userValidation.validateEmail("abc+def@33ff.co.in");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse() {
        boolean result = false;
        try {
            result = userValidation.validateEmail("RDdef@33ff.co.ind");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        boolean result = false;
        try {
            result = userValidation.validateMobileNumber("91 8534246980");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenNotProper_ShouldReturnFalse() {
        boolean result = false;
        try {
            result = userValidation.validateMobileNumber("918534246980");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenMatched_ShouldReturnTrue() {
        boolean result = false;
        try {
            result = userValidation.validatePassword("nvghyHilu6@gbvh7");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenNotMatched_ShouldReturnFalse() {
        boolean result = false;
        try {
            result = userValidation.validatePassword("nnftrnkj@atil747i");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        Assert.assertFalse(result);
    }
}