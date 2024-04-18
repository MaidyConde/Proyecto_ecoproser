package com.ecoproser.ecoproser.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity (name = "Cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "idCliente", nullable = false, length = 36)
    private String idCliente; 

    @Column(name = "nombreCliente", nullable = false, length = 36)
    private String nombreCliente; 

    @Column(name = "Correo", nullable = false, length = 100)
    private String Correo; 

    @Column(name = "Telefono", nullable = false, length = 13)
    private String Telefono; 

    @Column(name = "Direccion", nullable = false, length = 100)
    private String Direccion;

    public Cliente() {
    }

    public Cliente(String idCliente, String nombreCliente, String correo, String telefono, String direccion) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        Correo = correo;
        Telefono = telefono;
        Direccion = direccion;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    } 


}
