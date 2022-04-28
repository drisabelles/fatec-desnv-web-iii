package com.edu.fatec.seguranca.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.fatec.seguranca.entidades.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {
}