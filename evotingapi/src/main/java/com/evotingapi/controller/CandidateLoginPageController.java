package com.evotingapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evotingapi.model.Candidate;

import com.evotingapi.services.CandidateService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/candidateloginpage")
public class CandidateLoginPageController {
	@Autowired
	private CandidateService candidateService;

	@GetMapping(value = "/all")
	public List<Candidate> getCandidates() {
		return candidateService.getCandidates();
	}

	@PostMapping(value = "/" + "")
	public Candidate validateCredentials(@RequestBody Candidate candidate) {
		return candidateService.findCandidateByLogin(candidate);
	}
}