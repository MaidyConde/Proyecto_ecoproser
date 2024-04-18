package com.ecoproser.ecoproser.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "Categorias")
public class Categorias {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "idCategorias", nullable = false, length = 36)
    private String idCategorias;

    @Column(name = "nombreCategorias", nullable = false, length = 36)
    private String nombreCategorias;

    @Column(name = "descripcionCategorias", nullable = false, length = 100)
    private String descripcionCategorias;

    public Categorias() {
    }

    public Categorias(String idCategorias, String nombreCategorias, String descripcionCategorias) {
        this.idCategorias = idCategorias;
        this.nombreCategorias = nombreCategorias;
        this.descripcionCategorias = descripcionCategorias;
    }

    public String getIdCategorias() {
        return idCategorias;
    }

    public void setIdCategorias(String idCategorias) {
        this.idCategorias = idCategorias;
    }

    public String getNombreCategorias() {
        return nombreCategorias;
    }

    public void setNombreCategorias(String nombreCategorias) {
        this.nombreCategorias = nombreCategorias;
    }

    public String getDescripcionCategorias() {
        return descripcionCategorias;
    }

    public void setDescripcionCategorias(String descripcionCategorias) {
        this.descripcionCategorias = descripcionCategorias;
    }

    

}
