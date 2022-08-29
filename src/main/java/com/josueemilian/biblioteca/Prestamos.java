package com.josueemilian.biblioteca;

import java.util.Date;

public class Prestamos {
    private int NumeroPrestamo;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private Copia prestamoCopia;
    private Lectores prestamoLector;
    
    //Getters and Setters
 
    public int getNumeroPrestamo() {
        return NumeroPrestamo;
    }

    public void setNumeroPrestamo(int NumeroPrestamo) {
        this.NumeroPrestamo = NumeroPrestamo;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
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
    public Prestamos(int NumeroPrestamo, Date fechaPrestamo, Date fechaDevolucion, Copia prestamoCopia, Lectores prestamoLector) {
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
}
 