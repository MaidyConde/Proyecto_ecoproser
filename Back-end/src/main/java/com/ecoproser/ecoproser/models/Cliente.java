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

    @Column(name = "tipoDocumento", nullable = false, length = 36)
    private String tipoDocumento; 

    @Column(name = "numeroDocumento", nullable = false, length = 36)
    private String numeroDocumento; 

    @Column(name = "primerNombre", nullable = false, length = 36)
    private String primerNombre; 

    @Column(name = "segundoNombre", nullable = false, length = 36)
    private String segundoNombre; 

    @Column(name = "primerApellido", nullable = false, length = 36)
    private String primerApellido; 

    @Column(name = "segundoApellido", nullable = false, length = 36)
    private String segundoApellido; 

    @Column(name = "Correo", nullable = false, length = 100)
    private String Correo; 

    @Column(name = "Telefono", nullable = false, length = 13)
    private String Telefono; 

    @Column(name = "Direccion", nullable = false, length = 100)
    private String Direccion;

    public Cliente() {
    }

    public Cliente(String idCliente, String tipoDocumento, String numeroDocumento, String primerNombre,
            String segundoNombre, String primerApellido, String segundoApellido, String correo, String telefono,
            String direccion) {
        this.idCliente = idCliente;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
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

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
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
