package com.stayready.poll_application.dtostest;

import com.stayready.poll_application.domain.Option;
import com.stayready.poll_application.dtos.OptionCount;
import com.stayready.poll_application.dtos.VoteResult;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class VoteResultTest {
    @Test
    public void getTotalVotesTest(){
        //Given
        int expected = 0;
        //When
        VoteResult voteResult = new VoteResult();
        int actual = voteResult.getTotalVotes();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setTotalVotesTest(){
        //Given
        int expected = 3;
        //When
        VoteResult voteResult = new VoteResult();
        voteResult.setTotalVotes(3);
        int actual = voteResult.getTotalVotes();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setResultsTest(){
        //Given
        int expected = 1;
        //When
        Collection<OptionCount> res = new ArrayList<OptionCount>();
        res.add(new OptionCount());
        VoteResult voteResult = new VoteResult();
        voteResult.setResults(res);
        int actual = voteResult.getResults().size();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getResultsTest(){
        //Given
        int expected = 0;
        //When
        Collection<OptionCount> res = new ArrayList<OptionCount>();
        VoteResult voteResult = new VoteResult();
        voteResult.setResults(res);
        int actual = voteResult.getResults().size();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
