package com.ecoproser.ecoproser.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name= "Productos")
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "idProductos", nullable = false, length = 36)
    private String idProductos;

    @Column(name = "nombreProducto", nullable = false, length = 36)
    private String nombreProducto;

    @Column(name = "descripcionProducto", nullable = false, length = 36)
    private String descripcionProducto;

    @Column(name = "precioProducto", nullable = false, length = 36)
    private String precioProducto;

    @Column(name = "stockProducto", nullable = false, length = 36)
    private String stockProducto;

    @ManyToOne
    @JoinColumn(name="idCategorias")
    private Categorias Categorias;

    public Productos() {
    }

    public Productos(String idProductos, String nombreProducto, String descripcionProducto, String precioProducto,
            String stockProducto, com.ecoproser.ecoproser.models.Categorias categorias) {
        this.idProductos = idProductos;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.precioProducto = precioProducto;
        this.stockProducto = stockProducto;
        Categorias = categorias;
    }

    public String getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(String idProductos) {
        this.idProductos = idProductos;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public String getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(String precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(String stockProducto) {
        this.stockProducto = stockProducto;
    }

    public Categorias getCategorias() {
        return Categorias;
    }

    public void setCategorias(Categorias categorias) {
        Categorias = categorias;
    }
     
}
