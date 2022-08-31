package com.josueemilian.biblioteca;

import java.io.Serializable;

public class Prestamos implements Serializable{
    private int NumeroPrestamo;
    private String fechaPrestamo;
    private String fechaDevolucion;
    private Copia prestamoCopia;
    private Lectores prestamoLector;
    
    //Getters and Setters
    public int getNumeroPrestamo() {
        return NumeroPrestamo;
    }

    public void setNumeroPrestamo(int NumeroPrestamo) {
        this.NumeroPrestamo = NumeroPrestamo;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Copia getPrestamoCopia() {
        return prestamoCopia;
    }

    public void setPrestamoCopia(Copia prestamoCopia) {
        this.prestamoCopia = prestamoCopia;
    }

    public Lectores getPrestamoLector() {
        return prestamoLector;
    }

    public void setPrestamoLector(Lectores prestamoLector) {
        this.prestamoLector = prestamoLector;
    }
    
    //constructor vacio
    public Prestamos() {
    }
     
    //constructor
    public Prestamos(int NumeroPrestamo, String fechaPrestamo, String fechaDevolucion, Copia prestamoCopia, Lectores prestamoLector) {
        this.NumeroPrestamo = NumeroPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.prestamoCopia = prestamoCopia;
        this.prestamoLector = prestamoLector;
    }

    //metodos
    public String estadoPrestamos() {
        String vEstado = "";
        return vEstado;
    }
    
    
    //Propiedad to String

    @Override
    public String toString() {
        return "Numero de Prestamos = " + NumeroPrestamo + ", Fecha Prestamo = " + fechaPrestamo + ", Fecha Devolucion = " + fechaDevolucion;
    }
    
}
 