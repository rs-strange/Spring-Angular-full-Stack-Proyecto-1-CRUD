package com.org.project.fullstack.proyectofullstack.repository;

import com.org.project.fullstack.proyectofullstack.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPaisRepository extends JpaRepository<Pais, Long> {
}
