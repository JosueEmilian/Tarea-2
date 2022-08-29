package com.josueemilian.biblioteca;

public class Lectores {
    private int DPI;
    private String nombre;
    
    
    //Getters and Setters
    public int getDPI() {
        return DPI;
    }

    public void setDPI(int DPI) {
        this.DPI = DPI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    //constructor vacio
    public Lectores() {
    }
    
    //constructor

    public Lectores(int DPI, String nombre) {
        this.DPI = DPI;
        this.nombre = nombre;
    }
      
    
    //metodos
    public String EstadoLecto(){
        String vEstado = "";
        return vEstado;
    }
}
