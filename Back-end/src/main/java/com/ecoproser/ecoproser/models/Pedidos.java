package com.ecoproser.ecoproser.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name= "Pedidos")
public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "idPedidos", nullable = false, length = 36)
    private String idPedidos;

    @Column(name = "Estado", nullable = false, length = 36)
    private String Estado;

    @Column(name = "fechaPedido", nullable = false, length = 36)
    private String fechaPedido; 

    @ManyToOne
    @JoinColumn(name="idProductos")
    private Productos Productos;

    @ManyToOne
    @JoinColumn(name="idCliente")
    private Usuario Cliente;

    public Pedidos() {
    }

    public Pedidos(String idPedidos, String estado, String fechaPedido,
            com.ecoproser.ecoproser.models.Productos productos, com.ecoproser.ecoproser.models.Usuario cliente) {
        this.idPedidos = idPedidos;
        Estado = estado;
        this.fechaPedido = fechaPedido;
        Productos = productos;
        Cliente = cliente;
    }

    public String getIdPedidos() {
        return idPedidos;
    }

    public void setIdPedidos(String idPedidos) {
        this.idPedidos = idPedidos;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Productos getProductos() {
        return Productos;
    }

    public void setProductos(Productos productos) {
        Productos = productos;
    }

    public Usuario getCliente() {
        return Cliente;
    }

    public void setCliente(Usuario cliente) {
        Cliente = cliente;
    }


}
