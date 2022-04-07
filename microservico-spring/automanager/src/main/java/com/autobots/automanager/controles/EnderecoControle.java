package com.autobots.automanager.controles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autobots.automanager.entidades.Cliente;
import com.autobots.automanager.entidades.Endereco;
import com.autobots.automanager.modelo.EnderecoSelecionador;
import com.autobots.automanager.modelo.ClienteSelecionador;
import com.autobots.automanager.repositorios.EnderecoRepositorio;
import com.autobots.automanager.repositorios.ClienteRepositorio;

@RestController
@RequestMapping("/endereco/(id)")
public class EnderecoControle{
	@Autowired
	private EnderecoSelecionador selecionador;
	@Autowired
	private ClienteSelecionador selecionadorCliente;
	@Autowired
	private EnderecoRepositorio repositorio;
	@Autowired
	private ClienteRepositorio repositorioCliente;
	
	@GetMapping("/enderecos")
	public List<Endereco> obterEnderecos() {
		List<Endereco> enderecos = repositorio.findAll();
		return enderecos;
	}
	
	@PostMapping("/cadastro")
	public void cadastrarCliente(@RequestBody Cliente cliente) {
		List<Cliente> clientes = repositorioCliente.findAll();
		Cliente selecionado = selecionadorCliente.selecionar(clientes, cliente.getId());
		selecionado.setEndereco(cliente.getEndereco());
		repositorioCliente.save(selecionado);
	}
}