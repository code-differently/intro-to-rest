/*package com.stayready.poll_application.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VoteTest {

    Vote vote;
    @Before
    public void initialize() {
        vote = new Vote();
    }

    @Test
    public void getIdTest() {
        // Given
        Long expected = 1L;
        vote.setId(expected);

        // When
        Long actual = vote.getId();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setIdTest() {
        // Given
        Long expected = 1L;

        // When
        vote.setId(expected);
        Long actual = vote.getId();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getOptionTest() {
        // Given
        Option testOption = new Option();
        vote.setOption(testOption);

        // When
        Option actual = vote.getOption();

        // Then
        Assert.assertEquals(testOption, actual);
    }

    @Test
    public void setOptionTest() {
        // Given
        Option testOption = new Option();

        // When
        vote.setOption(testOption);
        Option actual = vote.getOption();

        // Then
        Assert.assertEquals(testOption, actual);
    }
} */
