package com.heliohdd.spring_boot_ionic_backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.heliohdd.spring_boot_ionic_backend.domain.Categoria;
import com.heliohdd.spring_boot_ionic_backend.repositories.CategoriaRepository;
import com.heliohdd.spring_boot_ionic_backend.services.exception.DataIntegrityException;
import com.heliohdd.spring_boot_ionic_backend.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
	
	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	public Categoria update(Categoria obj) {
		find(obj.getId());
		return repo.save(obj);
	}

	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir uma categoria que possua produtos!");
		}
	}
	
	public List<Categoria> findAll() {
		return repo.findAll();
	}	

}