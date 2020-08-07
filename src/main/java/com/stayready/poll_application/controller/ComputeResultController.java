package com.stayready.poll_application.controller;

import com.stayready.poll_application.domain.Vote;
import com.stayready.poll_application.repositories.VoteRepository;
import dtos.OptionCount;
import dtos.VoteResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
public class ComputeResultController {
    private VoteRepository voteRepository;

    @Autowired
    public ComputeResultController(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    @RequestMapping(value = "/computeresult", method = RequestMethod.GET)
    public ResponseEntity<?> computeResult(@RequestParam Long pollId) {
        VoteResult voteResult = new VoteResult();
        Iterable<Vote> allVotes = voteRepository.findVotesByPoll(pollId);
        int numOfVotes = 0;
        Map<Long, OptionCount> map = new HashMap<Long, OptionCount>();
        for(Vote votes: allVotes){
            numOfVotes++;
            //Get the OptionCount corresponding to this Option
            OptionCount optionCount = map.get(votes.getOption().getId());
            if(optionCount ==null){
                optionCount = new OptionCount();
                optionCount.setOptionId(votes.getOption().getId());
                map.put(votes.getOption().getId(), optionCount);
            }
            optionCount.setCount(optionCount.getCount()+1);
        }
        voteResult.setTotalVotes(numOfVotes);
        voteResult.setResults(map.values());

        return new ResponseEntity<VoteResult>(voteResult, HttpStatus.OK);
    }

    //helper method to count votes with each option
    //public VoteResult countVotes(Iterable<Vote> allVotes, )
}
