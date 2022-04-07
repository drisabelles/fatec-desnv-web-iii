package com.edu.fatec.backendspringrestfull.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.fatec.backendspringrestfull.entidades.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {
}