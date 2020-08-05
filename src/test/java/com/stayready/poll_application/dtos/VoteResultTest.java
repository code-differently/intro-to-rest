/*package com.stayready.poll_application.dtos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class VoteResultTest {

    VoteResult vr;
    @Before
    public void initialize() {
        vr = new VoteResult();
    }

    @Test
    public void getTotalVotesTest() {
        // Given
        int expected = 10;
        vr.setTotalVotes(expected);

        // When
        int actual = vr.getTotalVotes();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTotalVotesTest() {
        // Given
        int expected = 10;

        // When
        vr.setTotalVotes(expected);
        int actual = vr.getTotalVotes();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getResultsTest() {
        // Given
        Collection<OptionCount> expected = new ArrayList<>();
        vr.setResults(expected);

        // When
        Collection<OptionCount> actual = vr.getResults();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setResultsTest() {
        // Given
        Collection<OptionCount> expected = new ArrayList<>();

        // When
        vr.setResults(expected);
        Collection<OptionCount> actual = vr.getResults();

        // Then
        Assert.assertEquals(expected, actual);
    }
} */
