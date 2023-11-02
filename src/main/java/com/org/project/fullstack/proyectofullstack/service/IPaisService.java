package com.org.project.fullstack.proyectofullstack.service;

import com.org.project.fullstack.proyectofullstack.model.Pais;

import java.util.List;

public interface IPaisService {
    List<Pais> listar();
    Pais registrar(Pais pais);
    Pais actualizar(Pais pais);
    void eliminar(Long id);
    Pais buscarPorId(Long id);
}