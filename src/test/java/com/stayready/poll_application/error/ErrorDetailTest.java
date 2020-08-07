package com.stayready.poll_application.error;

import com.stayready.poll_application.dtos.error.ValidationError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class ErrorDetailTest {
    ErrorDetail errorDetail;

    @Before
    public void setup() {
        errorDetail = new ErrorDetail();
    }

    @Test
    public void getTitleTest() {
        assertNull(errorDetail.getTitle());
    }

    @Test
    public void setTitleTest() {
        String expected = "parenthesis error";

        errorDetail.setTitle(expected);
        String actual = errorDetail.getTitle();

        assertEquals(expected, actual);
    }

    @Test
    public void getStatusTest() {
        int expected = 0;

        int actual = errorDetail.getStatus();

        assertEquals(expected, actual);
    }

    @Test
    public void setStatusTest() {
        int expected = 5;

        errorDetail.setStatus(5);
        int actual = errorDetail.getStatus();

        assertEquals(expected, actual);
    }

    @Test
    public void getDetailTest() {
        assertNull(errorDetail.getDetail());
    }

    @Test
    public void setDetailTest() {
        String expected = "missing parenthesis";

        errorDetail.setDetail(expected);
        String actual = errorDetail.getDetail();

        assertEquals(expected, actual);
    }

    @Test
    public void getTimeStampTest() {
        long expected = 0L;

        long actual = errorDetail.getTimeStamp();

        assertEquals(expected, actual);
    }

    @Test
    public void setTimeStampTest() {
        long expected = 4L;

        errorDetail.setTimeStamp(expected);
        long actual = errorDetail.getTimeStamp();

        assertEquals(expected, actual);
    }

    @Test
    public void getPathTest() {
        assertNull(errorDetail.getPath());
    }

    @Test
    public void setPathTest() {
        String expected = "no path found";

        errorDetail.setPath(expected);
        String actual = errorDetail.getPath();

        assertEquals(expected, actual);
    }

    @Test
    public void getDeveloperMessageTest() {
        assertNull(errorDetail.getDeveloperMessage());
    }

    @Test
    public void setDeveloperMessageTest() {
        String expected = "you should put another parenthesis in";

        errorDetail.setDeveloperMessage(expected);
        String actual = errorDetail.getDeveloperMessage();

        assertEquals(expected, actual);
    }

    @Test
    public void getErrorsTest() {
        int expectedSize = 0;

        int actualSize = errorDetail.getErrors().size();

        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void setErrorsTest() {
        int expectedSize = 1;
        Map<String, List<ValidationError>> temp = new HashMap<>();
        temp.put("field1", new ArrayList<ValidationError>());
        temp.get("field1").add(new ValidationError());

        errorDetail.setErrors(temp);
        int actualSize = errorDetail.getErrors().size();

        assertEquals(expectedSize, actualSize);
    }
}
