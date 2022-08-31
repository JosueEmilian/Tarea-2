package com.josueemilian.biblioteca;
import java.util.ArrayList;
public class Libros {

    private String nombre;
    private int anio;
    private String estado;
    private Categoria eategoriaLibro;
    private Editorial editorialLibro;
    //private Autor autorLibro;
    
    //creamos arraylist
    private ArrayList<Autor>AutoresLibro;
    
    //getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Categoria getEategoriaLibro() {
        return eategoriaLibro;
    }

    public void setEategoriaLibro(Categoria eategoriaLibro) {
        this.eategoriaLibro = eategoriaLibro;
    }

    public Editorial getEditorialLibro() {
        return editorialLibro;
    }

    public void setEditorialLibro(Editorial editorialLibro) {
        this.editorialLibro = editorialLibro;
    }

    public ArrayList<Autor> getAutoresLibro() {
        return AutoresLibro;
    }

    public void setAutoresLibro(ArrayList<Autor> AutoresLibro) {
        this.AutoresLibro = AutoresLibro;
    }
    
    //constructor vacio

    public Libros() {
    }
    
    //constructor

    public Libros(String nombre, int anio, String estado, Categoria eategoriaLibro, Editorial editorialLibro, ArrayList<Autor> AutoresLibro) {
        this.nombre = nombre;
        this.anio = anio;
        this.estado = estado;
        this.eategoriaLibro = eategoriaLibro;
        this.editorialLibro = editorialLibro;
        this.AutoresLibro = AutoresLibro;
    }
    

    //metodos
    public String consultarLibro() {
        String vEstado = "";
        return vEstado;
    }
    
    public int cambiarEstado(){
        return 0;
    }
    
    public String estadoLibro(){
        String vEstado = "";
        return vEstado;
    }
    
    
    //propiedad toString

    @Override
    public String toString() {
        return "nombre = " + nombre + ", anio = " + anio + ", estado = " + estado + ", Categoria = " + eategoriaLibro.getNombre() + ", Editorial = " + editorialLibro.getNombre() + ", Autor = " + AutoresLibro;
    }
    
}
