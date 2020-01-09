package com.heliohdd.spring_boot_ionic_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.heliohdd.spring_boot_ionic_backend.domain.Pagamento;


@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}