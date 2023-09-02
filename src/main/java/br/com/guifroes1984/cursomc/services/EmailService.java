package br.com.guifroes1984.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import br.com.guifroes1984.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
