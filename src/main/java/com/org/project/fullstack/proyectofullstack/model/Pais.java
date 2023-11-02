package com.org.project.fullstack.proyectofullstack.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Pais")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPais;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    public Long getIdPais() {
        return idPais;
    }

    public void setIdPais(Long idPais) {
        this.idPais = idPais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
