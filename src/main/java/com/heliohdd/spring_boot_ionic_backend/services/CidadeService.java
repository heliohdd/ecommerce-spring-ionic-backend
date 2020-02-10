package com.heliohdd.spring_boot_ionic_backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heliohdd.spring_boot_ionic_backend.domain.Cidade;
import com.heliohdd.spring_boot_ionic_backend.repositories.CidadeRepository;

@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository repo;
	
	public List<Cidade> findByEstado(Integer estadoId) {
		return repo.findCidades(estadoId);
	}
}