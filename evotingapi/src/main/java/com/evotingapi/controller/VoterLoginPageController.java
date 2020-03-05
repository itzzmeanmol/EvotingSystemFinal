package com.evotingapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evotingapi.model.Candidate;
import com.evotingapi.model.Voter;
import com.evotingapi.services.CandidateService;
import com.evotingapi.services.VoterService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/voterloginpage")
public class VoterLoginPageController {
	@Autowired
	private VoterService voterService;
	
	@GetMapping(value="/all")
	public List<Voter> getVoters(){
		return voterService.getVoters();
	}
	
	

//	@PostMapping(value = "/"+ "")
//	public Voter validateCredentials(@RequestBody Voter voter) {
//		return voterService.findVoterByLogin(voter);
//	}
}
