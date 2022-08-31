package com.josueemilian.biblioteca;

import java.io.Serializable;
import java.util.Date;

public class Autor implements Serializable{
    private String Nombre;
    private String fechaNacimiento;
    private String estado;
       
    //Getters and Setters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    //constructor vacio
    public Autor() {
    }
    
    //constructor
    public Autor(String Nombre, String fechaNacimiento, String estado) {
        this.Nombre = Nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }
    
    
    //metodos
    public String consultorAutor(){ 
        String vEstado = "";
        return vEstado;
    }
    
    public int borrarAutor(){
        int vBorrar = 0;
        return vBorrar;
    }
    
    //propiedad to string

    @Override
    public String toString() {
        return "Nombre = " + Nombre + ", fecha de Nacimiento = " + fechaNacimiento + ", Estado = " + estado;
    }
    
}
