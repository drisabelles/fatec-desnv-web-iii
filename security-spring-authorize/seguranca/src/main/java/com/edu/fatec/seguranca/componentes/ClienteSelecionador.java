package com.edu.fatec.seguranca.componentes;

import java.util.List;

import org.springframework.stereotype.Component;

import com.edu.fatec.seguranca.entidades.Cliente;

@Component
public class ClienteSelecionador implements Selecionador<Cliente, Long> {

	@Override
	public Cliente selecionar(List<Cliente> objetos, Long identificador) {
		Cliente cliente = null;
		for (Cliente objeto : objetos) {
			if (objeto.getId().longValue() == identificador.longValue()) {
				cliente = objeto;
				break;
			}
		}
		return cliente;
	}
}