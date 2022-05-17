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

}