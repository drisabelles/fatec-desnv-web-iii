package com.edu.fatec.seguranca;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.edu.fatec.seguranca.entidades.Cliente;
import com.edu.fatec.seguranca.repositorios.ClienteRepositorio;

@SpringBootApplication
public class SegurancaApplication {
	public static void main(String[] args) {
		SpringApplication.run(SegurancaApplication.class, args);
	}

	@Component
	public static class Runner implements ApplicationRunner {
		@Autowired
		public ClienteRepositorio repositorio;

		@Override
		public void run(ApplicationArguments args) throws Exception {
			Calendar calendario = Calendar.getInstance();
			calendario.set(2002, 05, 15);

			for (int i = 0; i < 3; i++) {
				Cliente cliente = new Cliente();
				cliente.setNome("Pedro Alcântara de Bragança e Bourbon");
				cliente.setDataCadastro(Calendar.getInstance().getTime());
				cliente.setDataNascimento(calendario.getTime());
				cliente.setNomeSocial("Dom Pedro");
				repositorio.save(cliente);
			}
		}
	}
}