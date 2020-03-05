package com.evotingapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.evotingapi.model.Qanda;
import com.evotingapi.repository.QandaRepository;

@Service
public class QandaService {
	
	@Autowired
	private QandaRepository qandaRepository;
	
	public Qanda saveAllQanda(Qanda qanda){
		return qandaRepository.save(qanda);
	}
	
	public List<Qanda> getAllQanda(){
		return qandaRepository.findAll(); 
	}
//	Qanda saveQandaFlag(Qanda qanda) {
//		return qandaRepository.saveQandaFlag(qanda);
//	}
}
