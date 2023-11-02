package com.org.project.fullstack.proyectofullstack.service;

import com.org.project.fullstack.proyectofullstack.model.Persona;

import java.util.List;

public interface IPersonaService {

    List<Persona> listar();
    Persona registrar(Persona persona);

    Persona actualizar(Persona persona);

    void eliminar (Long idPersona);

    Persona buscarPorId(Long id);

}
