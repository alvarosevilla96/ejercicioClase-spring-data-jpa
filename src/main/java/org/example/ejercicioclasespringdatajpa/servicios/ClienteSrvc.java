package org.example.ejercicioclasespringdatajpa.servicios;

import lombok.RequiredArgsConstructor;
import org.example.ejercicioclasespringdatajpa.entidades.Cliente;
import org.example.ejercicioclasespringdatajpa.repositorios.ClienteRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteSrvc {

    private final ClienteRepo clienteRepo;

    public List<Cliente> listarTodos(){
        return clienteRepo.findAll();
    }

}
