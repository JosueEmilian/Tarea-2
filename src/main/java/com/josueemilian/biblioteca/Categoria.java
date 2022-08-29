package com.josueemilian.biblioteca;

public class Categoria {
    //Atributos
    private String nombre;
    private String estado;
    
    //Getters and Setters
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
    
    
    //Constructor
    public Categoria(String nombre, String estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    //constructor sin parametros
    public Categoria() {
    }
    
    //metodos
    public String consultarCategoria(){
        String vEstado = "";
        return vEstado;
    }
    
    
    
    //propiedad toString

    @Override
    public String toString() {
        return "Categoria{" + "nombre=" + nombre + ", estado=" + estado + '}';
    }
    
}
