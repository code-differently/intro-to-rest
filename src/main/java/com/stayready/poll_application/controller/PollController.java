package com.stayready.poll_application.controller;

import javax.inject.Inject;
import javax.validation.Valid;

import com.stayready.poll_application.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.stayready.poll_application.domain.*;
import com.stayready.poll_application.repositories.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController("PollController")
@RequestMapping("/version/")
//@Api(value = "polls" , description = "Poll API")
public class PollController {
  //read and store Poll instances 
  @Inject
  private PollRepository pollRepository;
  
  @Autowired
  public PollController(PollRepository p){
    this.pollRepository = p;
  }

  @RequestMapping(value="/polls", method= RequestMethod.GET)
  public ResponseEntity<Page<Poll>> getAllPolls(Pageable pageable) {
      Page<Poll> allPolls = pollRepository.findAll(pageable);
      return new ResponseEntity<>(allPolls, HttpStatus.OK);
  }

  @RequestMapping(value="/polls", method=RequestMethod.POST)
  public ResponseEntity<?> createPoll(@Valid @RequestBody Poll poll) {
    poll = pollRepository.save(poll);
    //Set the location header for the newly created resource
    HttpHeaders responseHeaders = new HttpHeaders();
    URI newPollUri = ServletUriComponentsBuilder
                                            .fromCurrentRequest()
                                            .path("/{id}")
                                            .buildAndExpand(poll.getId())
                                            .toUri();
    responseHeaders.setLocation(newPollUri);
    return new ResponseEntity<>(null, responseHeaders, HttpStatus.CREATED);
  }

  @RequestMapping(value="/polls/{pollId}", method=RequestMethod.GET)
  public ResponseEntity<?> getPoll(@PathVariable Long pollId) {
    verifyPoll(pollId);
    Poll p = pollRepository.findOne(pollId);
    return new ResponseEntity<> (p, HttpStatus.OK);
  }

  @RequestMapping(value="/polls/{pollId}", method=RequestMethod.PUT)
  public ResponseEntity<?> updatePoll(@RequestBody Poll poll, @PathVariable Long pollId) {
    verifyPoll(pollId);
    // Save the entity
    Poll p = pollRepository.save(poll);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @RequestMapping(value="/polls/{pollId}", method=RequestMethod.DELETE)
  public ResponseEntity<?> deletePoll(@PathVariable Long pollId) {
    verifyPoll(pollId);
    pollRepository.delete(pollId);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  protected void verifyPoll(Long pollId) throws ResourceNotFoundException {
    Poll poll = pollRepository.findOne(pollId);
    if(poll == null){
      throw new ResourceNotFoundException("Poll with id " + pollId + " not found");
    }
  }





  
}