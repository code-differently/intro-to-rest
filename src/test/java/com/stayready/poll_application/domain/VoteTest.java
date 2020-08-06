package com.stayready.poll_application.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VoteTest {
    Vote vote;
    @Before
    public void setup() {
        vote = new Vote();
    }

    @Test
    public void getIDTest() {
        Long expected = 0L;

        Long actual = vote.getId();

        assertEquals(expected, actual);
    }

    @Test
    public void setIDTest() {
        Long expected = 5L;

        vote.setId(expected);
        Long actual = vote.getId();

        assertEquals(expected, actual);
    }

    @Test
    public void getOptionTest() {
        String optionExpectedValue = "";

        String optionActualValue = vote.getOption().getValue();

        assertEquals(optionExpectedValue, optionActualValue);
    }

    @Test
    public void setOptionTest() {
        String optionExpectedValue = "cheesecake";
        Option option = new Option();
        option.setValue(optionExpectedValue);

        vote.setOption(option);
        String optionActualValue = vote.getOption().getValue();

        assertEquals(optionExpectedValue, optionActualValue);
    }
}
