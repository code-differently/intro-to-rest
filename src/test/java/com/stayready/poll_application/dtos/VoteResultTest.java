package com.stayready.poll_application.dtos;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Collection;

import static org.junit.Assert.*;

public class VoteResultTest {
    VoteResult voteResult;

    @Before
    public void setup() {
        voteResult = new VoteResult();
    }

    @Test
    public void getTotalVotesTest() {
        int expected = 0;

        int actual = voteResult.getTotalVotes();

        assertEquals(expected, actual);
    }

    @Test
    public void setTotalVotesTest() {
        int expected = 5;

        voteResult.setTotalVotes(expected);
        int actual = voteResult.getTotalVotes();

        assertEquals(expected, actual);
    }

    @Test
    public void getResultsTest() {
        assertNull(voteResult.getResults());
    }

    @Test
    public void setResultsTest() {
        Collection<OptionCount> deque = new ArrayDeque<>();
        deque.add(new OptionCount());
        int expectedSize = 1;

        voteResult.setResults(deque);
        int actualSize = voteResult.getResults().size();

        assertEquals(expectedSize, actualSize);
    }
}
