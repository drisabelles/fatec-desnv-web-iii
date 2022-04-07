package com.edu.fatec.backendspringrestfull.modelos;

import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Component;

import com.edu.fatec.backendspringrestfull.controles.ClienteControle;
import com.edu.fatec.backendspringrestfull.entidades.Cliente;

@Component
public class AdicionadorLinkCliente implements AdicionadorLink<Cliente> {

	@Override
	public void adicionarLink(List<Cliente> lista) {
		for (Cliente cliente : lista) {
			long id = cliente.getId();
			Link linkProprio = WebMvcLinkBuilder
					.linkTo(WebMvcLinkBuilder
							.methodOn(ClienteControle.class)
							.obterCliente(id))
					.withSelfRel();
			cliente.add(linkProprio);
		}
	}

	@Override
	public void adicionarLink(Cliente objeto) {
		Link linkProprio = WebMvcLinkBuilder
				.linkTo(WebMvcLinkBuilder
						.methodOn(ClienteControle.class)
						.obterClientes())
				.withRel("Lista de clientes");
		objeto.add(linkProprio);
	}
}