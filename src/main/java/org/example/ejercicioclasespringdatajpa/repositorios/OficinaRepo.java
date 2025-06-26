package org.example.ejercicioclasespringdatajpa.repositorios;

import org.example.ejercicioclasespringdatajpa.entidades.Oficina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OficinaRepo extends JpaRepository<Oficina, String> {
}
