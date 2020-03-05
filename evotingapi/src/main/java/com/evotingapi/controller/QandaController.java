package com.evotingapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.evotingapi.model.Qanda;
import com.evotingapi.repository.QandaRepository;
import com.evotingapi.services.QandaService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class QandaController {
	@Autowired
	private QandaService qandaService;
	
	@PostMapping("/saveallqanda")
	Qanda saveAllQanda(@RequestBody Qanda qanda) {
		return qandaService.saveAllQanda(qanda);
	}
	
	@GetMapping("/getallqanda")
	List<Qanda> getAllQanda(){
		return qandaService.getAllQanda();
	}
	
//	@PostMapping("/saveQandaFlag")
//	Qanda saveQandaFlag(@RequestBody Qanda qanda) {
//		return qandaService.saveQandaFlag(qanda);
//	}
	
	
	
}
