package com.stayready.poll_application.dtos.error;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidationErrorTest {
    ValidationError validationError;

    @Before
    public void setup() {
        validationError = new ValidationError();
    }

    @Test
    public void getCodeTest() {
        assertNull(validationError.getCode());
    }

    @Test
    public void setCodeTest() {
        String expected = "400";

        validationError.setCode(expected);
        String actual = validationError.getCode();

        assertEquals(expected, actual);
    }

    @Test
    public void getMessageTest() {
        assertNull(validationError.getMessage());
    }

    @Test
    public void setMessageTest() {
        String expected = "Can't find page";

        validationError.setMessage(expected);
        String actual = validationError.getMessage();

        assertEquals(expected, actual);
    }
}
