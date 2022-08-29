package com.josueemilian.biblioteca;

public class Copia {
    private int identificador;
    private String estado;
    private Libros copiaLibro;

    //getters and Setters
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Libros getCopiaLibro() {
        return copiaLibro;
    }

    public void setCopiaLibro(Libros copiaLibro) {
        this.copiaLibro = copiaLibro;
    }
    
    
    
    //constructor vacio
    public Copia() {
    }

    //constructor
    public Copia(int identificador, String estado, Libros copiaLibro) {
        this.identificador = identificador;
        this.estado = estado;
        this.copiaLibro = copiaLibro;
    }
    
    
    //metodos
    public String ConsultarEstado() {
        String vEstado = "";
        return vEstado;
    }
}
