package org.example.ejercicioclasespringdatajpa.repositorios;

import org.example.ejercicioclasespringdatajpa.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepo extends JpaRepository<Cliente, Integer> {

}
