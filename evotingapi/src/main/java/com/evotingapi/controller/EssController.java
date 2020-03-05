
package com.evotingapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.evotingapi.model.Ess;
import com.evotingapi.model.Tck;
import com.evotingapi.repository.EssRepository;
import com.evotingapi.repository.TckRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EssController {
	@Autowired
	EssRepository essRepository;
	
	@PostMapping("/saveess")
	int saveEss(@RequestBody Ess ess){ //Always check request body
//		System.out.println(ess.getEss());
		return essRepository.saveEss(ess.getEss());
	}
	
	@GetMapping("/getess")
	List<Ess> getEss() {
		return essRepository.findAll();
	}
}
