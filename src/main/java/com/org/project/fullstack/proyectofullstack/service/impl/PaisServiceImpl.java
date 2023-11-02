package com.org.project.fullstack.proyectofullstack.service.impl;

import com.org.project.fullstack.proyectofullstack.model.Pais;
import com.org.project.fullstack.proyectofullstack.repository.IPaisRepository;
import com.org.project.fullstack.proyectofullstack.service.IPaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisServiceImpl implements IPaisService {

    @Autowired
    IPaisRepository iPaisRepository;

    @Override
    public List<Pais> listar() {
        return iPaisRepository.findAll();
    }

    @Override
    public Pais registrar(Pais pais) {
        return iPaisRepository.save(pais);
    }

    @Override
    public Pais actualizar(Pais pais) {
        return iPaisRepository.save(pais);
    }

    @Override
    public void eliminar(Long id) {
        iPaisRepository.deleteById(id);
    }

    @Override
    public Pais buscarPorId(Long id) {
        return iPaisRepository.findById(id).orElse(null);
    }
}
