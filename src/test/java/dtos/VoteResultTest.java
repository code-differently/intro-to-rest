package dtos;

import com.stayready.poll_application.domain.Option;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class VoteResultTest {

    VoteResult voteResult;

    @Before
    public void initialize(){
        voteResult = new VoteResult();
    }

    @Test
    public void getTotalVotesTest() {

        Assert.assertEquals(0, voteResult.getTotalVotes());
    }

    @Test
    public void setTotalVotesTest() {

        voteResult.setTotalVotes(10);
        Assert.assertEquals(10, voteResult.getTotalVotes());
    }

    @Test
    public void getResultsTest() {

        Assert.assertEquals(null, voteResult.getResults());
    }

    @Test
    public void setResultsTest() {
        Set<OptionCount> exp = new HashSet<>();
        exp.add(new OptionCount());
        voteResult.setResults(exp);
        Assert.assertEquals(exp, voteResult.getResults());

    }
}