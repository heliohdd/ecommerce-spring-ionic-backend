package com.heliohdd.spring_boot_ionic_backend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heliohdd.spring_boot_ionic_backend.domain.Pedido;
import com.heliohdd.spring_boot_ionic_backend.repositories.PedidoRepository;
import com.heliohdd.spring_boot_ionic_backend.services.exception.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;

	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
}