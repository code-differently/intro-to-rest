package com.stayready.poll_application.error;

import org.junit.Before;
import org.junit.Test;
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
}
