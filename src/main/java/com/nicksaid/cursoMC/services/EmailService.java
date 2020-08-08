package com.nicksaid.cursoMC.services;

import com.nicksaid.cursoMC.domain.Pedido;

import org.springframework.mail.SimpleMailMessage;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
