package org.example.ejercicioclasespringdatajpa.repositorios;

import org.example.ejercicioclasespringdatajpa.entidades.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepo extends JpaRepository<Pedido, Integer> {

}
