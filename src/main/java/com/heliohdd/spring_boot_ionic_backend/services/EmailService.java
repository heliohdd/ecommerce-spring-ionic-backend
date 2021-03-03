package com.heliohdd.spring_boot_ionic_backend.services;

import org.springframework.mail.SimpleMailMessage;

import com.heliohdd.spring_boot_ionic_backend.domain.Cliente;
import com.heliohdd.spring_boot_ionic_backend.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);

}
