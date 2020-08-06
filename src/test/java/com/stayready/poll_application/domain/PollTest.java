package com.stayready.poll_application.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class PollTest {
    Poll poll;
    @Before
    public void setup() {
        poll = new Poll();
    }

    @Test
    public void getIDTest() {
        Long expected = 0L;

        Long actual = poll.getId();

        assertEquals(expected, actual);
    }

    @Test
    public void setIDTest() {
        Long expected = 5L;

        poll.setId(expected);
        Long actual = poll.getId();

        assertEquals(expected, actual);
    }

    @Test
    public void getQuestionTest() {
        String expected = "";

        String actual = poll.getQuestion();

        assertEquals(expected, actual);
    }

    @Test
    public void setQuestionTest() {
        String expected = "What movie do you like?";

        poll.setQuestion(expected);
        String actual = poll.getQuestion();

        assertEquals(expected, actual);
    }

    @Test
    public void getOptionsTest() {
        assertNull(poll.getOptions());
    }

    @Test
    public void setOptionsTest() {
        int expectedSize = 1;
        HashSet<Option> options = new HashSet<>();
        options.add(new Option());

        poll.setOptions(options);
        int actualSize = poll.getOptions().size();

        assertEquals(expectedSize, actualSize);
    }
}
