package com.nicksaid.cursoMC.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nicksaid.cursoMC.domain.Cidade;
import com.nicksaid.cursoMC.repositories.CidadeRepository;

@Service	
public class CidadeService {

	@Autowired
	private CidadeRepository repo;
	
	public List<Cidade> findByEstado(Integer estadoId){
		return repo.findCidades(estadoId);
	}
}
