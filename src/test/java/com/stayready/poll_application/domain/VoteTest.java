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
    public void getIdTest() {
        assertNull(vote.getId());
    }

    @Test
    public void setIdTest() {
        Long expected = 5L;

        vote.setId(expected);
        Long actual = vote.getId();

        assertEquals(expected, actual);
    }

    @Test
    public void getOptionTest() {
        assertNull(vote.getOption());
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
