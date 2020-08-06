package com.stayready.poll_application.domain;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OptionTest {
    Option option;
    @Before
    public void setup() {
        option = new Option();
    }

    @Test
    public void getIDTest() {
        Long expected = 0L;

        Long actual = option.getId();

        assertEquals(expected, actual);
    }

    @Test
    public void setIDTest() {
        Long expected = 5L;

        option.setId(expected);
        Long actual = option.getId();

        assertEquals(expected, actual);
    }

    @Test
    public void getValueTest() {
        String expected = "";

        String actual = option.getValue();

        assertEquals(expected, actual);
    }

    @Test
    public void setValueTest() {
        String expected = "Peanut Butter";

        option.setValue(expected);
        String actual = option.getValue();

        assertEquals(expected, actual);
    }
}
