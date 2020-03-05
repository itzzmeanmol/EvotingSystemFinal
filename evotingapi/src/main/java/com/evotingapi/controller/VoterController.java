package com.evotingapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evotingapi.model.Voter;
import com.evotingapi.services.VoterService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
//@RequestMapping("/loginpage")
public class VoterController {
	
	@Autowired
	private VoterService voterService;
	
	@PostMapping("/voter")
	public Voter voterSave(@RequestBody Voter voter){
		return voterService.saveVoter(voter);
	}
	@PostMapping("/updateflag")
	public int saveFlag(@RequestBody Voter voter) {
		System.out.println(voter);
		return voterService.updateFlag(voter);
	}
	@PostMapping("/deletevoter")
	public void deleteVoter(@RequestBody Voter voter) {
		voterService.deleteVoter(voter);
	}
	@PostMapping("/castvote")
	public void castVote(@RequestBody Voter voter) {
		voterService.castVote(voter);
	}
}
