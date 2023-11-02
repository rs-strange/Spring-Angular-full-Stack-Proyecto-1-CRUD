package com.org.project.fullstack.proyectofullstack.service.impl;

import com.org.project.fullstack.proyectofullstack.model.Persona;
import com.org.project.fullstack.proyectofullstack.repository.IPersonaRepository;
import com.org.project.fullstack.proyectofullstack.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private IPersonaRepository iPersonaRepository;

    @Override
    public List<Persona> listar() {
        return iPersonaRepository.findAll();
    }

    @Override
    public Persona registrar(Persona persona) {
        return iPersonaRepository.save(persona);
    }

    @Override
    public Persona actualizar(Persona persona) {
        return iPersonaRepository.save(persona);
    }

    @Override
    public void eliminar(Long idPersona) {
        iPersonaRepository.deleteById(idPersona);
    }

    @Override
    public Persona buscarPorId(Long id) {
        return iPersonaRepository.findById(id).orElse(null);
    }
}
