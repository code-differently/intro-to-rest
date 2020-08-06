package com.stayready.poll_application;

import static org.junit.Assert.assertTrue;

import com.stayready.poll_application.error.ValidationError;

import org.junit.Before;
import org.junit.Test;



public class ValidationErrorTest 
{
    ValidationError valid;
    @Before
    public void initialize()
    {
        valid = new ValidationError();
    }

    @Test
    public void setCodeTest()
    {
        valid.setCode("1234");

        String expected = "1234";

        assertTrue(expected.equals(valid.getCode()));
    }

    @Test
    public void getCodeTest()
    {
        valid.setCode("1234");

        String expected = "1234";
        String actual = valid.getCode();

        assertTrue(expected.equals(actual));
    }


    @Test
    public void setMessageTest()
    {
        valid.setMessage("message recieved");

        String expected = "message recieved";

        assertTrue(expected.equals(valid.getMessage()));
    }

    @Test
    public void getMessageTest()
    {
        valid.setMessage("message recieved");

        String expected = "message recieved";
        String actual = valid.getMessage();
        assertTrue(expected.equals(actual));
    }

   
}