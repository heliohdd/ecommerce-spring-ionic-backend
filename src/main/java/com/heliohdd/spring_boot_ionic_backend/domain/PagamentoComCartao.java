package com.heliohdd.spring_boot_ionic_backend.domain;

import java.io.Serializable;

import javax.persistence.Entity;

import com.heliohdd.spring_boot_ionic_backend.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComCartao extends Pagamento implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer numeroDeParcelas;

	public PagamentoComCartao() {
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
		super(id, estado, pedido);
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public Integer getId() {
		return numeroDeParcelas;
	}

	public void setId(Integer id) {
		this.numeroDeParcelas = id;
	}
}