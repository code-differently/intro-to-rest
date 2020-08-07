package com.stayready.poll_application.dto.error;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ErrorDetailTest {

    ErrorDetail ed;
    @Before
    public void initialize() {
        ed = new ErrorDetail();
    }

    @Test
    public void getTitleTest() {
        // Given
        String expected = "Not found";
        ed.setTitle(expected);

        // When
        String actual = ed.getTitle();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTitleTest() {
        // Given
        String expected = "Not found";

        // When
        ed.setTitle(expected);
        String actual = ed.getTitle();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getStatusTest() {
        // Given
        int expected = 404;
        ed.setStatus(expected);

        // When
        int actual = ed.getStatus();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setStatusTest() {
        // Given
        int expected = 404;

        // When
        ed.setStatus(expected);
        int actual = ed.getStatus();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDetailTest() {
        // Given
        String expected = "Poll not found";
        ed.setDetail(expected);

        // When
        String actual = ed.getDetail();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setDetailTest() {
        // Given
        String expected = "Not found";

        // When
        ed.setDetail(expected);
        String actual = ed.getDetail();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTimeStampTest() {
        // Given
        long expected = 23L;
        ed.setTimeStamp(expected);

        // When
        long actual = ed.getTimeStamp();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTimeStampTest() {
        // Given
        long expected = 23L;

        // When
        ed.setTimeStamp(expected);
        long actual = ed.getTimeStamp();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDeveloperMessageTest() {
        // Given
        String expected = "Need to change config";
        ed.setDeveloperMessage(expected);

        // When
        String actual = ed.getDeveloperMessage();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setDeveloperMessageTest() {
        // Given
        String expected = "Need to change config";

        // When
        ed.setDeveloperMessage(expected);
        String actual = ed.getDeveloperMessage();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getErrorsTest() {
        // Given
        Map<String, List<ValidationError>> expected = new LinkedHashMap<>();
        ed.setErrors(expected);

        // When
        Map<String, List<ValidationError>> actual = ed.getErrors();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setErrorsTest() {
        // Given
        Map<String, List<ValidationError>> expected = new LinkedHashMap<>();

        // When
        ed.setErrors(expected);
        Map<String, List<ValidationError>> actual = ed.getErrors();

        // Then
        Assert.assertEquals(expected, actual);
    }

}
