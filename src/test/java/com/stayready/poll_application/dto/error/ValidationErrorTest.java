package com.stayready.poll_application.dto.error;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidationErrorTest {

    ValidationError ve;
    @Before
    public void initialize() {
        ve = new ValidationError();
    }

    @Test
    public void getCodeTest() {
        // Given
        String expected = "beep bop boop";
        ve.setCode(expected);

        // When
        String actual = ve.getCode();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setCodeTest() {
        // Given
        String expected = "beep bop boop";

        // When
        ve.setCode(expected);
        String actual = ve.getCode();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMessageTest() {
        // Given
        String expected = "Invalid";
        ve.setMessage(expected);

        // When
        String actual = ve.getMessage();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setMessageTest() {
        // Given
        String expected = "Invalid";

        // When
        ve.setMessage(expected);
        String actual = ve.getMessage();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
