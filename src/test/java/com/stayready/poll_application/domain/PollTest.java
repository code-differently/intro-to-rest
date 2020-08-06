package com.stayready.poll_application.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class PollTest {

    Poll poll;
    @Before
    public void initialize(){
        poll = new Poll();
    }
    @Test
    public void setIdTest() {

        poll.setId(1L);
        Assert.assertEquals(Long.valueOf(1), poll.getId());
    }

    @Test
    public void getIdTest() {

        Assert.assertEquals(null, poll.getId());
    }

    @Test
    public void setQuestionTest() {

        poll.setQuestion("How are you?");
        Assert.assertEquals("How are you?", poll.getQuestion());
    }

    @Test
    public void getQuestionTest() {

        Assert.assertEquals(null, poll.getQuestion());
    }

    @Test
    public void setOptionsTest() {

        Set<Option> exp = new HashSet<>();
        exp.add(new Option());
        poll.setOptions(exp);
        Assert.assertEquals(exp, poll.getOptions());
    }

    @Test
    public void getOptionsTest() {

        Assert.assertEquals(null, poll.getOptions());
    }
}