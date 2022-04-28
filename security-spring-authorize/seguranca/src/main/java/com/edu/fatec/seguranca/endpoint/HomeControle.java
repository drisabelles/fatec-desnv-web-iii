package com.edu.fatec.seguranca.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControle {
	
	@GetMapping("/")
	public String bemvindo() {
		return "Bem-vindo(a)";
	}
}