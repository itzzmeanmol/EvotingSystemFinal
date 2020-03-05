package com.evotingapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.evotingapi.model.Candidate;
import com.evotingapi.model.Voter;
import com.evotingapi.services.CandidateService;
import com.evotingapi.services.QandaService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class CandidateController {

	@Autowired
	private CandidateService candidateService;
	
	@PostMapping("/candidate")
	public Candidate candidateSave(@RequestBody Candidate candidate){
		return candidateService.saveCandidate(candidate);
	}
	
	@PostMapping("/addvote")
	public int addVote(@RequestBody Candidate candidate) {
		return candidateService.addVote(candidate);
	}
	
	@GetMapping("/showresults")
	public List<Object[]> getResults() {
		return candidateService.getResults();
	}
	
	@PostMapping("/updatecandidateflag")
	public int saveFlag(@RequestBody Candidate candidate) {
//		System.out.println(voter);
		return candidateService.updateFlag(candidate);
	}
	@PostMapping("/deletecandidate")
	public void deleteCandidate(@RequestBody Candidate candidate) {
		candidateService.deleteCandidate(candidate);
	}
	
	
}
