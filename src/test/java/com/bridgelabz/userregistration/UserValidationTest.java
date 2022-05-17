package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
    UserValidation userValidation = new UserValidation();

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = userValidation.validateFirstName("Kajal");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        boolean result = userValidation.validateFirstName("kajal");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = userValidation.validateLastName("Sharma");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        boolean result = userValidation.validateLastName("sh");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        boolean result = userValidation.validateEmail("abc+def@33ff.co.in");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse() {
        boolean result = userValidation.validateEmail("RDdef@33ff.co.ind");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        boolean result = userValidation.validateMobileNumber("91 8534246980");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenNotProper_ShouldReturnFalse() {
        boolean result = userValidation.validateMobileNumber("918534246980");
        Assert.assertFalse(result);
    }
}