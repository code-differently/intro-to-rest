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

        
        assertNull(errorDetail.getStatus());
    }

    @Test
    public void setStatusTest() {
        String expected = "404";

        errorDetail.setDetail(expected);
        String actual = errorDetail.getDetail();

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
}
