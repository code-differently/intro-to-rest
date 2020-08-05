package com.stayready.poll_application.controller;

import javax.inject.Inject;
import com.stayready.poll_application.repositories.PollRepository;

import org.apache.tomcat.jni.Poll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PollController{

    @Inject
    private PollRepository pollRepository;

    @Autowired
    public PollController(PollRepository pollRepository){
        this.pollRepository = pollRepository;
    }

    @RequestMapping(value="/polls", method= RequestMethod.GET)
    public ResponseEntity<Iterable<Poll>> getAllPolls() {
        Iterable<Poll> allPolls = pollRepository.findAll();
        return new ResponseEntity<>(allPolls, HttpStatus.OK);
}
}