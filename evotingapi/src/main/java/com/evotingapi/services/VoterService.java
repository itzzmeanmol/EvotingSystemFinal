package com.evotingapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.evotingapi.model.Voter;
import com.evotingapi.repository.VoterRepository;

@Service
public class VoterService {
	
	@Autowired
	private VoterRepository voterRepository;
	public Voter saveVoter(Voter voter) {
		return voterRepository.save(voter);
	}
	public List<Voter> getVoters(){
		return voterRepository.findAll();
	}
	public Voter getVoter(Long id) {
		return voterRepository.findById(id).get();
	}
	
//	public Voter findVoterByLogin(Voter voter) {
//		return voterRepository.findVoterByLogin(voter.getVin(), voter.getPassword());
//	}
	public int  updateFlag(Voter voter) {
		System.out.println("Hello");
		return voterRepository.updateFlag(voter.getVin());
	}
	
	public void deleteVoter(Voter voter) {
		voterRepository.delete(voter);
	}
	
	public void castVote(Voter voter) {
		voterRepository.castVote(voter.getVin());
	}
}
