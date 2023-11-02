package com.org.project.fullstack.proyectofullstack.model;

import jakarta.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombres;
    @Column(name = "apellidoPaterno", length = 50, nullable = false)
    private String apellidoPaterno;
    @Column(name = "apellidoMaterno", length = 50, nullable = false)
    private String apellidoMaterno;
    @Column(name = "edad")
    private Byte edad;
    @ManyToOne
    @JoinColumn(name = "idPais")
    private Pais pais;

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Byte getEdad() {
        return edad;
    }

    public void setEdad(Byte edad) {
        this.edad = edad;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
