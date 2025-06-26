package org.example.ejercicioclasespringdatajpa.repositorios;

import org.example.ejercicioclasespringdatajpa.entidades.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepo extends JpaRepository<Empleado, Integer> {

}
