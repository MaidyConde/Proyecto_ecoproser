package com.ecoproser.ecoproser.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity (name = "DetallePedidos")
public class DetallePedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "idDetallePedidos", nullable = false, length = 36)
    private String idDetallePedidos;

    @Column(name = "Cantidad", nullable = false, length = 200)
    private String Cantidad;

    @Column(name = "precioUnitario", nullable = false, length = 36)
    private String precioUnitario;

    @ManyToOne
    @JoinColumn(name="idPedidos")
    private Pedidos Pedidos; 

    @ManyToOne
    @JoinColumn(name="idProductos")
    private Productos Productos;

    public DetallePedidos() {
    }

   

    public DetallePedidos(String idDetallePedidos, String cantidad, String precioUnitario,
            com.ecoproser.ecoproser.models.Pedidos pedidos, com.ecoproser.ecoproser.models.Productos productos) {
        this.idDetallePedidos = idDetallePedidos;
        Cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        Pedidos = pedidos;
        Productos = productos;
    }



    public String getIdDetallePedidos() {
        return idDetallePedidos;
    }

    public void setIdDetallePedidos(String idDetallePedidos) {
        this.idDetallePedidos = idDetallePedidos;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String cantidad) {
        Cantidad = cantidad;
    }

    public String getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(String precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Pedidos getPedidos() {
        return Pedidos;
    }

    public void setPedidos(Pedidos pedidos) {
        Pedidos = pedidos;
    }



    public Productos getProductos() {
        return Productos;
    }



    public void setProductos(Productos productos) {
        Productos = productos;
    }



}
