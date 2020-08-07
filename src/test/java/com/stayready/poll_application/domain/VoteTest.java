package com.stayready.poll_application.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VoteTest {

    Vote vote;
    @Before
    public void initialize(){
        vote = new Vote();
    }
    @Test
    public void setIdTest() {

        vote.setId(1L);
        Assert.assertEquals(Long.valueOf(1), vote.getId());
    }

    @Test
    public void getIdTest() {

        Assert.assertEquals(null, vote.getId());
    }

    @Test
    public void getOptionTest() {

        Assert.assertEquals(null, vote.getOption());
    }

    @Test
    public void setOptionTest() {

        Option exp = new Option();
        vote.setOption(exp);
        Assert.assertEquals(exp, vote.getOption());
    }
}