package com.org.project.fullstack.proyectofullstack.repository;

import com.org.project.fullstack.proyectofullstack.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
}
