package com.stayready.poll_application;

import static org.junit.Assert.assertTrue;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.stayready.poll_application.error.ErrorDetail;
import com.stayready.poll_application.error.ValidationError;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.Bean;

public class ErrorDetailTest 
{
    ErrorDetail errorDetail;
    @Before
    public void initialize()
    {
        errorDetail = new ErrorDetail();
    }

    @Test
    public void setTitle()
    {
        errorDetail.setTitle("title");

        String expected = "title";

        assertTrue(expected.equals(errorDetail.getTitle()));
    }

    @Test
    public void getTitle()
    {
        errorDetail.setTitle("title");

        String expected = "title";
        String actual = errorDetail.getTitle();

        assertTrue(expected.equals(actual));
    }

    @Test
    public void setStatus()
    {
        errorDetail.setStatus(504);

        int expected = 504;

        assertTrue(expected == errorDetail.getStatus());
    }

    @Test
    public void getStatus()
    {
        errorDetail.setStatus(504);

        int expected = 504;
        int actual = errorDetail.getStatus();

        assertTrue(expected == actual);
    }

    @Test
    public void setDetailTest()
    {
        errorDetail.setDetail("does this work");

        String expected = "does this work";

        assertTrue(expected.equals(errorDetail.getDetail()));
    }

    @Test
    public void getDetailTest()
    {
        errorDetail.setDetail("this works");

        String expected = "this works";
        String actual = errorDetail.getDetail();

        assertTrue(expected.equals(actual));
    }

    @Test
    public void setTimeStampTest()
    {
        errorDetail.setTimeStamp(6L);

        long expected = 6L;

        assertTrue(expected == errorDetail.getTimeStamp());
    }

    @Test
    public void getTimeStampTest()
    {
        errorDetail.setTimeStamp(6L);

        long expected = 6L;
        long actual = errorDetail.getTimeStamp();

        assertTrue(expected == actual);
    }

    @Test
    public void setDeveloperMessageTest()
    {
        errorDetail.setDeveloperMessage("does this work");

        String expected = "does this work";

        assertTrue(expected.equals(errorDetail.getDeveloperMessage()));
    }

    @Test
    public void getDeveloperMessageTest()
    {
        errorDetail.setDeveloperMessage("does this work");

        String expected = "does this work";
        String actual = errorDetail.getDeveloperMessage();

        assertTrue(expected.equals(actual));
    }

    @Test
    public void setErrorsTest()
    {
        Map<String, List<ValidationError>> expected = new LinkedHashMap<>();

        errorDetail.setErrors(expected);

        assertTrue(expected == errorDetail.getErrors());
    }

    
    @Test
    public void getErrorsTest()
    {
        Map<String, List<ValidationError>> expected = new LinkedHashMap<>();

        errorDetail.setErrors(expected);

        Map<String, List<ValidationError>> actual = errorDetail.getErrors();


        assertTrue(expected == actual);
    }
    
}