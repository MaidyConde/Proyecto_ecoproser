package com.ecoproser.ecoproser.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity (name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "idUsuario", nullable = false, length = 36)
    private String idUsuario; 

    @Column(name = "tipoDocumento", nullable = false, length = 36)
    private String tipoDocumento; 

    @Column(name = "numeroDocumento", nullable = false, length = 36)
    private String numeroDocumento; 

    @Column(name = "Correo", nullable = false, length = 100)
    private String Correo; 

    @Column(name = "Contraseña", nullable = false, length = 100)
    private String Contraseña; 

    @Column(name = "primerNombre", nullable = false, length = 36)
    private String primerNombre; 

    @Column(name = "segundoNombre", nullable = false, length = 36)
    private String segundoNombre; 

    @Column(name = "primerApellido", nullable = false, length = 36)
    private String primerApellido; 

    @Column(name = "segundoApellido", nullable = false, length = 36)
    private String segundoApellido; 

    @Column(name = "Telefono", nullable = false, length = 13)
    private String Telefono; 

    @Column(name = "Direccion", nullable = false, length = 100)
    private String Direccion;

    public Usuario() {
    }

    public Usuario(String idUsuario, String tipoDocumento, String numeroDocumento, String correo, String contraseña,
            String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String telefono,
            String direccion) {
        this.idUsuario = idUsuario;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        Correo = correo;
        Contraseña = contraseña;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        Telefono = telefono;
        Direccion = direccion;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
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
