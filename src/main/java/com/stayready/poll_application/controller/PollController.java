package com.stayready.poll_application.controller;

import com.stayready.poll_application.domain.Poll;
import com.stayready.poll_application.exception.ResourceNotFoundException;
import com.stayready.poll_application.repositories.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.inject.Inject;
import javax.validation.Valid;
import java.net.URI;

@RestController
public class PollController
{
 
    PollRepository pollRepository;

    @Autowired
    public PollController(PollRepository pollRepository)
    {
        this.pollRepository = pollRepository;
    }


    @RequestMapping(value="/polls", method= RequestMethod.GET)
    public ResponseEntity<Page<Poll>> getAllPolls(Pageable pageable)
    {
        Page<Poll> allPolls = pollRepository.findAll(pageable);
        return new ResponseEntity<>(allPolls, HttpStatus.OK);
    }

    @RequestMapping(value="/polls", method=RequestMethod.POST)
    public ResponseEntity<?> createPoll(@Valid @RequestBody Poll poll)
    {
        poll = pollRepository.save(poll);
        HttpHeaders responseHeaders = new HttpHeaders();

        URI newPollUri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(poll.getId())
                .toUri();
                
        responseHeaders.setLocation(newPollUri);
        return new ResponseEntity<>(null,responseHeaders,HttpStatus.CREATED);
    }

    @RequestMapping(value="/polls/{pollId}", method=RequestMethod.GET)
    public ResponseEntity<?> getPoll(@PathVariable Long pollId)
    {
        verifypoll(pollId);
        Poll p = pollRepository.findOne(pollId);
        return new ResponseEntity<> (p, HttpStatus.OK);
    }

    @RequestMapping(value="/polls/{pollId}", method=RequestMethod.PUT)
    public ResponseEntity<?> updatePoll(@Valid @RequestBody Poll poll, @PathVariable Long pollId)
    {
        verifypoll(pollId);
        // Save the entity
        Poll p = pollRepository.save(poll);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value="/polls/{pollId}", method=RequestMethod.DELETE)
    public ResponseEntity<?> deletePoll(@PathVariable Long pollId)
    {
        verifypoll(pollId);
        pollRepository.delete(pollId);
        return new ResponseEntity<>(HttpStatus.OK);

    }

    protected void  verifypoll(Long pollId) throws ResourceNotFoundException
    {
        Poll poll = pollRepository.findOne(pollId);
        if (poll == null)
        {
            throw new ResourceNotFoundException("Poll with id "+pollId+" not found");
        }
    }
}
