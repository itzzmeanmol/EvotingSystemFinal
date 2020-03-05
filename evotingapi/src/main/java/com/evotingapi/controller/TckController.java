package com.evotingapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.evotingapi.model.Tck;
import com.evotingapi.repository.TckRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TckController {
	@Autowired
	TckRepository tckRepository;
	
	@PostMapping("/savetck")
	int saveTck(@RequestBody Tck tck){ //Always check request body
		System.out.println(tck.getTck());
		return tckRepository.saveTck(tck.getTck());
	}
	
	@GetMapping("/gettck")
	List<Tck> getTck() {
		return tckRepository.findAll();
	}
}
