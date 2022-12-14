package com.josueemilian.biblioteca;

import java.io.Serializable;

public class Editorial implements Serializable{
    private String nombre;
    private String estado;
    
    //Getters and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    //constructor
    public Editorial(String nombre, String estado) {
        this.nombre = nombre;
        this.estado = estado;
    }
    
    
    //construcor vacio
    public Editorial() {
    }
    
    
    
    //metodos 
    public String ConsultarEditorial(){      
        String vConsulta = "";
        return vConsulta;
    }
        
    public String estadoEditorial(){
        String vEstado = "";
        return vEstado;
    }
    
    //propiedad to String

    @Override
    public String toString() {
        return "nombre = " + nombre + ", estado = " + estado;
    }
    
}
