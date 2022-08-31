package com.josueemilian.biblioteca;

import java.io.Serializable;


public class Multas implements Serializable{
    private int NumeroMulta;
    private String fechaMulta;
    private int Monto;
    private String Estado;
    private Lectores multaLector;
    
    //Getters and Setters
    public int getNumeroMulta() {
        return NumeroMulta;
    }

    public void setNumeroMulta(int NumeroMulta) {
        this.NumeroMulta = NumeroMulta;
    }

    public String getFechaMulta() {
        return fechaMulta;
    }

    public void setFechaMulta(String fechaMulta) {
        this.fechaMulta = fechaMulta;
    }

    public int getMonto() {
        return Monto;
    }

    public void setMonto(int Monto) {
        this.Monto = Monto;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Lectores getMultaLector() {
        return multaLector;
    }

    public void setMultaLector(Lectores multaLector) {
        this.multaLector = multaLector;
    }
    
    //constructor vacio
    public Multas() {
    }
 
    //constructor
    public Multas(int NumeroMulta, String fechaMulta, int Monto, String Estado, Lectores multaLector) {
        this.NumeroMulta = NumeroMulta;
        this.fechaMulta = fechaMulta;
        this.Monto = Monto;
        this.Estado = Estado;
        this.multaLector = multaLector;
    }

    //metodos
    public int pagoMulta(){
        return 0;
    }
    
    public String estadoMulta(){
        String vEstado = "";
        return vEstado;
    }
    
    //Propiedad to String

    @Override
    public String toString() {
        return "Numero de Multa = " + NumeroMulta + ", Fecha Multa=" + fechaMulta + ", Monto=" + Monto + ", Estado=" + Estado;
    }
    
    
}
