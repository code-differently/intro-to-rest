/*package com.stayready.poll_application.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class PollTest {

    Poll poll;
    @Before
    public void initialize() {
        poll = new Poll();
    }

    @Test
    public void getIdTest() {
        // Given
        Long expected = 1L;
        poll.setId(expected);

        // When
        Long actual = poll.getId();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setIdTest() {
        // Given
        Long expected = 1L;

        // When
        poll.setId(expected);
        Long actual = poll.getId();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getQuestionTest() {
        // Given
        String expected = "Who will win the NBA Finals?";
        poll.setQuestion(expected);

        // When
        String actual = poll.getQuestion();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setQuestionTest() {
        // Given
        String expected = "Who will win the NBA Finals?";

        // When
        poll.setQuestion(expected);
        String actual = poll.getQuestion();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getOptionsTest() {
        // Given
        Set<Option> testSet = new HashSet<>();
        poll.setOptions(testSet);

        // When
        Set<Option> actualOptions = poll.getOptions();

        // Then
        Assert.assertEquals(testSet, actualOptions);
    }

    @Test
    public void setOptionsTest() {
        // Given
        Set<Option> testSet = new HashSet<>();

        // When
        poll.setOptions(testSet);
        Set<Option> actualOptions = poll.getOptions();

        // Then
        Assert.assertEquals(testSet, actualOptions);
    }
} */
